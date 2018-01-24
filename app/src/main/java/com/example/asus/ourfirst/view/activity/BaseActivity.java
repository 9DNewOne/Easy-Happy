package com.example.asus.ourfirst.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.asus.ourfirst.presenter.httppresenter.BasePresenter;


/**
 *
 * Created by asus on 2018/1/22.
 */

public abstract class BaseActivity<V,P extends BasePresenter<V>> extends AppCompatActivity {
    public P presenter;
    public abstract P inpresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentViewId());
        initView();
        initData();
        presenter=inpresenter();

        presenter.attachview((V) this);

    }

    protected abstract int getContentViewId();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettach();
    }
}
