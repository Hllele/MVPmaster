package com.llele.mvpmaster.ui.us_box.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.USBoxBean;
import com.llele.mvpmaster.ui.us_box.USBoxFragment;
import com.llele.mvpmaster.ui.us_box.model.USBoxModel;
import com.llele.mvpmaster.ui.us_box.model.USBoxModelImp;
import com.llele.mvpmaster.ui.us_box.view.USBoxView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/13.
 */

public class USBoxPresenterImp implements USBoxPresenter {
    private static final String TAG = "WeeklyPresenterImp";
    private USBoxModel mModel;
    private USBoxView mView;
    public USBoxPresenterImp(USBoxFragment view) {
        this.mView = view;
        mModel = new USBoxModelImp();
    }

    @Override
    public void loadData() {
        mModel.loadData()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<USBoxBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(USBoxBean value) {
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
