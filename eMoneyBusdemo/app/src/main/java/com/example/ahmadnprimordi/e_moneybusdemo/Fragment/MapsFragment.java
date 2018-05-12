package com.example.ahmadnprimordi.e_moneybusdemo.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmadnprimordi.e_moneybusdemo.MapsActivity;
import com.example.ahmadnprimordi.e_moneybusdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends Fragment {

    ImageView googleMaps;

    public MapsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        googleMaps = view.findViewById(R.id.mapImage);

        googleMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MapsActivity.class));
                getActivity().finish();
            }
        });
    }
}
