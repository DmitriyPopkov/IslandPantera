package com.javarush.island.popkovdmitriy.enity.animal.herbivore;

import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.enity.plant.Grass;
import com.javarush.island.popkovdmitriy.island.Cell;
import com.javarush.island.popkovdmitriy.settings.Settings;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class Herbivore extends Animal {
    Lock lock = new ReentrantLock();

    @Override
    public boolean eat(Cell cell) {
        lock.lock();
        try {
            if (actualSatiety >= maxSatiety) {
                actualSatiety = maxSatiety;
                return true;
            }
            CopyOnWriteArrayList<Grass> listGrass = cell.listGrass;
            if (listGrass.isEmpty()) {
                return false;
            }
            for (Grass grass : listGrass) {
                int weightPlant = Grass.weight;
                if (weightPlant > maxSatiety) {
                    actualSatiety = maxSatiety;
                    cell.listGrass.remove(grass);
                } else {
                    actualSatiety = actualSatiety + weightPlant + (maxSatiety * Settings.onTopWeightAnimalAndPlant);
                    cell.listGrass.remove(grass);
                }
                return true;
            }
        }finally {
            lock.unlock();
        }
        return true;
    }
}
