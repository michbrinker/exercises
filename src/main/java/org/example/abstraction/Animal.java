package org.example.abstraction;

public abstract class Animal {
    public abstract void makeSound();

    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }
}
