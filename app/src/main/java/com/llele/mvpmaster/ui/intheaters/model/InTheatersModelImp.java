package com.llele.mvpmaster.ui.intheaters.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.IntheatersBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/7.
 */

public class InTheatersModelImp implements InTheatersModel {

    @Override
    public Observable<IntheatersBean> loadData(String city) {
        RetrofitClient retrofitClient = RetrofitClient.getInstance(MyApplication.getContext());
        return retrofitClient.mRequestService.getInTheatersData(city);
    }
}
