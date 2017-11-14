package com.llele.mvpmaster.ui.comingSoon;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.llele.mvpmaster.R;
import com.llele.mvpmaster.base.BaseFragment;
import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.ui.comingSoon.presenter.ComingSoonPresenter;
import com.llele.mvpmaster.ui.comingSoon.presenter.ComingSoonPresenterImp;
import com.llele.mvpmaster.ui.comingSoon.view.ComingSoonView;
import com.llele.mvpmaster.ui.detail.MovieDetailActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Author： huanglele on 2017/11/7.
 */

public class ComingSoonFragment extends BaseFragment implements ComingSoonView,SwipeRefreshLayout.OnRefreshListener,View.OnClickListener{
    private static final String TAG = "ComingSoonFragment";
    private ComingSoonPresenter mPresenter;
    private RecyclerView recyclerList_comingSoon;
    private SwipeRefreshLayout refresh_comingSoon;
    private Context mContext;
    private List<ComingSoonBean.SubjectsBean> data = new ArrayList<>();
    private MyAdapter adapter;
    private int currentPage = 1;
    private boolean isFirstLoad = true;
    private int maxCount =0;

/*
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coming_soon,container,false);
        mContext = getActivity();
        mPresenter = new ComingSoonPresenterImp(ComingSoonFragment.this);
        mPresenter.loadData(0,20);
        recyclerList_comingSoon = (RecyclerView)view.findViewById(R.id.recyclerList_comingSoon);
        refresh_comingSoon = (SwipeRefreshLayout)view.findViewById(R.id.refresh_comingSoon);
        refresh_comingSoon.setColorSchemeColors(getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent));
        refresh_comingSoon.setDistanceToTriggerSync(250);
        refresh_comingSoon.setSize(SwipeRefreshLayout.DEFAULT);
        refresh_comingSoon.setOnRefreshListener(this);
        refresh_comingSoon.setRefreshing(true);


        return view;
    }*/

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_coming_soon;
    }

    @Override
    protected void initViews(View view) {
        mContext = getActivity();
        mPresenter = new ComingSoonPresenterImp(ComingSoonFragment.this);

        recyclerList_comingSoon = (RecyclerView)view.findViewById(R.id.recyclerList_comingSoon);
        refresh_comingSoon = (SwipeRefreshLayout)view.findViewById(R.id.refresh_comingSoon);
        refresh_comingSoon.setColorSchemeColors(getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent));
        refresh_comingSoon.setDistanceToTriggerSync(250);
        refresh_comingSoon.setSize(SwipeRefreshLayout.DEFAULT);
        refresh_comingSoon.setOnRefreshListener(this);
        refresh_comingSoon.setRefreshing(true);
    }

    @Override
    protected void onFirstUserVisible() {
        mPresenter.loadData(0,20);
    }

    @Override
    protected void onUserVisible() {

    }

    @Override
    protected void onUserInvisible() {

    }

    @Override
    protected void DestroyViewAndThing() {

    }

    @Override
    public void addData(ComingSoonBean bean) {
        maxCount = bean.total;
        refresh_comingSoon.setRefreshing(false);
        if (isFirstLoad) {
            data.addAll(bean.subjects);
            adapter = new MyAdapter(R.layout.item_in_theaters, bean.subjects);
            adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
            recyclerList_comingSoon.setAdapter(adapter);
            recyclerList_comingSoon.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
            recyclerList_comingSoon.setItemAnimator(new DefaultItemAnimator());
            refresh_comingSoon.setRefreshing(false);
            isFirstLoad = false;
        }else {
            data.addAll(bean.subjects);
            adapter.addData(bean.subjects);
            adapter.notifyDataSetChanged();
            adapter.loadMoreComplete();
        }


        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra("id", data.get(position).id);
                startActivity(intent);
            }
        });
        mHandler.sendEmptyMessage(1);

    }
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    adapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
                        @Override
                        public void onLoadMoreRequested() {
                            currentPage=currentPage+20;
                            if (currentPage < maxCount) {
                                mPresenter.loadData(currentPage, 50);
                            }else {
                                adapter.loadMoreEnd();
                            }
                        }
                    });
                    break;
            }
        }
    };

    @Override
    public void onRefresh() {
        mPresenter.loadData(0,20);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

    private class MyAdapter extends BaseQuickAdapter<ComingSoonBean.SubjectsBean,BaseViewHolder> {

        public MyAdapter(@LayoutRes int layoutResId, @Nullable List<ComingSoonBean.SubjectsBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, ComingSoonBean.SubjectsBean item) {
            String text = "观众评分  "+item.rating.average;
            SpannableStringBuilder builder = new SpannableStringBuilder(text);
            ForegroundColorSpan span = new ForegroundColorSpan(0xffCD853F);
            builder.setSpan(span,6,text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            Glide.with(mContext).load(item.images.medium).into((ImageView) helper.getView(R.id.cover_in_theaters));
            helper.setText(R.id.rating_in_theaters,builder);
            helper.setText(R.id.name_in_theaters,item.title);
            if (item.directors.size()>0){
                helper.setText(R.id.director_in_theaters,"导演："+item.directors.get(0).name);
            }else {
                helper.setText(R.id.director_in_theaters,"");
            }
            if (item.casts.size()>0){
                helper.setText(R.id.casts_in_theaters,"主演："+listToString(item.casts,"/ "));
            }else {
                helper.setText(R.id.casts_in_theaters,"");
            }

            TextView tv = helper.getView(R.id.toOrder_in_theaters);
            tv.setText("想看");
            tv.setBackground(getResources().getDrawable(R.drawable.bg_presale));
            TextView tv1 = helper.getView(R.id.collectNum_in_theaters);
            tv1.setTextColor(getResources().getColor(R.color.lightsalmon));
            if (item.collect_count >10000){
                double a = item.collect_count;
                DecimalFormat df = new DecimalFormat("#.0");
                helper.setText(R.id.collectNum_in_theaters,df.format(a/10000)+"万人想看");
            }else {
                helper.setText(R.id.collectNum_in_theaters,item.collect_count+"人想看");
            }

        }
    }



    public String listToString(List<ComingSoonBean.SubjectsBean.CastsBean> list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).name).append(separator);
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }


}
