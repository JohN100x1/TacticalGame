package com.example.tacticalgame;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<MapTile> tiles;
    private int sizeX;
    private int sizeY;
    public Map(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        tiles = new ArrayList<>();
        for (int i = 0; i < sizeX; i++){
            for (int j = 0; j < sizeY; j++){
                tiles.add(new MapTile(i, j));
            }
        }
    }

    public List<MapTile> getTiles() {
        return tiles;
    }
}
