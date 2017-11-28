package com.llele.mvpmaster.ui.weekly.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.WeeklyBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/13.
 */

public class WeeklyModelImp implements WeeklyModel {
    @Override
    public Observable<WeeklyBean> loadData() {
        RetrofitClient retrofitClient = RetrofitClient.getInstance(MyApplication.getContext());
        return retrofitClient.mRequestService.getWeeklyData();
    }
}
