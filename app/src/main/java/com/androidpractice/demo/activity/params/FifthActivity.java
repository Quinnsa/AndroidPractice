package com.androidpractice.demo.activity.params;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidpractice.demo.R;
import com.androidpractice.demo.activity.domain.User2;

public class FifthActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        tv = (TextView) findViewById(R.id.tvShowUserInfo2);
        Intent i = getIntent();
        User2 user = (User2) i.getParcelableExtra("user");
        tv.setText(String.format("USER2 info name=%s,age=%d",user.getName(),user.getAge()));
    }
}
