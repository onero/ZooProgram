/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    /**
     * The constructor for this class will initialize a new ArrayList and assign
     * it to "animals"
     */
    public Zoo() {
        animals = new ArrayList();
    }

    /**
     * Will add the parsed Animal to the animals list
     *
     * @param animal
     */
    public void add(Animal animal) {
        animals.add(animal);
    }

    /**
     * Will print the sounds of all the different animals
     */
    public void allAnimalsMakeSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    /**
     * Will loop through and count the animals legs in the list
     */
    public void countLegs() {
        int legsTotal = 0;
        for (Animal animal : animals) {
            legsTotal += animal.amountOfLegs;
        }
        System.out.println("There are " + legsTotal + " legs");

    }

    /**
     * Will loop through and count the genders of the animals in the list of the
     * type specified by the parameter
     *
     * @param gender
     */
    public void getNumberOfGender(String gender) {
        int amountOfMale = 0;
        for (Animal animal : animals) {
            if (animal.gender.matches("male")) {
                amountOfMale++;
            }
        }
        System.out.println("There are " + amountOfMale + " " + gender);
    }

    /**
     * Will print out the names of the animals in the animals list
     */
    public void getAnimalTypes() {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }

}
