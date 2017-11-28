package com.llele.mvpmaster.ui.detail;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.githang.statusbar.StatusBarCompat;
import com.llele.mvpmaster.R;
import com.llele.mvpmaster.base.BaseActivity;
import com.llele.mvpmaster.bean.FilmmakersBean;
import com.llele.mvpmaster.bean.IntheatersBean;
import com.llele.mvpmaster.bean.MovieDetailBean;
import com.llele.mvpmaster.bean.TrailersPhotosBean;
import com.llele.mvpmaster.net.ApiService;
import com.llele.mvpmaster.ui.detail.presenter.MovieDetailPresenter;
import com.llele.mvpmaster.ui.detail.presenter.MovieDetailPresenterImp;
import com.llele.mvpmaster.ui.detail.view.MovieDetailView;
import com.llele.mvpmaster.ui.trailers.TrailersActivity;
//import com.llele.mvpmaster.widget.SmileLoadingView;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;


public class MovieDetailActivity extends BaseActivity implements MovieDetailView,View.OnClickListener{
    private static final int SHRINK_UP_STATE = 1;// 收起状态
    private static final int SPREAD_STATE = 2;// 展开状态
    private static int mState = SHRINK_UP_STATE;//默认收起状态
    private MaterialRatingBar ratingBar;
    private RecyclerView list_filmmakers,list_trailer_photos;
    private int id =-1;
    private static final String TAG = "MovieDetailActivity";
    private MovieDetailPresenter mPresenter;
    private ImageView cover_movieDetail;
    private int[] colors = new int[]{R.color.detail_color1,R.color.detail_color2,R.color.detail_color3,R.color.detail_color4,R.color.detail_color5};
    private LinearLayout ll_img,ll_title;
    private TextView name_movieDetail,des_movieDetail,back_title,share_title,title_title,rating_movieDetail,collectNum_movieDetail,summary;
    private TextView expand_summary;
    private List<FilmmakersBean> data = new ArrayList<>();
    private List<TrailersPhotosBean> TrailersPhotos = new ArrayList<>();
    private MyAdapter adapter;
    private MyAdapter1 adapter1;
    private MovieDetailBean mBean = null;

    @Override
    public int getLayoutId() {
        return R.layout.activity_movie_detail;
    }

    @Override
    public void initPresenter() {
        mPresenter = new MovieDetailPresenterImp(MovieDetailActivity.this);
    }

    @Override
    public void initView() {
        setSwipeBackEnable(true);

        Random r = new Random();
        int color = getColor(colors[r.nextInt(5)]);
        StatusBarCompat.setStatusBarColor(this,color);
        id = getIntent().getIntExtra("id",-1);
        ll_img = (LinearLayout)findViewById(R.id.ll_img);
        ll_title = (LinearLayout)findViewById(R.id.ll_title);
        cover_movieDetail = (ImageView)findViewById(R.id.cover_movieDetail);
        name_movieDetail = (TextView) findViewById(R.id.name_movieDetail);
        des_movieDetail = (TextView) findViewById(R.id.des_movieDetail);
        rating_movieDetail = (TextView) findViewById(R.id.rating_movieDetail);
        collectNum_movieDetail = (TextView) findViewById(R.id.collectNum_movieDetail);
        back_title = (TextView) findViewById(R.id.back_title);
        share_title = (TextView) findViewById(R.id.share_title);
        title_title = (TextView) findViewById(R.id.title_title);
        summary = (TextView) findViewById(R.id.summary_movieDetail);
        expand_summary = (TextView) findViewById(R.id.expand_summary);
        ratingBar = (MaterialRatingBar)findViewById(R.id.ratingBar_detail);
        list_filmmakers = (RecyclerView) findViewById(R.id.recyclerList_filmmakers);
        list_trailer_photos = (RecyclerView) findViewById(R.id.recyclerList_trailer_photos);
        back_title.setOnClickListener(this);
        share_title.setOnClickListener(this);
        ll_img.setBackgroundColor(color);
        ll_title.setBackgroundColor(color);
        expand_summary.setOnClickListener(this);
        mPresenter.loadData(id);

    }


    private StringBuilder des_detail= new StringBuilder();
    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    @Override
    public void addData(final MovieDetailBean bean) {
        mBean = bean;
        mHandler.sendEmptyMessage(3);
        try {
            Log.e(TAG, "addData: "+id );

            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <bean.directors.size();i++){
                        FilmmakersBean markers = new FilmmakersBean();
                        if (bean.directors.get(i).avatars != null) {
                            markers.setAvatarsBean(new FilmmakersBean.AvatarsBean(bean.directors.get(i).avatars.medium, bean.directors.get(i).avatars.large, bean.directors.get(i).avatars.medium));
                        }else {
                            markers.setAvatarsBean(new FilmmakersBean.AvatarsBean(null,null,null));
                        }
                        markers.setId(bean.directors.get(i).id);
                        markers.setName(bean.directors.get(i).name);
                        markers.setAlt(bean.directors.get(i).alt);
                        markers.setType("导演");
                        data.add(markers);
                    }

                    for (int a = 0; a <bean.casts.size();a++){
                        FilmmakersBean markers1 = new FilmmakersBean();
                        if (bean.casts.get(a).avatars != null) {
                            markers1.setAvatarsBean(new FilmmakersBean.AvatarsBean(bean.casts.get(a).avatars.medium, bean.casts.get(a).avatars.large, bean.casts.get(a).avatars.medium));
                        }else {
                            markers1.setAvatarsBean(new FilmmakersBean.AvatarsBean(null,null,null));
                        }
                        markers1.setId(bean.casts.get(a).id);
                        markers1.setName(bean.casts.get(a).name);
                        markers1.setAlt(bean.casts.get(a).alt);
                        markers1.setType("主演");
                        data.add(markers1);
                    }

                    for (int i = 0; i <bean.writers.size();i++) {
                        FilmmakersBean markers2 = new FilmmakersBean();
                        if (bean.writers.get(i).avatars != null ){
                            markers2.setAvatarsBean(new FilmmakersBean.AvatarsBean(bean.writers.get(i).avatars.medium, bean.writers.get(i).avatars.large, bean.writers.get(i).avatars.medium));
                        }else {
                            markers2.setAvatarsBean(new FilmmakersBean.AvatarsBean(null,null,null));
                        }
                        markers2.setId(bean.writers.get(i).id);
                        markers2.setName(bean.writers.get(i).name);
                        markers2.setAlt(bean.writers.get(i).alt);
                        markers2.setType("编剧");
                        data.add(markers2);
                    }
                    mHandler.sendEmptyMessage(1);
                }
            });

            if (bean.trailers.size()>0){
                for (int i = 0; i <1;i++){
                    TrailersPhotos.add(new TrailersPhotosBean(bean.trailers.get(i).medium,bean.trailers.get(i).resource_url+ApiService.APIKEY,"trailers"));
                }
            }
            if (bean.photos.size()>0){
                for (int i = 0; i <5 ;i++){
                    TrailersPhotos.add(new TrailersPhotosBean(bean.photos.get(i).image,"","photos"));
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

//        String url = "http://vt1.doubanio.com/201711210910/fe7440d1b278b52bc0c751c2e9e581a6/view/movie/M/302220375.mp4"+ApiService.APIKEY;
//        Log.e(TAG, "addData: duration =  "+getRingDuring(url) );
        mHandler.sendEmptyMessage(2);

    }


    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 1:
                    adapter = new MyAdapter(R.layout.item_us_box,data);
                    adapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                    list_filmmakers.setAdapter(adapter);
                    list_filmmakers.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
                    list_filmmakers.setItemAnimator(new DefaultItemAnimator());
                    break;
                case 2:
                    adapter1 = new MyAdapter1(R.layout.item_trailers_photos,TrailersPhotos);
                    adapter1.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
                    list_trailer_photos.setAdapter(adapter1);
                    list_trailer_photos.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
                    list_trailer_photos.setItemAnimator(new DefaultItemAnimator());
                    adapter1.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                            if (position ==0){
                                Intent intent = new Intent(mContext, TrailersActivity.class);
                                intent.putExtra("url",TrailersPhotos.get(position).getResource_url());
                                intent.putExtra("id",id);
                                startActivity(intent);
                            }
                        }
                    });
                    break;
                case 3:
                    try {
                        title_title.setText(mBean.title);
                        Glide.with(mContext).load(""+mBean.images.large).placeholder(getDrawable(R.drawable.celebrity_default)).into(cover_movieDetail);
                        name_movieDetail.setText(""+mBean.title);
                        if (mBean.genres.size() >0){
                            des_detail.append( "" + mBean.year + " / " + listToString(mBean.genres, " /  ") + "\n" + "原名：" + mBean.original_title + "\n" + "上映时间：" + mBean.mainland_pubdate + "(中国大陆)" + "\n");
                        }else {
                            des_detail.append("" + mBean.year + "\n" + "原名：" + mBean.original_title + "\n" + "上映时间：" + mBean.mainland_pubdate + "(中国大陆)" + "\n");
                        }
                        if (mBean.durations.size() >0 ){
                            des_detail.append(  "片长：" + mBean.durations.get(0));
                        }
                        des_movieDetail.setText(des_detail);
                        rating_movieDetail.setText(""+mBean.rating.average);
                        collectNum_movieDetail.setText(""+mBean.ratings_count+"人");
                        if (mBean.rating.average != 0){
                            ratingBar.setProgress((int) mBean.rating.average);
                        }
                        summary.setText(mBean.summary);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
            }
        }
    };


    public static String getRingDuring(String mUri){
        String duration=null;
        android.media.MediaMetadataRetriever mmr = new android.media.MediaMetadataRetriever();
        try {
            if (mUri != null) {
                HashMap<String, String> headers=null;
                if (headers == null) {
                    headers = new HashMap<String, String>();
                    headers.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 4.4.2; zh-CN; MW-KW-001 Build/JRO03C) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 UCBrowser/1.0.0.001 U4/0.8.0 Mobile Safari/533.1"); }
                mmr.setDataSource(mUri, headers);
            }
            duration = mmr.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_DURATION);
        }
        catch (Exception ex) {

        }
        finally {
            mmr.release();
        }
        Log.e("ryan","duration "+duration);
        return duration;
    }

    public String listToString(List<String> list, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(separator);
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_title:
                mPresenter = null;
                finish();
                break;
            case R.id.share_title:

                break;
            case R.id.expand_summary:
                switch (mState){
                    case SHRINK_UP_STATE:
                        summary.setMaxLines(Integer.MAX_VALUE);
                        summary.requestLayout();
                        expand_summary.setText("收起");
                        mState = SPREAD_STATE;
                        break;
                    case SPREAD_STATE:
                        summary.setMaxLines(3);
                        summary.requestLayout();
                        expand_summary.setText("展开");
                        mState = SHRINK_UP_STATE;
                        break;
                }
                break;
        }
    }


    private class MyAdapter extends BaseQuickAdapter<FilmmakersBean,BaseViewHolder> {

        public MyAdapter(@LayoutRes int layoutResId, @Nullable List<FilmmakersBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, FilmmakersBean item) {
            TextView tv = (TextView)helper.getView(R.id.ranking_usBox);
            tv.setVisibility(View.GONE);
            helper.setText(R.id.title_usBox,item.getName());
            Glide.with(mContext).load(item.getAvatarsBean().medium).placeholder(getDrawable(R.drawable.celebrity_default)).into((ImageView)helper.getView(R.id.cover_usBox));
            DecimalFormat df = new DecimalFormat("#.00");
            helper.setText(R.id.box_usBox,""+item.getType());
        }
    }


    private class MyAdapter1 extends BaseQuickAdapter<TrailersPhotosBean,BaseViewHolder> {

        public MyAdapter1(@LayoutRes int layoutResId, @Nullable List<TrailersPhotosBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, TrailersPhotosBean item) {
            TextView tv_icon_trailer_photos = (TextView)helper.getView(R.id.icon_trailer_photos);
//            TextView tv_duration_trailer_photos = (TextView)helper.getView(R.id.duration_trailer_photos);
            if (item.getType().equals("trailers")){
                tv_icon_trailer_photos.setVisibility(View.VISIBLE);
//                tv_duration_trailer_photos.setVisibility(View.VISIBLE);
//                tv_duration_trailer_photos.setText(""+Integer.valueOf(getRingDuring(item.getResource_url()))/1000/60 +":"+Integer.valueOf(getRingDuring(item.getResource_url()))/1000%60 );
            }else {
                tv_icon_trailer_photos.setVisibility(View.INVISIBLE);
//                tv_duration_trailer_photos.setVisibility(View.INVISIBLE);
            }
            Glide.with(mContext).load(item.getImg_url()+ApiService.APIKEY).placeholder(getDrawable(R.drawable.celebrity_default)).into((ImageView)helper.getView(R.id.cover_trailer_photos));

        }
    }

}
