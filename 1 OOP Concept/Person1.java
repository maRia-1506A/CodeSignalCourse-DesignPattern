// ENCAPSULATION 

public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Update the setAge method to reject negative values
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age can ot be negative");
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // TODO: Create a Person object with a negative age
        Person1 p1= new Person1("Alice", -30);
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());

        p1.setName("Bob");
        p1.setAge(-5);
        System.out.println("Name: " + p1.getName() + ", Age: " + p1.getAge());
    }

}
