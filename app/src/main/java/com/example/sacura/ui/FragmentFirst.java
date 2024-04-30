package com.example.sacura.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.sacura.DetailsActivityClass1;
import com.example.sacura.DetailsActivityClass2;
import com.example.sacura.DetailsActivityClass3;
import com.example.sacura.DetailsActivityClass4;
import com.example.sacura.R;
import com.google.android.material.chip.Chip;

public class FragmentFirst extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        Chip chip = (Chip) v.findViewById(R.id.chip);
        chip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailsActivityClass1.class));
            }
        });
        Chip chip1 = (Chip) v.findViewById(R.id.chip1);
        chip1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailsActivityClass2.class));
            }
        });
        Chip chip2 = (Chip) v.findViewById(R.id.chip2);
        chip2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailsActivityClass3.class));
            }
        });
        Chip chip3 = (Chip) v.findViewById(R.id.chip3);
        chip3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DetailsActivityClass4.class));
            }
        });

        return v;
    }




}