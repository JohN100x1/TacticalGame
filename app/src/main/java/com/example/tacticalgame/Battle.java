package com.example.tacticalgame;

public class Battle {
    private Battlefield battlefield;
    private Unit[] units;
    public Battle(Battlefield battlefield, Unit[] units){
        this.battlefield = battlefield;
        this.units = units;
    }

    public void placeUnits(){
        for (int i = 0; i < units.length; i++){
            battlefield.getTiles().get(i).setUnit(units[i]);
        }
    }
}
