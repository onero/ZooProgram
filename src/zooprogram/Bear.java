/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

public class Bear extends Animal {

    String sound;

    public Bear(String gender, int amountOfLegs, String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

}
