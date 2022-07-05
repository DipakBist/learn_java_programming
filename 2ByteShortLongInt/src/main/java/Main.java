package com.example.byteshortlongint;

public class Main {

    public static void main(String[] args){
        int myValue=10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value ="+(myMaxIntValue+1));
        System.out.println("Busted MIN value ="+ (myMinIntValue-1));

        int myMaxIntTest = 2147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = "+myMinByteValue);
        System.out.println("Byte maximum value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = "+myMinShortValue);
        System.out.println("short maximum value = "+myMaxShortValue);
        
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = "+myMinLongValue);
        System.out.println("long maximum value = "+myMaxLongValue);

        long myMaxLongTest = 2147_483_647_374L;
        System.out.println(myMaxLongTest);

//        short bigShortLiteralValue = 32768; Here error occurs bcoz the assigned value exceeds the maximum range value of short
        short bigShortLiteralValue = 32767;


//        casting in java: casting means to treat or convert a number from one type to another. We put the type we want the number to be in parenthesis like this:
//        (byte)(myMinByteValue/2);
//         Other languages have casting, this is not java thing
        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue=(short) (myMinShortValue/2);
        

    }
}
