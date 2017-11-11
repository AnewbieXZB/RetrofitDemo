package com.cangluxmt.httpsutil;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * BaseObserver
 * Created by jaycee on 2017/6/23.
 */
public abstract class BaseObserver<T> implements Observer<BaseEntity<T>> {

    private static final String TAG = "BaseObserver";
    private Context mContext;

    protected BaseObserver(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override
    public void onSubscribe(Disposable d) {
        Log.e(TAG, "---------onSubscribe:----------");
    }

    @Override
    public void onNext(BaseEntity<T> value) {
        if (value.isSuccess()) {
            Log.d(TAG,value.toString());
            T t = value.getData();
            onHandleSuccess(t);
        } else {
            onHandleError(value.getMessage());
        }
    }

    @Override
    public void onError(Throwable e) {
        Log.e(TAG, "onError:" + e.toString());
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "----------onComplete----------");
    }

    protected abstract void onHandleSuccess(T t);

    protected void onHandleError(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
