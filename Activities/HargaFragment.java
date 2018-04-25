package com.example.ahmadnprimordi.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HargaFragment extends Fragment {

    View view;
    public HargaFragment() {

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_harga, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
