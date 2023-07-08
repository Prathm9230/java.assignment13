package com.bridgelabz.minmax;
import java.util.Scanner;
public class TestMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMax obj;

        while(true) {
            System.out.println("1.Integers\n 2.Float\n");
            System.out.print(" Please enter your choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.print(" Please enter the first number: ");
                    Integer num1 = sc.nextInt();

                    System.out.print(" Please enter the second number: ");
                    Integer num2 = sc.nextInt();

                    System.out.print(" Please enter the third number: ");
                    Integer num3 = sc.nextInt();

                    obj = new FindMax<Integer>(num1,num2,num3);
                    obj.testMaximum();
                    break;
                }
                case 2:
                {
                    System.out.print(" Please enter the first number: ");
                    Float num1 = sc.nextFloat();

                    System.out.print(" Please enter the second number: ");
                    Float num2 = sc.nextFloat();

                    System.out.print(" Please enter the third number: ");
                    Float num3 = sc.nextFloat();
                    obj = new FindMax<Float>(num1,num2,num3);
                    obj.testMaximum();
                    break;
                }
                default:
                    System.out.println("Please enter a valid input");
            }

        }
    }

}
