package com.simple.mvvm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normalClick(View view) {
        Intent intent = new Intent(MainActivity.this,MVCActivity.class);
        startActivity(intent);
    }

    public void mvvmClick(View view) {
        Intent intent = new Intent(MainActivity.this,MVVMActivity.class);
        startActivity(intent);
    }
}
