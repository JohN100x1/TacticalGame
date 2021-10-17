package com.example.tacticalgame.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

import com.example.tacticalgame.Battle;
import com.example.tacticalgame.Battlefield;
import com.example.tacticalgame.R;
import com.example.tacticalgame.Unit;

public class BattleFragment extends Fragment {
    private Battle battle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_battle, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){

        GridLayout battlefield = getActivity().findViewById(R.id.battlefield);

        // Create Units
        Unit[] units = {new Unit(R.drawable.slime)};

        // Create Unit images
        ImageView[] imageViews = {new ImageView(getContext())};
        imageViews[0].setImageResource(units[0].getDrawableImage());

        // Create Battle
        int sizeX = 6;
        int sizeY = 8;
        battle = new Battle(new Battlefield(sizeX, sizeY), units);
        battle.placeUnits();

        // Place Unit images
        battlefield.addView(imageViews[0], 256, 256);
    }
}