package com.example.operatorchallenge;

public class Main {
    public static void main(String[] args){
        double firstVar = 20.00d;
        double secondVar = 80.00d;
        double result = (firstVar + secondVar)*100.00d;
        System.out.println("The result is "+ result);
        double remainder = result % 40.00d;
        System.out.println("The remainder is "+ remainder);

        boolean isNoRemainder = (remainder == 0.00d)? true: false;
        if (isNoRemainder){
            System.out.println("There is no any remainder ");
        }
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
