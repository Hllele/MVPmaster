package com.llele.mvpmaster.ui.us_box.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.USBoxBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/13.
 */

public class USBoxModelImp implements USBoxModel {
    @Override
    public Observable<USBoxBean> loadData() {
        RetrofitClient retrofitClient = RetrofitClient.getInstance(MyApplication.getContext());
        return retrofitClient.mRequestService.getUSBoxData();
    }
}
