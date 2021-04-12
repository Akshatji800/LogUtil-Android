package com.akshatji.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.akshatji.logutil.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("yguyhgg");
    }
}