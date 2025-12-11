package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Buffalo extends Herbivore {

    public Buffalo() {
        super.setWeight(Settings.weightBuffalo);
        super.setMaxSpeed(Settings.maxSpeedBuffalo);
        super.setMaxSatiety(Settings.maxSatietyBuffalo);
        super.setActualSatiety(Settings.actualSatietyBuffalo);
        super.setCountOnOneCell(Settings.countBuffaloOnOneCell);
    }
}
