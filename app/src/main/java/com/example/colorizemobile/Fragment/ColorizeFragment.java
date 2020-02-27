package com.example.colorizemobile.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.colorizemobile.R;

public class ColorizeFragment extends Fragment {

    public ColorizeFragment() {

    }

    public static ColorizeFragment newInstance() {
        ColorizeFragment fragment = new ColorizeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_colorize, container, false);
    }
}
