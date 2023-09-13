package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PhoneBillCalculator {
    static double calculateOverage(int minutes){
        double rate = .25;
        BigDecimal decimal = new BigDecimal(rate * minutes).setScale(2, RoundingMode.HALF_DOWN);
        return decimal.doubleValue();
    }

    static double calculateTax(double subTotal){
        double rate = .15;
        BigDecimal decimal = new BigDecimal(rate * subTotal).setScale(2, RoundingMode.HALF_DOWN);
        return decimal.doubleValue();
    }

    static void printBill(double baseFee, double overage, double tax){
        double total = baseFee + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + baseFee);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base cost of the plan.");
        double fee = scanner.nextDouble();
        System.out.println("Enter the number of overage minutes.");
        int minutes = scanner.nextInt();

        scanner.close();

        double overage = calculateOverage(minutes);
        double tax = calculateTax(fee + overage);
        printBill(fee, overage, tax);
    }

}
