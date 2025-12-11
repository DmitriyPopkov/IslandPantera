package com.javarush.island.popkovdmitriy.app;

import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.enity.animal.herbivore.*;
import com.javarush.island.popkovdmitriy.enity.animal.predator.*;
import com.javarush.island.popkovdmitriy.enity.plant.Grass;
import com.javarush.island.popkovdmitriy.island.Cell;
import com.javarush.island.popkovdmitriy.island.Island;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Islandinitialization {
    public static void start (Island island) {
        int size = island.islandArrays.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < island.islandArrays[i].length; j++) {
                Cell cell = new Cell();
                cell.listGrass.addAll(createPlants());
                island.islandArrays[i][j] = cell;
                island.islandArrays[i][j].listAnimal.addAll(createAnimals());
            }
        }

    }
    public static List<Animal> createAnimals() {
        List<Animal> animals = new CopyOnWriteArrayList<>();
        animals.add(new Wolf());

        animals.add(new Bear());

        animals.add(new Boa());

        animals.add(new Fox());

        animals.add(new Eagle());

        animals.add(new Buffalo());

        animals.add(new Sheep());

        animals.add(new Rabbit());

        animals.add(new Mouse());
        animals.add(new Mouse());
        animals.add(new Mouse());
        animals.add(new Mouse());

        animals.add(new Boar());

        animals.add(new Deer());

        animals.add(new Goat());

        animals.add(new Horse());

        animals.add(new Duck());
        for (int i=0 ;  i<=1000 ;i++){
            animals.add(new Caterpillar());
        }


        return animals;
    }

    public static List<Grass> createPlants() {
        return List.of(new Grass());
    }

}


