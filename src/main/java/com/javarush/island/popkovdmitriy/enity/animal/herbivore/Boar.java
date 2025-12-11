package com.javarush.island.popkovdmitriy.enity.animal.herbivore;

import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.enity.plant.Grass;
import com.javarush.island.popkovdmitriy.island.Cell;
import com.javarush.island.popkovdmitriy.settings.Settings;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Boar extends Herbivore {

    public Boar() {
        super.setActualSatiety(Settings.actualSatietyBoar);
        super.setWeight(Settings.weightBoar);
        super.setMaxSpeed(Settings.maxSpeedBoar);
        super.setMaxSatiety(Settings.maxSatietyBoar);
        super.setCountOnOneCell(Settings.countBoarOnOneCell);
    }

    @Override
    public boolean eat(Cell cell) {
        lock.lock();
        try {
            if (actualSatiety >= maxSatiety) {
                actualSatiety = maxSatiety;
                return true;
            }
            CopyOnWriteArrayList<Animal> listAnimal = cell.listAnimal;
            List<Animal> listCaterpillar = listAnimal.stream().filter(animal -> animal instanceof Goat.Caterpillar).toList();

            if (!listCaterpillar.isEmpty()) {
                for (Animal cater : listCaterpillar) {
                    int probability = Settings.chanceEatCaterpillarBoar;
                    int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
                    if (probability >= randomNum) {
                        Double weightFood = Settings.weightOfAllEdibleAnimals.get(cater.getClass().getSimpleName());
                        if (weightFood > maxSatiety) {
                            actualSatiety = maxSatiety;
                        } else {
                            actualSatiety += weightFood;
                        }
                        cell.listAnimal.remove(cater);
                    }
                }
            }
            if (actualSatiety >= maxSatiety) {
                actualSatiety = maxSatiety;
                return true;
            }
            CopyOnWriteArrayList<Grass> listPlant = cell.listGrass;
            if (listPlant.isEmpty()) {
                return false;
            }
            for (Grass plant : listPlant) {
                int weightPlant = Grass.weight;
                if (weightPlant > maxSatiety) {
                    actualSatiety = maxSatiety;
                    cell.listGrass.remove(plant);
                } else {
                    actualSatiety = actualSatiety + weightPlant + (maxSatiety * 0.3);
                    cell.listGrass.remove(plant);
                }
                return false;
            }
        } finally {
            lock.unlock();
        }
        return false;
    }
}