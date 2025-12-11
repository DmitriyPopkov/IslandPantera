package com.javarush.island.popkovdmitriy.statistic;

import com.javarush.island.popkovdmitriy.enity.animal.herbivore.Herbivore;
import com.javarush.island.popkovdmitriy.enity.animal.predator.Predator;
import com.javarush.island.popkovdmitriy.island.Island;

import java.util.Arrays;

import static java.util.Arrays.stream;


public class Statistic {



    public static int countNumberAnimal(Island island) {
        int sizePredator = stream(island.islandArrays).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Predator).map(c -> (Predator) c).toList().size();
        int sizeHerbivore = stream(island.islandArrays).flatMap(Arrays::stream).flatMap(cell -> cell.listAnimal.stream())
                .filter(c -> c instanceof Herbivore).map(c -> (Herbivore) c).toList().size();
        return sizeHerbivore + sizePredator;

    }

}
