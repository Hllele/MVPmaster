package com.llele.mvpmaster.ui.weekly.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.WeeklyBean;
import com.llele.mvpmaster.ui.us_box.USBoxFragment;
import com.llele.mvpmaster.ui.weekly.model.WeeklyModel;
import com.llele.mvpmaster.ui.weekly.model.WeeklyModelImp;
import com.llele.mvpmaster.ui.weekly.view.WeeklyView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/13.
 */

public class WeeklyPresenterImp implements WeeklyPresenter {
    private WeeklyView mView;
    private WeeklyModel mModel;
    private static final String TAG = "WeeklyPresenterImp";
    public WeeklyPresenterImp(USBoxFragment view) {
        this.mView=view;
        this.mModel = new WeeklyModelImp();
    }

    @Override
    public void loadData() {
        mModel.loadData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<WeeklyBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WeeklyBean value) {
                        mView.addData(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
