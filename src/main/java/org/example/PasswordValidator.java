package org.example;

import java.util.Scanner;

public class PasswordValidator {
    public static String oldPassword = "myOldPa$$word";
    public static String userName = "MyUserName";

    public static Boolean isValid(String password) {
        return password.length() >= 8
                && includesUppercase(password)
                && includesSpecialChar(password)
                && !password.contains(userName)
                && !password.equals(oldPassword);
    }

    public static Boolean includesUppercase(String password) {
        for(int i=0; i<password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))) { return true; }
        }
        return false;
    }

    public static Boolean includesSpecialChar(String password) {
        for(int i=0; i<password.length(); i++) {
            if(!Character.isDigit(password.charAt(i))
                    && !Character.isLetter(password.charAt(i))
                    && !Character.isSpaceChar(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password.");
        if(isValid(scanner.next())) {
            System.out.println("Your password is valid.");
        } else {
            System.out.println("Your password is NOT valid.");
        }
        scanner.close();
    }
}
