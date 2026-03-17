// TODO: Define a public class named Triangle that extends the Shape class
// TODO: Declare a private double variable 'side'
// TODO: Create a constructor that accepts a double parameter 'side' and initializes the corresponding class variable
// TODO: Override the area() method to calculate and return the area of an equilateral triangle
// TODO: Override the perimeter() method to calculate and return the perimeter of the triangle

// TODO: Add the Triangle class
// TODO: Instantiate Triangle class with side length 3 - Note: Don't use base class pointer
// TODO: Output its area and perimeter

import java.lang.Math;

abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

class Triangle extends Shape {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    public double perimeter() {
        return 3 * side;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape shape = new Circle(3);
        System.out.println("Area: " + shape.area() + ", Perimeter: " + shape.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());

        Triangle triangle = new Triangle(3);
       System.out.println("Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());

    }
}
