package com.codegym.rectangle;

public class Rectangle {
    private double width, height;

    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public double getHeight() {

        return height;
    }

    public double getArea() {

        return width * height;
    }

    public double getPerimeter() {

        return (width + height) * 2;
    }

    public void display() {
        System.out.println("rectangle has the width :" + width + " and the height: " + height);
    }
}
