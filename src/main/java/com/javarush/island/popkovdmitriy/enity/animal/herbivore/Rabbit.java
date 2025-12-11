package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Rabbit extends Herbivore {

    public Rabbit() {
        super.setWeight(Settings.weightRabbit);
        super.setMaxSpeed(Settings.maxSpeedRabbit);
        super.setMaxSatiety(Settings.maxSatietyRabbit);
        super.setActualSatiety(Settings.actualSatietyRabbit);
        super.setCountOnOneCell(Settings.countRabbitOnOneCell);
    }
}
