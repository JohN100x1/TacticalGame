package com.example.tacticalgame;

public class MapTile {
    private int x;
    private int y;
    public MapTile(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int[] getLocation(){
        return new int[]{x, y};
    }
}
