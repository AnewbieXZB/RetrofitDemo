package com.cangluxmt.httpsutil.utils;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Administrator on 2017/11/10 0010.
 * 拦截工具类
 */

public class InterceptorUtil {
    public static String TAG = "----";

    //日志拦截器
    public static HttpLoggingInterceptor LogInterceptor() {
        return new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.w(TAG, "log:" + message);
            }
        }).setLevel(HttpLoggingInterceptor.Level.BODY);
    }

    public static Interceptor HeaderInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

//                Request mRequest = chain.request();

//                return chain.proceed(mRequest);

                //在这里你可以做一些想做的事,比如token失效时,重新获取token

                //或者添加header等等
                Request.Builder builder = chain.request().newBuilder();
                // 替换为自己的token
//                    builder.addHeader("token", "123");
                return chain.proceed(builder.build());

            }
        };

    }
}
