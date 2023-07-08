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
    //UC-3:To find out maximum between three Strings.
    public static void findMaxString(String str1, String str2, String str3) {

        if (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
            System.out.println("num1 is largest:" + str1);
        } else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
            System.out.println("num2 is largest:" + str2);
        } else {
            System.out.println("num3 is largest:" + str3);
        }
    }
}
