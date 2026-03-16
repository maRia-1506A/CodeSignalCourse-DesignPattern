// TODO: Define the Animal class with a method makeSound for compile-time polymorphism
// - Include an overloaded makeSound method that accepts a String parameter

// TODO: Create a Dog class that extends Animal
// - Override the makeSound method to print "Bark"

// TODO: Create a Cat class that extends Animal
// - Override the makeSound method to print "Meow"

// TODO: Demonstrate compile-time polymorphism by calling both makeSound methods on an Animal object

// TODO: Demonstrate runtime polymorphism by creating Dog and Cat objects using Animal references and calling the methods

class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    public void makeSound(String sound) {
        System.out.println("Animal makes " + sound);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.makeSound();
        a.makeSound("pee pee");

        Animal dog= new Dog();
        Animal cat= new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}