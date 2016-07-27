package com.androidpractice.demo.activity.lifecycle;

import android.app.AliasActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.androidpractice.demo.R;

public class ALifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_circle);
        Log.d("lifecycle","onCreate");

        findViewById(R.id.btnStartBActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ALifeCycleActivity.this,BLifeCycleActivity.class));
            }
        });
    }

    protected void onStart(){
        super.onStart();
//        System.out.println("onStart");
        Log.d("lifecycle","AonStart");
    }

    protected void onResume(){
        super.onResume();
//        System.out.println("onResume");
        Log.d("lifecycle","AonResume");
    }

    protected void onPause(){
        super.onPause();
//        System.out.println("onPause");
        Log.d("lifecycle","AonPause");
    }

    protected void onStop(){
        super.onStop();
//        System.out.println("onStop");
        Log.d("lifecycle","AonStop");
    }

    protected void onDestroy(){
        super.onDestroy();
//        System.out.println("onDestroy");
        Log.d("lifecycle","AonDestroy");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.d("lifecycle","AonRestart");
    }
}
