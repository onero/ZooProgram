/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

public class Lion extends Animal {

    String sound;

    /**
     * Constructor of the Lion object, which will grant it the gender,
     * amountOfLegs and sound parsed to it from creation of the object
     *
     * @param gender
     * @param amountOfLegs
     * @param sound
     */
    public Lion(String gender, int amountOfLegs, String sound) {
        this.sound = sound;
        this.amountOfLegs = amountOfLegs;
        this.gender = gender;
    }

    /**
     * The Lion overriden version of makeSound, which will print out the sound
     * parsed from creating the object.
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

}
