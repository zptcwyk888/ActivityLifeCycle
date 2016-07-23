package com.example.wyk.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String infoItent = getIntent().getStringExtra("name");
        //String infoItent2 = getIntent().getStringExtra("sex");
        Toast.makeText(ActivitySecond.this, infoItent, Toast.LENGTH_SHORT).show();
    }
}
