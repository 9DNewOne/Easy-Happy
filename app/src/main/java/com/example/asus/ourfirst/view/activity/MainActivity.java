package com.example.asus.ourfirst.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.asus.ourfirst.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("", "onCreate: ");
        setContentView(R.layout.activity_main);

    }
}
