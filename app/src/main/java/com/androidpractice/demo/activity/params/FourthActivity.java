package com.androidpractice.demo.activity.params;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androidpractice.demo.R;
import com.androidpractice.demo.activity.domain.User;

public class FourthActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv = (TextView)findViewById(R.id.tvShowUserInfo1);
        Intent i = getIntent();
        User user = (User) i.getSerializableExtra("user");
        tv.setText(String.format("UserInfo1 name=%s,age=%d",user.getName(),user.getAge()));
    }
}
