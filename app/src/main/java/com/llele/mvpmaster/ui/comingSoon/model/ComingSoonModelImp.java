package com.llele.mvpmaster.ui.comingSoon.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/8.
 */

public class ComingSoonModelImp implements ComingSoonModel {
    @Override
    public Observable<ComingSoonBean> loadData(int start,int count) {
        RetrofitClient retrofitClient = RetrofitClient.getInstance(MyApplication.getContext());
        return retrofitClient.mRequestService.getComingSoonData(start, count);
    }
}
