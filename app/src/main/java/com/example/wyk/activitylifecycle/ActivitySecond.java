package com.example.wyk.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {

    private TextView textview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String infoItent = getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHISYCAL);
//        String infoItent2 = getIntent().getStringExtra("sex");
//        Toast.makeText(ActivitySecond.this, infoItent, Toast.LENGTH_SHORT).show();
        textview = (TextView) findViewById(R.id.activity_second_text_view);
        textview.setText(infoItent);
    }
}
