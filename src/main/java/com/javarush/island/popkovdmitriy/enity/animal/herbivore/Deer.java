package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Deer extends Herbivore {

    public Deer() {
        super.setWeight(Settings.weightDeer);
        super.setMaxSpeed(Settings.maxSpeedDeer);
        super.setMaxSatiety(Settings.maxSatietyDeer);
        super.setActualSatiety(Settings.actualSatietyDeer);
        super.setCountOnOneCell(Settings.countDeerOnOneCell);
    }
}
