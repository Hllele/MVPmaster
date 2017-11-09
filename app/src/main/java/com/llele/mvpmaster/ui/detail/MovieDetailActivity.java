package com.llele.mvpmaster.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.llele.mvpmaster.R;

public class MovieDetailActivity extends AppCompatActivity {

    private int id =-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        id = getIntent().getIntExtra("id",-1);

    }

}
