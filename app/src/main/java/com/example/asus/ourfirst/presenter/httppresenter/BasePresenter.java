package com.example.asus.ourfirst.presenter.httppresenter;

/**
 * Created by asus on 2018/1/22.
 */

public class BasePresenter<V> {
    public V view;
    public void attachview(V view){
        this.view=view;
    }
    public void dettach(){
        this.view=null;
    }

}
