package com.example.sacura.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.sacura.FragmentSecond;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new FragmentFirst();
            case 1: return new FragmentSecond();
            case 2: return new FragmentThird();
            case 3: return new FragmentFourth();
            default: return new FragmentFirst();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
