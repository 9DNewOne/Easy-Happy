package com.example.asus.ourfirst.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.ourfirst.R;
import com.example.asus.ourfirst.utils.otherutils.TabUtils;
import com.example.asus.ourfirst.view.adapter.RecommendPagerAdaoter;

/**
 *  热门推荐
 */
public class RecommendFragment extends Fragment {


    private View view;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recommend, container, false);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final TabLayout mTab=view.findViewById(R.id.Tab);

        ViewPager mRecommendVP=view.findViewById(R.id.RecommendPager);

        RecommendPagerAdaoter pagerAdaoter = new RecommendPagerAdaoter(getFragmentManager());

        mRecommendVP.setAdapter(pagerAdaoter);

        mTab.setupWithViewPager(mRecommendVP);

        mTab.post(new Runnable() {
            @Override
            public void run() {
                TabUtils.setIndicator(mTab,50,50);
            }
        });

    }


}
