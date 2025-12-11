package com.javarush.island.popkovdmitriy.enity.animal.predator;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Boa extends Predator {
    public Boa() {
        super.setWeight(Settings.weightBoa);
        super.setMaxSpeed(Settings.maxSpeedBoa);
        super.setMaxSatiety(Settings.maxSatietyBoa);
        super.setActualSatiety(Settings.actualSatietyBoa);
        super.setCountOnOneCell(Settings.countBoaOnOneCell);
        super.setProbabilityEaten(Settings.ProbabilityBeingEatenBoa);
    }
}
