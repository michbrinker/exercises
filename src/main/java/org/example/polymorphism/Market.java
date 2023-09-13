package org.example.polymorphism;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.makeJuice();
        ((Apple)apple).removeSeeds();

        Fruit banana = new Banana();
        banana.makeJuice();
        ((Banana)banana).peel();

        Fruit fruit = new Apple();
        System.out.println("Fruit has " + fruit.calories + " calories");
        fruit = new Banana();
        System.out.println("Now fruit has " + fruit.calories + " calories");
    }
}
