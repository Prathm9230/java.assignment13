package com.bridgelabz.minmax;

public class FindMax{
    public static void findMaxInt(Integer num1, Integer num2, Integer num3) {

        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            System.out.println("num1 is largest:" + num1);
        } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
            System.out.println("num2 is largest:" + num2);
        } else {
            System.out.println("num3 is largest:" + num3);
        }
    }
    //UC-2:To find out maximum between three Floats.
    public static void findMaxFloat(Float num1, Float num2, Float num3) {

        if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
            System.out.println("num1 is largest:" + num1);
        } else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
            System.out.println("num2 is largest:" + num2);
        } else {
            System.out.println("num3 is largest:" + num3);
        }
    }
}
