package com.example.wyk.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {

    private TextView mtextview;
    private EditText medittext;
    private Button mBackbutton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String infoItent = getIntent().getStringExtra(MainActivity.BOOK_NAME_OF_CATEGORY_PHISYCAL);
//        String infoItent2 = getIntent().getStringExtra("sex");
//        Toast.makeText(ActivitySecond.this, infoItent, Toast.LENGTH_SHORT).show();
        mtextview = (TextView) findViewById(R.id.activity_second_text_view);
        mtextview.setText(infoItent);

        medittext =(EditText)findViewById(R.id.activity_second_edit_text);
        mBackbutton =(Button)findViewById(R.id.activity_second_button);

        mBackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = medittext.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("back", name);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
