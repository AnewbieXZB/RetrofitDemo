package com.cangluxmt.httpsutil;

import com.google.gson.annotations.SerializedName;

/**
 * Created by XIEZHENBO on 2017/11/10 0010 下午 15:36.
 * 服务器通用返回数据格式
 */

public class BaseEntity<E> {
    //避免驼峰式命名和下划线变量命名转换冲突
    @SerializedName("success")
    private boolean success;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private E data;

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
