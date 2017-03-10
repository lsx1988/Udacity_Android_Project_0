package com.bignerdranch.android.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
        Button button = (Button) view;
        String appName = button.getText().toString();
        Toast.makeText(MainActivity.this,
                "启动应用: " + appName,
                Toast.LENGTH_SHORT).show();
    }
}
