package com.javarush.island.popkovdmitriy.island;

import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.enity.plant.Grass;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cell {
    public Lock lock = new ReentrantLock();

    private static final CountDownLatch START = new CountDownLatch(4);

    public CopyOnWriteArrayList<Animal> listAnimal = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<Grass> listGrass = new CopyOnWriteArrayList<>();
}

