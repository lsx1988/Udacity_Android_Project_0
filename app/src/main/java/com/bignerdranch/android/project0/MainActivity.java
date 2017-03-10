package com.bignerdranch.android.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMovies = null;
    private Button btnStock = null;
    private Button btnReader = null;
    private Button btnNews = null;
    private Button btnProject = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMovies = (Button) findViewById(R.id.btn_movies);
        btnMovies.setOnClickListener(this);
        btnStock = (Button) findViewById(R.id.btn_stock);
        btnStock.setOnClickListener(this);
        btnReader = (Button) findViewById(R.id.btn_reader);
        btnReader.setOnClickListener(this);
        btnNews = (Button) findViewById(R.id.btn_news);
        btnNews.setOnClickListener(this);
        btnProject = (Button) findViewById(R.id.btn_project);
        btnProject.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_movies:
                Toast.makeText(MainActivity.this,
                        "启动应用: " + btnMovies.getText(),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_stock:
                Toast.makeText(MainActivity.this,
                        "启动应用: " + btnStock.getText(),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_reader:
                Toast.makeText(MainActivity.this,
                        "启动应用: " + btnReader.getText(),
                        Toast.LENGTH_SHORT).show();
            case R.id.btn_news:
                Toast.makeText(MainActivity.this,
                        "启动应用: " + btnNews.getText(),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_project:
                Toast.makeText(MainActivity.this,
                        "启动应用: " + btnProject.getText(),
                        Toast.LENGTH_SHORT).show();
        }
    }
}
