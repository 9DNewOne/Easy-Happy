package com.example.asus.ourfirst.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.ourfirst.R;

/**
 *  热门推荐
 */
public class RecommendFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recommend, container, false);


        return view;

    }

}
