package com.example.floatanddouble;

public class Main {
    public static void main(String[] args){
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum float value = "+ myMinFloatValue);
        System.out.println("Maximum float value = "+ myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minumum double value = "+myMinDoubleValue);
        System.out.println("Maximum double value = "+myMaxDoubleValue);


        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);

//        Challenge
        double numberOfPounds = 200d;
        double numberOfKilograms = 0.45359237d *numberOfPounds;
        System.out.println("Amount in kilogram is = "+ numberOfKilograms);

        double pi= 3.1415927d;
        double anotherNumber = 3_000_000.4_567_3740d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
