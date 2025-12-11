package com.javarush.island.popkovdmitriy.worker;
import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.island.Cell;
import com.javarush.island.popkovdmitriy.island.Island;

public class Task {
    private final Animal animal;
    private final Cell cell;
    private final Island island;

    public Task(Animal animal, Cell cell, Island island) {
        this.animal = animal;
        this.cell = cell;
        this.island = island;
    }

    public void doTask() {
        animal.worker();
        if (animal.eat(cell)){
            animal.reproduce(cell);
        }
        animal.dei(cell);
        animal.move(island);
    }
}
