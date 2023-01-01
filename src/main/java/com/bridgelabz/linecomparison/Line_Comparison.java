package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Line_Comparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
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
        System.out.println("print the value of x1");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value for y1");
        double y3 = sc.nextDouble();
        System.out.println("Enter the value for x2");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value for y2");
        double y4 = sc.nextDouble();

        Double length_of_line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("length of line2 is:" + length_of_line2);

        if (length_of_line1.equals(length_of_line2)) {
            System.out.println("line1 and line2 are equal");
        } else {
            System.out.println("line1 and line2 are not equal");
        }

    }

    }
