package com.cangluxmt.httpsutil;

import com.cangluxmt.httpsutil.bean.NewList;
import com.cangluxmt.httpsutil.bean.NewType;
import com.cangluxmt.httpsutil.config.HttpURLConfig;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by XIEZHENBO on 2017/11/10 0010.
 * 网络请求实体
 */

public interface RetrofitService {
    //新闻分类接口 传入agentID
    @GET(HttpURLConfig.NEWTYPE_URL)
    Observable<BaseEntity<NewType>> getNewTypeData(
            @Query("agentId") int agentId
    );

    //新闻分类下对应的新闻
    @GET(HttpURLConfig.NEWLISTDATE_URL)
    Observable<BaseEntity<NewList>> getNewListData(
            @Query("agentId") int agentId,
            @Query("pageIndex") int pageIndex
    );


}
