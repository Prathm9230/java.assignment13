package com.bridgelabz.minmax;

public class FindMax<T extends Comparable<T>>{
    T num1;
    T num2;
    T num3;

    public FindMax(T num1, T num2, T num3) {
    }

    public static <T extends Comparable<T>> T testMaximum(T num1, T num2, T num3) {
        if(num1.compareTo(num2) >= 0 && num1.compareTo(num3) >= 0) {
            System.out.println(" num1 is largest ");
            return num1;
        }
        else if(num2.compareTo(num1) >= 0 && num2.compareTo(num3) >= 0) {
            System.out.println(" num2 is largest");
            return num2;
        }
        else
            System.out.println(" num3 is largest");
        return num3;
    }

    public void testMaximum() {
       T max = testMaximum(this.num1, this.num2, this.num3);
       printMax(max);
    }
    public void Maximum(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void printMax(T max) {
        System.out.println(" max = " + max);
    }
}
