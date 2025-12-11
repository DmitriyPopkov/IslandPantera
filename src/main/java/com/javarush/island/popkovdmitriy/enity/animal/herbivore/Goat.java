package com.javarush.island.popkovdmitriy.enity.animal.herbivore;
import com.javarush.island.popkovdmitriy.settings.Settings;

public class Goat extends Herbivore {
    public Goat() {
        super.setWeight(Settings.weightGoat);
        super.setMaxSpeed(Settings.maxSpeedGoat);
        super.setMaxSatiety(Settings.maxSatietyGoat);
        super.setActualSatiety(Settings.actualSatietyGoat);
        super.setCountOnOneCell(Settings.countGoatOnOneCell);

    }

     public static class Caterpillar extends Herbivore {
        public Caterpillar() {
            super.setWeight(Settings.weightCaterpillar);
            super.setMaxSpeed(Settings.maxSpeedCaterpillar);
            super.setMaxSatiety(Settings.maxSatietyCaterpillar);
            super.setActualSatiety(Settings.actualSatietyCaterpillar);
            super.setCountOnOneCell(Settings.countCaterpillarOnOneCell);
        }
    }

}
