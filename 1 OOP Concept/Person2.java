public class Person2 {
    // TODO: Create private field attributes for 'name' and 'age'
    // TODO: Create a constructor for 'name' and 'age'
    // TODO: Create setter methods for 'name' and 'age'
    // TODO: Create getter methods for 'name' and 'age'

    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person2 person = new Person2("Alice", 30);

        person.setAge(25);
        person.setName("Bob");

        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());

    }

}