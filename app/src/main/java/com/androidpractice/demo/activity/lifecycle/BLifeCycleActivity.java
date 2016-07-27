package com.androidpractice.demo.activity.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androidpractice.demo.R;

public class BLifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blife_circle);
        Log.d("lifecycle","BonCreate");
    }

    protected void onStart(){
        super.onStart();
//        System.out.println("onStart");
        Log.d("lifecycle","BonStart");
    }

    protected void onResume(){
        super.onResume();
//        System.out.println("onResume");
        Log.d("lifecycle","BonResume");
    }

    protected void onPause(){
        super.onPause();
//        System.out.println("onPause");
        Log.d("lifecycle","BonPause");
    }

    protected void onStop(){
        super.onStop();
//        System.out.println("onStop");
        Log.d("lifecycle","BonStop");
    }

    protected void onDestroy(){
        super.onDestroy();
//        System.out.println("onDestroy");
        Log.d("lifecycle","BonDestroy");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.d("lifecycle","BonRestart");
    }
}
