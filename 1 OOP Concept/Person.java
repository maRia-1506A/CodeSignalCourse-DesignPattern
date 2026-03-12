// TODO: Define the Person class
//  - Create private data members 'name' and 'age'
//  - Implement a no-argument constructor that initializes name to "Unknown" and age to 0
//  - Implement a constructor that initializes both data members
//  - Implement a copy constructor with a 'Person' parameter
//  - Implement a 'display' method that prints 'name' and 'age'

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unkknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person(p2);

        p1.display();
        p2.display();
        p3.display();
    }

}