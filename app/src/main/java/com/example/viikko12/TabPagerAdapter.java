package com.example.viikko12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.viikko12.fragments.AddFragment;
import com.example.viikko12.fragments.FrontFragment;
import com.example.viikko12.fragments.ListFragment;

public class TabPagerAdapter extends FragmentStateAdapter {


    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)   {
            case 0:
                return new ListFragment();
            case 1:
                return new AddFragment();
            default:
                return new ListFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
