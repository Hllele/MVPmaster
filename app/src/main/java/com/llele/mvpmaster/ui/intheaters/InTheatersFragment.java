package com.llele.mvpmaster.ui.intheaters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
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
import com.llele.mvpmaster.bean.IntheatersBean;
import com.llele.mvpmaster.ui.detail.MovieDetailActivity;
import com.llele.mvpmaster.ui.intheaters.presenter.InTheatersPresenter;
import com.llele.mvpmaster.ui.intheaters.presenter.InTheatersPresenterImp;
import com.llele.mvpmaster.ui.intheaters.view.InTheatersView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Author： huanglele on 2017/11/7.
 */

public class InTheatersFragment extends Fragment implements InTheatersView,SwipeRefreshLayout.OnRefreshListener{

    private RecyclerView mRecyclerView;

    InTheatersPresenter p ;
    private Context context;
    private SwipeRefreshLayout refresh_in_theaters;
    private MyAdapter adapter;
    private List<IntheatersBean.SubjectsBean> datas = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intheaters,container,false);
        context = getActivity();
        p = new InTheatersPresenterImp(InTheatersFragment.this);
        p.loadData("苏州");
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerList_inTheaters);
        refresh_in_theaters = (SwipeRefreshLayout)view.findViewById(R.id.refresh_in_theaters);
        refresh_in_theaters.setColorSchemeColors(getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorAccent));
        refresh_in_theaters.setDistanceToTriggerSync(300);
        refresh_in_theaters.setSize(SwipeRefreshLayout.DEFAULT);
        refresh_in_theaters.setOnRefreshListener(this);
        refresh_in_theaters.setRefreshing(true);

        return view;
    }



    @Override
    public void addData(IntheatersBean bean) {
        datas.clear();
        datas.addAll(bean.subjects);
        adapter = new MyAdapter(R.layout.item_in_theaters,bean.subjects);
        adapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        refresh_in_theaters.setRefreshing(false);
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra("id",datas.get(position).id);
                startActivity(intent);
            }
        });
    }


    public String listToString(List<IntheatersBean.SubjectsBean.CastsBean> list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).name).append(separator);
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    @Override
    public void onRefresh() {
        p.loadData("苏州");
        adapter.notifyDataSetChanged();
    }

    private class MyAdapter extends BaseQuickAdapter<IntheatersBean.SubjectsBean,BaseViewHolder>{

        public MyAdapter(@LayoutRes int layoutResId, @Nullable List<IntheatersBean.SubjectsBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, IntheatersBean.SubjectsBean item) {
            String text = "观众评分  "+item.rating.average;
            SpannableStringBuilder builder = new SpannableStringBuilder(text);
            ForegroundColorSpan span = new ForegroundColorSpan(0xffCD853F);
            builder.setSpan(span,6,text.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            Glide.with(context).load(item.images.medium).into((ImageView) helper.getView(R.id.cover_in_theaters));
            helper.setText(R.id.rating_in_theaters,builder);
            helper.setText(R.id.name_in_theaters,item.title);
            helper.setText(R.id.director_in_theaters,"导演："+item.directors.get(0).name);
            helper.setText(R.id.casts_in_theaters,"主演："+listToString(item.casts,"/ "));
            if (item.collect_count >10000){
                double a = item.collect_count;
                DecimalFormat df = new DecimalFormat("#.0");
                helper.setText(R.id.collectNum_in_theaters,df.format(a/10000)+"万人看过");
            }else {
                helper.setText(R.id.collectNum_in_theaters,item.collect_count+"人看过");
            }

        }
    }


}
