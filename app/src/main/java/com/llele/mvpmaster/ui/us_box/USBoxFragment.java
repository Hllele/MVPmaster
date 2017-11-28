package com.llele.mvpmaster.ui.us_box;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.llele.mvpmaster.R;
import com.llele.mvpmaster.base.BaseFragment;
import com.llele.mvpmaster.bean.USBoxBean;
import com.llele.mvpmaster.bean.WeeklyBean;
import com.llele.mvpmaster.ui.detail.MovieDetailActivity;
import com.llele.mvpmaster.ui.us_box.presenter.USBoxPresenter;
import com.llele.mvpmaster.ui.us_box.presenter.USBoxPresenterImp;
import com.llele.mvpmaster.ui.us_box.view.USBoxView;
import com.llele.mvpmaster.ui.weekly.presenter.WeeklyPresenter;
import com.llele.mvpmaster.ui.weekly.presenter.WeeklyPresenterImp;
import com.llele.mvpmaster.ui.weekly.view.WeeklyView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Author： huanglele on 2017/11/13.
 */

public class USBoxFragment extends BaseFragment implements USBoxView,WeeklyView{
    private static final String TAG = "WeeklyFragment";
    private USBoxPresenter mPresenter;
    private WeeklyPresenter mWeeklyPresenter;
    private RecyclerView recyclerList_us_box,recyclerList_weekly;
    private Context mContext;
    private MyAdapter mAdapter;
    private MyAdapter1 mAdapter1;
    private List<USBoxBean.SubjectsBean> data = new ArrayList<>();
    private List<WeeklyBean.SubjectsBean> data2 = new ArrayList<>();
    private TextView tv_rankingDate;
    private String rankingDate="";
    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_us_box;
    }

    @Override
    protected void initViews(View view) {
        mPresenter = new USBoxPresenterImp(USBoxFragment.this);
        mWeeklyPresenter = new WeeklyPresenterImp(USBoxFragment.this);
        recyclerList_us_box = (RecyclerView)view.findViewById(R.id.recyclerList_us_box);
        recyclerList_weekly = (RecyclerView)view.findViewById(R.id.recyclerList_weekly);
        mContext = getActivity();
        tv_rankingDate = (TextView)view.findViewById(R.id.rankingTitle_usBox);
    }

    @Override
    protected void onFirstUserVisible() {
        mPresenter.loadData();
        mWeeklyPresenter.loadData();
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
    public void addData(USBoxBean bean) {
        rankingDate = bean.date;
        mHandler.sendEmptyMessage(0);
        data.addAll(bean.subjects);
        mAdapter = new MyAdapter(R.layout.item_us_box, bean.subjects);
        mAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        recyclerList_us_box.setAdapter(mAdapter);
        recyclerList_us_box.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerList_us_box.setItemAnimator(new DefaultItemAnimator());
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra("id", Integer.valueOf(data.get(position).subject.id));
                startActivity(intent);
            }
        });
    }

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 0:
                    tv_rankingDate.setText(rankingDate+"北美票房榜");
                    break;
            }
        }
    };

    @Override
    public void addData(WeeklyBean bean) {
        data2.addAll(bean.subjects);
        mAdapter1 = new MyAdapter1(R.layout.item_us_box, bean.subjects);
        mAdapter1.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        recyclerList_weekly.setAdapter(mAdapter1);
        recyclerList_weekly.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyclerList_weekly.setItemAnimator(new DefaultItemAnimator());
        mAdapter1.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
                intent.putExtra("id", Integer.valueOf(data2.get(position).subject.id));
                startActivity(intent);
            }
        });
    }

    private class MyAdapter extends BaseQuickAdapter<USBoxBean.SubjectsBean,BaseViewHolder> {

        public MyAdapter(@LayoutRes int layoutResId, @Nullable List<USBoxBean.SubjectsBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, USBoxBean.SubjectsBean item) {
//            Log.e(TAG, "convert: "+helper.getItemId()+"==="+helper.getAdapterPosition()+"=="+helper.getLayoutPosition() );
            TextView tv = (TextView)helper.getView(R.id.ranking_usBox);
            helper.setText(R.id.ranking_usBox,""+item.rank);
            switch (helper.getAdapterPosition()){
                case 0:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_1));
                    break;
                case 1:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_2));
                    break;
                case 2:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_3));
                    break;
                default:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_4));
                    break;
            }
            helper.setText(R.id.title_usBox,item.subject.title);
            Glide.with(mContext).load(item.subject.images.medium).placeholder(mContext.getDrawable(R.drawable.celebrity_default)).into((ImageView)helper.getView(R.id.cover_usBox));
            DecimalFormat df = new DecimalFormat("#.00");
            helper.setText(R.id.box_usBox,df.format(((double) (item.box))/10000)+"万");

        }
    }

    private class MyAdapter1 extends BaseQuickAdapter<WeeklyBean.SubjectsBean,BaseViewHolder> {

        public MyAdapter1(@LayoutRes int layoutResId, @Nullable List<WeeklyBean.SubjectsBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, WeeklyBean.SubjectsBean item) {
            TextView tv = (TextView)helper.getView(R.id.ranking_usBox);
            helper.setText(R.id.ranking_usBox,""+item.rank);
            switch (helper.getAdapterPosition()){
                case 0:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_1));
                    break;
                case 1:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_2));
                    break;
                case 2:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_3));
                    break;
                default:
                    tv.setBackgroundColor(getResources().getColor(R.color.rating_4));
                    break;
            }
            helper.setText(R.id.title_usBox,item.subject.title);
            Glide.with(mContext).load(item.subject.images.medium).placeholder(mContext.getDrawable(R.drawable.celebrity_default)).into((ImageView)helper.getView(R.id.cover_usBox));
            helper.setText(R.id.box_usBox,""+item.subject.rating.average+"分");
        }
    }
}
