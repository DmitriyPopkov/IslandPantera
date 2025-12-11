package com.javarush.island.popkovdmitriy.enity.animal.predator;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Fox extends Predator{

    public Fox() {
        super.setWeight(Settings.weightFox);
        super.setMaxSpeed(Settings.maxSpeedFox);
        super.setMaxSatiety(Settings.maxSatietyFox);
        super.setActualSatiety(Settings.actualSatietyFox);
        super.setCountOnOneCell(Settings.countFoxOnOneCell);
        super.setProbabilityEaten(Settings.ProbabilityBeingEatenFox);
    }
}
