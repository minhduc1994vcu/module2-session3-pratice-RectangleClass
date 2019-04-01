package com.codegym.rectangle;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(width, height);
        rectangle1.display();
        System.out.println("area" + rectangle1.getArea());
        System.out.println("perimeter:" + rectangle1.getPerimeter());
        for (int i = 0; i < rectangle1.getHeight(); i++) {
            for (int j = 0; j < rectangle1.getWidth(); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

//        Rectangle rectangle2 = new Rectangle();
//        rectangle2.display();
//        System.out.println("area" + rectangle2.getArea());
//        System.out.println("perimeter:" + rectangle2.getPerimeter());
    }
}
