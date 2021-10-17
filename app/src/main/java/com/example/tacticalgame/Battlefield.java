package com.example.tacticalgame;

import java.util.ArrayList;
import java.util.List;

public class Battlefield {
    private List<BattlefieldTile> tiles;
    private int sizeX;
    private int sizeY;
    public Battlefield(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        tiles = new ArrayList<>();
        for (int i = 0; i < sizeX; i++){
            for (int j = 0; j < sizeY; j++){
                tiles.add(new BattlefieldTile(i, j));
            }
        }
    }

    public List<BattlefieldTile> getTiles() {
        return tiles;
    }
}
