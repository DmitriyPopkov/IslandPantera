package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Horse extends Herbivore {

    public Horse() {
        super.setWeight(Settings.weightHorse);
        super.setMaxSpeed(Settings.maxSpeedHorse);
        super.setMaxSatiety(Settings.maxSatietyHorse);
        super.setActualSatiety(Settings.actualSatietyHorse);
        super.setCountOnOneCell(Settings.countHorseOnOneCell);
    }
}
