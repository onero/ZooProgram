/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

public class Bear extends Animal {

    String sound;

    /**
     * Constructor of the Bear object, which will grant it the gender,
     * amountOfLegs and sound parsed to it from creation of the object
     *
     * @param gender
     * @param amountOfLegs
     * @param sound
     */
    public Bear(String gender, int amountOfLegs, String sound) {
        this.sound = sound;
        this.amountOfLegs = amountOfLegs;
        this.gender = gender;
    }

    /**
     * The Bear overriden version of makeSound, which will print out the sound
     * parsed from creating the object.
     */
    @Override
    public void makeSound() {
        System.out.println(sound);
    }

}
