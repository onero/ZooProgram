/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooprogram;

public abstract class Animal {

    public int amountOfLegs;
    public String gender;

    /**
     * The abstract method, which the Animal will override to make its own sound
     */
    public abstract void makeSound();

}
