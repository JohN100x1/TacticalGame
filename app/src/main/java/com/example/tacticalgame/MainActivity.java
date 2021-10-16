package com.example.tacticalgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.tacticalgame.Fragments.StartFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout mainframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainframe = findViewById(R.id.main_frame);
        FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, new StartFragment());
        transaction.commit();
    }
}