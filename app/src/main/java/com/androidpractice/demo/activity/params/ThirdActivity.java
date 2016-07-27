package com.androidpractice.demo.activity.params;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidpractice.demo.R;

public class ThirdActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = (TextView) findViewById(R.id.tvBundleInfo);
        Intent i = getIntent();
        Bundle data = i.getBundleExtra("data");
        tv.setText(String.format("name=%s,age=%d,job=%s",data.getString("name"),data.getInt("age"),data.getString("job","Developer")));
    }
}
