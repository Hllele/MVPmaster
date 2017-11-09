package com.llele.mvpmaster.ui.intheaters.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.IntheatersBean;
import com.llele.mvpmaster.ui.intheaters.InTheatersFragment;
import com.llele.mvpmaster.ui.intheaters.model.InTheatersModel;
import com.llele.mvpmaster.ui.intheaters.model.InTheatersModelImp;
import com.llele.mvpmaster.ui.intheaters.view.InTheatersView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/7.
 */

public class InTheatersPresenterImp implements InTheatersPresenter {
    InTheatersModel mModel;
    InTheatersView mView;

    public InTheatersPresenterImp(InTheatersFragment view) {
        mModel = new InTheatersModelImp();
        mView = view;
    }

    @Override
    public void loadData(String city) {
        mModel.loadData(city)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<IntheatersBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(IntheatersBean value) {
                            mView.addData(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("TAG", "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
