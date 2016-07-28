package com.androidpractice.activitybest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first);
        findViewById(R.id.btnToSecondAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(i);
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
            }
        });
    }
}
