// ENCAPSULATION 

public class Gadget {
    private String name;
    // TODO: Add price attribute
    private double price;

    // TODO: Modify the constructor to also accept a price parameter and initialize
    // it using the setter method
    public Gadget(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Add setPrice method with a condition to ensure the price is not set
    // below 50.00, if so, set it to 50.00
    public void setPrice(double price) {
        if (price < 50.0) {
            this.price = 50.0;
        } else {
            this.price = price;
        }
    }

    // TODO: Add getPrice method
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Gadget gadget = new Gadget("Smartphone", 999.99); // Update constructor call once updated
        gadget.setName("Laptop");
        // TODO: Set the price to 49.99
        gadget.setPrice(49.99);

        System.out.println("Name: " + gadget.getName());

        // TODO: Print the price
        System.out.println("Price: " + gadget.getPrice());
    }

}