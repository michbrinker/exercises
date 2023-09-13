package org.example.polymorphism;

public class Apple extends Fruit {
    public Apple() {
        this.calories = 50;
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }

    public void slice() {
        System.out.println("The apple is sliced");
    }

    public void removeSeeds() {
        System.out.println("The apple core is removed");
    }
}
