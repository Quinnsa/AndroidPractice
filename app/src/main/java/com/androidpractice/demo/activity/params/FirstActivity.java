package com.androidpractice.demo.activity.params;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidpractice.demo.R;
import com.androidpractice.demo.activity.domain.User;
import com.androidpractice.demo.activity.domain.User2;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.btnPutStringToSecondAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,SecondActivity.class);
                i.putExtra("data","hello world");
                startActivity(i);
            }
        });

        findViewById(R.id.btnPutBundleToSecondAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,ThirdActivity.class);
                Bundle b = new Bundle();
                b.putString("name","guoxq");
                b.putInt("age",27);
                i.putExtra("data",b);
                startActivity(i);
            }
        });

        findViewById(R.id.btnPutUserToFourthAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,FourthActivity.class);
                i.putExtra("user",new User("guoxq",27));
                startActivity(i);
            }
        });

        findViewById(R.id.btnPutUserToFifthAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstActivity.this,FifthActivity.class);
                i.putExtra("user",new User2("guo",28));
                startActivity(i);
            }
        });
    }
}
