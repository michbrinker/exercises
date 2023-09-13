package org.example.encapsulation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PhoneBill {
    int id;
    double baseCost;
    double allottedMinutes;
    double usedMinutes;

    public PhoneBill() {
        this.id = 0;
        this.baseCost = 0.0;
        this.allottedMinutes = 0.0;
        this.usedMinutes = 0.0;
    }

    public PhoneBill(int id) {
        this.id = id;
        this.baseCost = 0.0;
        this.allottedMinutes = 0.0;
        this.usedMinutes = 0.0;
    }

    public PhoneBill(int id, double baseCost, double allottedMinutes, double usedMinutes) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes = usedMinutes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(double usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes) { return 0.0; }

        double rate = .25;
        double minutes = usedMinutes - allottedMinutes;
        BigDecimal decimal = new BigDecimal(rate * minutes).setScale(2, RoundingMode.HALF_DOWN);
        return decimal.doubleValue();
    }

    public double calculateTax(){
        double rate = .15;
        double subTotal = baseCost + calculateOverage();
        BigDecimal decimal = new BigDecimal(rate * subTotal).setScale(2, RoundingMode.HALF_DOWN);
        return decimal.doubleValue();
    }

    public double calculateTotal(){
        BigDecimal decimal = new BigDecimal(baseCost + calculateOverage() + calculateTax()).setScale(2, RoundingMode.HALF_DOWN);
        return decimal.doubleValue();
    }

    public void printBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}
