package org.example;

import java.util.Scanner;

public class DayOfTheWeek {
    public static final String[] DAY_OF_THE_WEEK = { "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday", "Sunday" };

    public static void getDay(int number) {
        System.out.println(DAY_OF_THE_WEEK[number - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputIndex = 0;

        do {
            System.out.println("Enter a whole number between 1 and 7 (inclusive).");
            inputIndex = scanner.nextInt();
        } while ( inputIndex < 1 || inputIndex > 7 );
        scanner.close();

        getDay(inputIndex);
    }
}
