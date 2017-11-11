package com.cangluxmt.httpsutil;

import com.cangluxmt.httpsutil.config.HttpURLConfig;
import com.cangluxmt.httpsutil.utils.InterceptorUtil;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by XIEZHENBO on 2017/11/10 0010.
 */

public class RetrofitFactory {

    private static RetrofitFactory mRetrofitFactory;

    private static RetrofitService retrofitService;


    private RetrofitFactory(){
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(HttpURLConfig.TIMEOUT, TimeUnit.SECONDS) //设置连接超时
                .readTimeout(HttpURLConfig.TIMEOUT, TimeUnit.SECONDS)    //读写限制
                .writeTimeout(HttpURLConfig.TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(InterceptorUtil.HeaderInterceptor())  // 添加通用的Header,传递额外信息
                .addInterceptor(InterceptorUtil.LogInterceptor())
                .build();
        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(HttpURLConfig.BASE_URL)
                //添加Gson转换器   可自定义转换格式
//                .addConverterFactory(GsonConverterFactory.create(buildGson()))
                .addConverterFactory(GsonConverterFactory.create())
                // 添加Retrofit到RxJava的转换器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mOkHttpClient)
                .build();
        //初始化
        retrofitService = mRetrofit.create(RetrofitService.class);
    }
    //获取工厂类实例
    public static RetrofitFactory getInstance(){
        if(mRetrofitFactory == null){
            synchronized (RetrofitFactory.class){
                if(mRetrofitFactory == null){
                    mRetrofitFactory = new RetrofitFactory();
                }
            }
        }
        return mRetrofitFactory;
    }
    //获取请求服务
    public RetrofitService rService(){
        return RetrofitFactory.getInstance().retrofitService;
    }
    //可自定义封装Gson转换实体
//    private static Gson buildGson() {
//        return new GsonBuilder()
//                .serializeNulls()
//                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
//                // 此处可以添加Gson 自定义TypeAdapter
//                .registerTypeAdapter(NewData.class, new NewDataAdapter())
//                .create();
//    }
}
