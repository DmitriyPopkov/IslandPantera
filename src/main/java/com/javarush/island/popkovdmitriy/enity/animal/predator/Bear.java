package com.javarush.island.popkovdmitriy.enity.animal.predator;

import com.javarush.island.popkovdmitriy.settings.Settings;





    public class Bear extends Predator{
        public Bear() {
            super.setWeight(Settings.weightBear);
            super.setMaxSpeed(Settings.maxSpeedBear);
            super.setMaxSatiety(Settings.maxSatietyBear);
            super.setActualSatiety(Settings.actualSatietyBear);
            super.setCountOnOneCell(Settings.countBearOnOneCell);
            super.setProbabilityEaten(Settings.ProbabilityBeingEatenBear);
        }
    }


