package org.example;

public class HandleExceptions {
    public static void main(String[] args) {
        try{
            int c = 30/0;
        }catch (Exception e){
            System.out.println("Not permitted");
        }finally {
            System.out.println("Division is fun");
        }
    }
}
