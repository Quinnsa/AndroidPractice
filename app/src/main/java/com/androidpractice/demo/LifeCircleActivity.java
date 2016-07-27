package com.androidpractice.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCircleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_circle);
        Log.d("lifecycle","onCreate");
    }

    protected void onStart(){
        super.onStart();
//        System.out.println("onStart");
        Log.d("lifecycle","onStart");
    }

    protected void onResume(){
        super.onResume();
//        System.out.println("onResume");
        Log.d("lifecycle","onResume");
    }

    protected void onPause(){
        super.onPause();
//        System.out.println("onPause");
        Log.d("lifecycle","onPause");
    }

    protected void onStop(){
        super.onStop();
//        System.out.println("onStop");
        Log.d("lifecycle","onStop");
    }

    protected void onDestroy(){
        super.onDestroy();
//        System.out.println("onDestroy");
        Log.d("lifecycle","onDestroy");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart");
    }
}
