package com.test.study.uappoint;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PacsFragment extends Fragment {
    public PacsFragment(){super();}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.from(getContext()).inflate(R.layout.activity_pacslist,container,false);
        return view;
    }
}