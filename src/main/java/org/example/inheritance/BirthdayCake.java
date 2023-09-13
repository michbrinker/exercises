package org.example.inheritance;

public class BirthdayCake extends Cake {
    public int candles;

    public BirthdayCake() {
        super("chocolate");
        this.price = 10.00;
        System.out.println("In birthday sub");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
