package org.example.polymorphism;

public class Banana extends Fruit {
    public Banana(){
        this.calories = 100;
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made.");
    }

    public void peel() {
        System.out.println("The banana is peeled");
    }
}
