package org.example.inheritance;

public class WeddingCake extends Cake {
    public int tiers;

    public WeddingCake() {
        super("vanilla");
        this.price = 300.00;
        System.out.println("In wedding sub");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
