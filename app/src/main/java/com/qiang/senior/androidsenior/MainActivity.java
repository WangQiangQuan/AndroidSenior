package com.qiang.senior.androidsenior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qiang.senior.androidsenior.chapter1.DispatchEventActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent mIntent = new Intent(this, DispatchEventActivity.class);
        this.startActivity(mIntent);
    }
}
