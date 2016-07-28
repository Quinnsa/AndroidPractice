package com.androidpractice.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class NextActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_next);
        findViewById(R.id.btnReturnResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et = (EditText) findViewById(R.id.etData);
                String content = et.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("data_return",content);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        et = (EditText) findViewById(R.id.etData);
        String content = et.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("data_return",content);
        setResult(RESULT_OK,intent);
        finish();
    }
}
