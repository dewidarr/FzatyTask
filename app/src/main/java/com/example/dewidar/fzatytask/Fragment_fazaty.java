package com.example.dewidar.fzatytask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_fazaty extends Fragment {
    private FzatyOptionAdapter mfzatyOptionAdapter;
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1_fazaty_layout,container,false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mfzatyOptionAdapter=new FzatyOptionAdapter(getChildFragmentManager());
        mViewPager = (ViewPager) getView().findViewById(R.id.fazatycontainer);
        mViewPager.setAdapter(mfzatyOptionAdapter);
        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.fzatytablayout);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
    }
}
