package com.example.streams;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.streams.fragments.dialFragment;
import com.example.streams.fragments.folderFragment;
import com.example.streams.fragments.groupsFragment;
import com.example.streams.fragments.historyFragment;
import com.example.streams.fragments.peopleFragment;

public class adapter extends FragmentStateAdapter {


    public adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new peopleFragment();
            case 2:
                return new dialFragment();
            case 3:
                return new folderFragment();
            case 4:
                return new groupsFragment();
            default:
                return new historyFragment();
        }
    }
}
