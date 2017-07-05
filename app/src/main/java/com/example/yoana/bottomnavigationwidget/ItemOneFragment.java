package com.example.yoana.bottomnavigationwidget;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yoana on 7/4/2017.
 */

public class ItemOneFragment extends Fragment
{

    public static ItemOneFragment newInstance()
    {
        ItemOneFragment fragment  = new ItemOneFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}
