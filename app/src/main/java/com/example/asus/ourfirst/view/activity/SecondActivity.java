package com.example.asus.ourfirst.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.asus.ourfirst.R;

  /*
  *  做登录操作的activity
  *
  * */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

         // Button weixinbutton


          //返回箭头
        ImageView imaeviewback=findViewById(R.id.imageback);
           imaeviewback.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    finish();
               }
           });



    }
}
