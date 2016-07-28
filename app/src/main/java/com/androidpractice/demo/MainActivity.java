package com.androidpractice.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.androidpractice.demo.activity.lifecycle.ALifeCycleActivity;
import com.androidpractice.demo.activity.params.FirstActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
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

        findViewById(R.id.btnDisplayToast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"显示toast",Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.btnFinishAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.btnYsIntent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.androidpractice.demo.intent.Action_START");
                intent.addCategory("com.androidpractice.demo.intent.MY_CATEGORY");
                startActivity(intent);
            }
        });

        findViewById(R.id.btnOpenUri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);//ACTION_VIEW 安卓Activity内置动作
                intent.setData(Uri.parse("http://www.baidu.com"));//Uri.parse()方法将网址字符串解析成一个Uri对象
                startActivity(intent);
            }
        });

        findViewById(R.id.btnOpenUri2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        findViewById(R.id.btnCallTo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

    }
}
