package com.javarush.island.popkovdmitriy.worker;

import com.javarush.island.popkovdmitriy.enity.plant.Grass;
import com.javarush.island.popkovdmitriy.island.Island;
import com.javarush.island.popkovdmitriy.settings.Settings;


public class PlantWorker implements Runnable {
    Island island;
    int maxCountPlant = Settings.maxCountPlant;

    public PlantWorker(Island island) {
        this.island = island;
    }

    @Override
    public void run() {
        try {
            plantGrowth();
        } catch (Exception e) {
            System.err.println("ERROR");
            System.exit(0);
        }
    }

    public void plantGrowth() {
        for (int i = 0; i < island.islandArrays.length; i++) {
            for (int j = 0; j < island.islandArrays[i].length; j++) {
                if (island.islandArrays[i][j].listGrass.size() <= maxCountPlant) {
                    island.islandArrays[i][j].listGrass.add(new Grass());
                } else {
                    return;
                }
            }
        }
    }
}
