package com.androidpractice.demo.activity.params;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidpractice.demo.R;

public class SecondActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        tv = (TextView) findViewById(R.id.tvDisplayAParams);
        tv.setText(i.getStringExtra("data"));
    }
}
