package com.llele.mvpmaster.ui.comingSoon;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.llele.mvpmaster.R;
import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.ui.comingSoon.presenter.ComingSoonPresenter;
import com.llele.mvpmaster.ui.comingSoon.presenter.ComingSoonPresenterImp;
import com.llele.mvpmaster.ui.comingSoon.view.ComingSoonView;

import java.util.ArrayList;
import java.util.List;

/**
 * Author： huanglele on 2017/11/7.
 */

public class ComingSoonFragment extends Fragment implements ComingSoonView,SwipeRefreshLayout.OnRefreshListener{
    private static final String TAG = "ComingSoonFragment";
    private ComingSoonPresenter mPresenter;
    private RecyclerView recyclerList_comingSoon;
    private SwipeRefreshLayout refresh_comingSoon;
    private Context mContext;
    private List<ComingSoonBean.SubjectsBean> datas = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coming_soon,container,false);
        mContext = getActivity();
        mPresenter = new ComingSoonPresenterImp(ComingSoonFragment.this);
        mPresenter.loadData();
        recyclerList_comingSoon = (RecyclerView)view.findViewById(R.id.recyclerList_comingSoon);
        refresh_comingSoon = (SwipeRefreshLayout)view.findViewById(R.id.refresh_comingSoon);
        refresh_comingSoon.setColorSchemeColors(getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent));
        refresh_comingSoon.setDistanceToTriggerSync(300);
        refresh_comingSoon.setSize(SwipeRefreshLayout.DEFAULT);
        refresh_comingSoon.setOnRefreshListener(this);
        refresh_comingSoon.setRefreshing(true);
        return view;
    }

    @Override
    public void addData(ComingSoonBean bean) {
        refresh_comingSoon.setRefreshing(false);
        Log.e(TAG, "addData: "+bean.subjects.size() );
    }

    @Override
    public void onRefresh() {
        mPresenter.loadData();
    }

}
