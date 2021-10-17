package com.example.tacticalgame;

public class BattlefieldTile {
    private int x;
    private int y;
    private Unit unit;
    public BattlefieldTile(int x, int y){
        this.x = x;
        this.y = y;
        this.unit = null;
    }
    public int[] getLocation(){
        return new int[]{x, y};
    }
    public Unit getUnit(){
        return unit;
    }
    public void setUnit(Unit u){
        this.unit = u;
    }
}
