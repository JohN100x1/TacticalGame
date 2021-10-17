package com.example.tacticalgame;

import android.widget.ImageView;

public class Unit {
    private int drawableImage;
    public Unit(int drawableImage){
        this.drawableImage = drawableImage;
    }

    public int getDrawableImage() {
        return drawableImage;
    }
}
