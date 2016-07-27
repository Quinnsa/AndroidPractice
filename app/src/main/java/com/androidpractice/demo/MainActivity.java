package com.androidpractice.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidpractice.demo.activity.lifecycle.ALifeCycleActivity;
import com.androidpractice.demo.activity.params.FirstActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.my_layout);

        findViewById(R.id.btnStartAnotherActivity).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
//                startActivity(new Intent(MainActivity.this, AnotherActivity.class));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://blogme.ruierhd.com")));
            }
        });

        findViewById(R.id.btnShowActivityLifeCycle).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this,ALifeCycleActivity.class));
            }
        });

        findViewById(R.id.btnPutParamsBetweenAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });
    }
}
