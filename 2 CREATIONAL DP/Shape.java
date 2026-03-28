// PROTOTYPE DP

// TODO: Define an abstract class called 'Shape' that implements 'Cloneable'
// TODO: Define a private field 'color' of type String
// TODO: Create a constructor that takes a 'color' parameter and sets the color field
// TODO: Create a 'getColor' method that returns the color
// TODO: Define an abstract method named 'cloneShape'
// TODO: Override the 'clone' method from 'Cloneable' interface

// TODO: Define a class called 'Circle' that extends 'Shape'
// TODO: Define a private field 'radius' of type int
// TODO: Create a constructor that takes 'color' and 'radius' parameters and initializes the fields
// TODO: Create a 'getRadius' method that returns the radius
// TODO: Implement the 'cloneShape' method which returns a new Circle object with the same color and radius
// TODO: Create a method 'showDetails' to print the details of the Circle

// TODO: Define a class called 'Rectangle' that extends 'Shape'
// TODO: Define private fields 'width' and 'height' of type int
// TODO: Create a constructor that takes 'color', 'width', and 'height' parameters and initializes the fields
// TODO: Create 'getWidth' and 'getHeight' methods that return the width and height respectively
// TODO: Implement the 'cloneShape' method which returns a new Rectangle object with the same color, width, and height
// TODO: Create a method 'showDetails' to print the details of the Rectangle

// TODO: Create an original Circle object and a clone of it
// TODO: Display details of the original and cloned circles
// TODO: Create an original Rectangle object and a clone of it
// TODO: Display details of the original and cloned rectangles

public abstract class Shape implements Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract Shape cloneShape();

    @Override
    protected Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Circle
        Circle originalCircle = new Circle("Red", 10);
        Circle clonedCircle = (Circle) originalCircle.cloneShape();

        originalCircle.showDetails(); // Circle - Color: Red, Radius: 10
        clonedCircle.showDetails(); // Circle - Color: Red, Radius: 10

        // Rectangle
        Rectangle originalRectangle = new Rectangle("Blue", 20, 15);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.cloneShape();

        originalRectangle.showDetails(); // Rectangle - Color: Blue, Width: 20, Height: 15
        clonedRectangle.showDetails(); // Rectangle - Color: Blue, Width: 20, Height: 15
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape cloneShape() {
        return new Circle(getColor(), radius);
    }

    public void showDetails() {
        System.out.println("Circle - Color: " + getColor() + ", Radius: " + radius);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(getColor(), width, height);
    }

    public void showDetails() {
        System.out.println("Rectangle - Color: " + getColor() + ", Width: " + width + ", Height: " + height);
    }
}