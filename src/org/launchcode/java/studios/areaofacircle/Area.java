package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
 System.out.println("Enter the Radius of the Circle: ");
        Scanner input = new Scanner(System.in);
        Double radius = input.nextDouble();
        Double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is " + area);
    }
}