package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Line_Comparison {
    double x1, y1, x2, y2, x3, y3, x4, y4;
    double line1, line2;
    static Scanner sc = new Scanner(System.in);

    public static Double welcome() {
        System.out.println("Welcome toLine Comparison Computation Program");
        System.out.println("print the value of x1");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value for y1");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value for x2");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value for y2");
        double y2 = sc.nextDouble();
        Double length_of_line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("length of line1 is:" + length_of_line1);

        System.out.println("print the value of x3");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value for y3");
        double y3 = sc.nextDouble();
        System.out.println("Enter the value for x4");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value for y4");
        double y4 = sc.nextDouble();
        Double length_of_line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("length of line2 is:" + length_of_line2);


        if (length_of_line1.equals(length_of_line2)) {
            System.out.println("line1 and line2 are equal");
        } else {
            System.out.println("line1 and line2 are not equal");

            int value = length_of_line1.compareTo(length_of_line2);
            if (value < 0) {
                System.out.println("length of line 1 is less than length of line 2");
            } else if (value > 0) {
                System.out.println("length of line 1 is greater than length of line 2");
                public void equalsTo () {
                    if (length_of_line1 == length_of_line2) {
                        System.out.println("Lines are equal");
                    } else {
                        System.out.println("Compare to method");
                    }
                }
                public void compareTo () {
                    if (length_of_line1 > length_of_line2) {
                        System.out.println("line1 is greater than line 2");
                    } else {
                        System.out.println("line 2 is greater than line 1");
                    }

                }


            }
        }
        return length_of_line1;
    }
    public static void main(String[] args) {
        welcome();
        Line_Comparison linemethods = new Line_Comparison();
        linemethods.equalsTo();
        linemethods.compareTo();
    }

}
