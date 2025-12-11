package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Sheep extends Herbivore {

    public Sheep() {
        super.setWeight(Settings.weightSheep);
        super.setMaxSpeed(Settings.maxSpeedSheep);
        super.setMaxSatiety(Settings.maxSatietySheep);
        super.setActualSatiety(Settings.actualSatietySheep);
        super.setCountOnOneCell(Settings.countSheepOnOneCell);
    }
}
