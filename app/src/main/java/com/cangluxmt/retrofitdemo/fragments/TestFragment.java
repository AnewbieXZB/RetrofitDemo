package com.cangluxmt.retrofitdemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cangluxmt.retrofitdemo.R;

/**
 * Created by XIEZHENBO on 2017/11/11 0011 下午 13:55.
 */

public class TestFragment extends Fragment {

    private String title;

    public static TestFragment getInstance(String ctitle){

        TestFragment  tfragment = new TestFragment();
        tfragment.title = ctitle;


        return tfragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.testfragment, null);
        TextView card_title_tv = (TextView) v.findViewById(R.id.testf_tv);
        card_title_tv.setText(title);

        return v;
    }
}
