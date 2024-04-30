package com.example.sacura.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.sacura.R;
import com.example.sacura.tab3Class1DetailsActivity;
import com.example.sacura.tab3Class2DetailsActivity;
import com.example.sacura.tab3Class3DetailsActivity;
import com.example.sacura.tab3Class4DetailsActivity;
import com.google.android.material.chip.Chip;

public class FragmentThird extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_third, container, false);

        Chip chip = (Chip) v.findViewById(R.id.chip);

        chip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab3Class1DetailsActivity.class));

            }
        });
        Chip chip1 = (Chip) v.findViewById(R.id.chip1);
        chip1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab3Class2DetailsActivity.class));
            }
        });
        Chip chip2 = (Chip) v.findViewById(R.id.chip2);
        chip2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab3Class3DetailsActivity.class));
            }
        });
        Chip chip3 = (Chip) v.findViewById(R.id.chip3);
        chip3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), tab3Class4DetailsActivity.class));
            }
        });

        return v;
    }
}