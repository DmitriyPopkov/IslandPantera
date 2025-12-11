package com.javarush.island.popkovdmitriy;

import com.javarush.island.popkovdmitriy.app.CreatingMultithreading;
import com.javarush.island.popkovdmitriy.app.Islandinitialization;
import com.javarush.island.popkovdmitriy.island.Island;




public class ConsoleRunner {
    public static void main(String[] args) {

        Island island = new Island();
        Islandinitialization.start(island);
        CreatingMultithreading creatingMultithreading = new CreatingMultithreading(island);
        creatingMultithreading.islandStartLive();


    }
}
