package com.example.tacticalgame.Fragments;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.tacticalgame.R;

public class StartFragment extends Fragment {

    private TextView startButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        startButton = view.findViewById(R.id.start_btn);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, new BattleFragment());
                transaction.commit();
            }
        });
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // Start Button blink Animation
        TextView startTextView = (TextView)getView().findViewById(R.id.start_btn);
        blinkAction(startTextView);
    }

    public void blinkAction(TextView textview){
        Animation anim = new AlphaAnimation(0.1f, 1.0f);
        anim.setDuration(1000);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        textview.startAnimation(anim);
    }
}