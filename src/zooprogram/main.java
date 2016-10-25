/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

/**
 *
 * @author Adamino
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        //Creating new Animal objects and assigning them gender, amountOfLegs and sound
        zoo.add(new Lion("male", 4, "Wroaaar"));
        zoo.add(new Bear("Female", 4, "Grrr!"));

        zoo.allAnimalsMakeSound();
        zoo.countLegs();
        zoo.getNumberOfGender("Female");
        //Extra feature that will print out the types of Animals in our animals list!
        zoo.getAnimalTypes();
    }

}
