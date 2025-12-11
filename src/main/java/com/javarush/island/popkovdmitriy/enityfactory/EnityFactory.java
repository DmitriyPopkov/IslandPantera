package com.javarush.island.popkovdmitriy.enityfactory;
import com.javarush.island.popkovdmitriy.enity.animal.Animal;
import com.javarush.island.popkovdmitriy.enity.animal.herbivore.*;
import com.javarush.island.popkovdmitriy.enity.animal.predator.*;

public class EnityFactory {
    public static Animal giveBirthAnimal(String simpleName) {
        Animal animalKind = null;
        switch (simpleName) {
            case "Boa" -> animalKind = new Boa();
            case "Wolf" -> animalKind = new Wolf();
            case "Sheep" -> animalKind = new Sheep();
            case "Rabbit" -> animalKind = new Rabbit();
            case "Fox" -> animalKind = new Fox();
            case "Bear" -> animalKind = new Bear();
            case "Eagle" -> animalKind = new Eagle();
            case "Boar" -> animalKind = new Boar();
            case "Buffalo" -> animalKind = new Buffalo();
            case "Caterpillar" -> animalKind = new Caterpillar();
            case "Deer" -> animalKind = new Deer();
            case "Duck" -> animalKind = new Duck();
            case "Goat" -> animalKind = new Goat();
            case "Horse" -> animalKind = new Horse();
            case "Mouse" -> animalKind = new Mouse();
        }
        return animalKind;
    }
}
