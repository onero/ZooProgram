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

    public Zoo() {
        animals = new ArrayList();
    }

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void allAnimalsMakeSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void countLegs() {
        int legsTotal = 0;
        for (Animal animal : animals) {
            legsTotal += animal.amountOfLegs;
        }
        System.out.println("There are " + legsTotal + " legs");

    }

    public void getNumberOfGender(String gender) {

    }

}
