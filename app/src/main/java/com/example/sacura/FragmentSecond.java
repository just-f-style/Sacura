package com.example.sacura;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.chip.Chip;

public class FragmentSecond extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);

        Chip chip = (Chip) v.findViewById(R.id.chip);
        chip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab2Class1DetailsActivity.class));
            }
        });
        Chip chip1 = (Chip) v.findViewById(R.id.chip1);
        chip1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab2Class2DetailsActivity.class));
            }
        });
        Chip chip2 = (Chip) v.findViewById(R.id.chip2);
        chip2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab2Class3DetailsActivity.class));
            }
        });
        Chip chip3 = (Chip) v.findViewById(R.id.chip3);
        chip3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab2Class4DetailsActivity.class));
            }
        });

        return v;
    }
}