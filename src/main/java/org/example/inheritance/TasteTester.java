package org.example.inheritance;

public class TasteTester {
    public static void main(String[] args) {
        Cake birthdayCake = new BirthdayCake();
        Cake weddingCake = new WeddingCake();

        System.out.printf("The Birthday Cake is %s flavored and costs $%s%n",
                birthdayCake.flavor, birthdayCake.price);
        System.out.printf("The Wedding Cake is %s flavored and costs $%s%n",
                weddingCake.flavor, weddingCake.price);
    }
}
