package org.example.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBill phoneBill = new PhoneBill();

        System.out.println("Enter the base cost of the plan.");
        double fee = scanner.nextDouble();
        phoneBill.setBaseCost(fee);
        System.out.println("Enter the number of allotted minutes.");
        double allottedMinutes = scanner.nextDouble();
        phoneBill.setAllottedMinutes(allottedMinutes);
        System.out.println("Enter the number of used minutes.");
        double usedMinutes = scanner.nextDouble();
        phoneBill.setUsedMinutes(usedMinutes);

        scanner.close();

        phoneBill.printBill();
    }
}
