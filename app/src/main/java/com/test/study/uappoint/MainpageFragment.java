package com.test.study.uappoint;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainpageFragment extends Fragment {
    public MainpageFragment(){super();}
    @Nullable
    private static final String TAG = "MainpageFragment";
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView:running********************* ");
        Log.d(TAG, "onCreateView: *****************"+inflater+"******************"+container+"*******************"+savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_headpage,container,false);

        Log.d(TAG, "onCreateView: ********************"+view);

        return view;
    }
}