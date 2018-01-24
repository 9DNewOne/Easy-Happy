package com.example.asus.ourfirst.view.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.asus.ourfirst.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final DrawerLayout mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView mViewNavigationView = findViewById(R.id.view_navigation);
        mViewNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                item.setChecked(false);
                switch (item.getItemId()) {
                    case R.id.action_concern:
                        Log.i("我的关心", "onNavigationItemSelected: 我的关心");
                        Toast.makeText(MainActivity.this, "我的关心", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_collect:
                        Toast.makeText(MainActivity.this, "我的收藏", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_Search:
                        Toast.makeText(MainActivity.this, "搜索好友", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_inform:
                        Toast.makeText(MainActivity.this, "消息通知", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_menu_night:
                        Toast.makeText(MainActivity.this, "夜间模式", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_menu_my_works:
                        Toast.makeText(MainActivity.this, "我的作品", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.ic_menu_set:
                        Toast.makeText(MainActivity.this, "设置", Toast.LENGTH_SHORT).show();
                        break;

                }
                mDrawerLayout.closeDrawers();
                return false;
            }
        });

    }
}
