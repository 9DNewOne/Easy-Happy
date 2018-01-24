package com.example.asus.ourfirst.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asus.ourfirst.R;
import com.example.asus.ourfirst.view.fragment.RecommendFragment;
import com.example.asus.ourfirst.view.fragment.RrossTalkFragment;
import com.example.asus.ourfirst.view.fragment.VideoFragment;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewbtn;
    private DrawerLayout mDrawerLayout;
    private long lastTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainActivity的底部
        BottomTabBar bottomtabbar = findViewById(R.id.bottomtabbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView mViewNavigationView = findViewById(R.id.view_navigation);
        //点击图片登录 跳转activity 选择登录方式
        View headerView = mViewNavigationView.getHeaderView(0);
        ImageView imageViewbtn = headerView.findViewById(R.id.TouXiang01);
        imageViewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        ////////////////////////////////mainActivity的底部////////////////////////////////////////////////////////////////////////////
        bottomtabbar.init(getSupportFragmentManager())
                .setImgSize(35, 35)
                .setFontSize(10)
                .setTabPadding(4, 6, 10)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("推荐", R.mipmap.tuijian_select, RecommendFragment.class)
                .addTabItem("段子", R.mipmap.duanzi_default, RrossTalkFragment.class)
                .addTabItem("视屏", R.mipmap.video_defaults, VideoFragment.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

        //////////////////////////////////////bottomTabBar////////////////////////////////////////////

        //////////////////////////////////////NavigationView导航菜单////////////////////////////////////////////////
        mViewNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                item.setChecked(false);

                switch (item.getItemId()) {
                    case R.id.action_concern:
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

                //关闭侧拉
                mDrawerLayout.closeDrawers();
                return false;
            }
        });

    }

    //////////////////////////////应用退出///////////////////////////////
    @Override
    public void onBackPressed() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastTime < 2 * 1000) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, "请再按一次", Toast.LENGTH_SHORT).show();
            lastTime = currentTime;
        }
    }
}
