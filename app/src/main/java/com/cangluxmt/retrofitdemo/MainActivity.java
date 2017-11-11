package com.cangluxmt.retrofitdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cangluxmt.common.base.BaseActivity;
import com.cangluxmt.httpsutil.BaseEntity;
import com.cangluxmt.httpsutil.BaseObserver;
import com.cangluxmt.httpsutil.RetrofitFactory;
import com.cangluxmt.httpsutil.bean.NewType;
import com.cangluxmt.httpsutil.config.HttpURLConfig;
import com.cangluxmt.retrofitdemo.fragments.TestFragment;
import com.flyco.tablayout.SlidingTabLayout;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

/**
 * Created by XIEZHENBO on 2017/11/10 0010 下午 17:04.
 */
public class MainActivity extends BaseActivity {
    //上下文对象
    private Context mContext = this;
    //碎片集合
    private ArrayList<Fragment> mFragments = new ArrayList<Fragment>();
    //数据
    private NewType newType;
    //标题数据
    private List<String> title_Str = new ArrayList<String>();
    //viewPager
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getNewData();
    }
    public void initView(){
        //初始化viewPage
        if(newType==null){
            return;
        }
        Log.d("BaseObserver","进来了"+newType.getNewsType().size());
        for ( NewType.NewsTypeBean newsTypeBean:newType.getNewsType()){
            TestFragment fragment = TestFragment.getInstance(newsTypeBean.getName());
            mFragments.add(fragment);
            Log.d("BaseObserver",newsTypeBean.getName());
            title_Str.add(newsTypeBean.getName());
        }
        vp = (ViewPager)findViewById(R.id.vp);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return newType.getNewsType().size();
            }

            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return title_Str.get(position);
            }
        });

        SlidingTabLayout slt1 = (SlidingTabLayout) findViewById(R.id.tab1);
        slt1.setViewPager(vp);
    }

    public void getNewData(){
        //被观察者
        Observable<BaseEntity<NewType>> observable = RetrofitFactory.getInstance()
                .rService()
                .getNewTypeData(HttpURLConfig.AGENT_ID);
        observable.compose(compose(this.<BaseEntity<NewType>>bindToLifecycle()))
                .subscribe(new BaseObserver<NewType>(MainActivity.this) {
                    @Override
                    protected void onHandleSuccess(NewType newType) {
                        Log.d("newtype",newType.toString());
                        MainActivity.this.newType =newType;
                        MainActivity.this.initView();
                    }
                });
    }


}
