// DECORATOR DP

// TODO: Define the Beverage interface with a method getDescription returning String
// TODO: Implement the Beverage interface in BasicCoffee class
// TODO: Define the getDescription method to return "Black Coffee"
// TODO: Implement the Beverage interface in BeverageDecorator class
// TODO: Add a private Beverage variable named decoratedBeverage
// TODO: Create a constructor that takes a Beverage object and assigns it to decoratedBeverage
// TODO: Implement the getDescription method that returns decoratedBeverage.getDescription() 
// TODO: Extend the BeverageDecorator class in MilkDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Milk" to the base description.
// TODO: Extend the BeverageDecorator class in SugarDecorator
// TODO: Create a constructor that takes a Beverage object and passes it to the BeverageDecorator constructor
// TODO: Override the getDescription method to add " + Sugar" to the base description.public class Main

// TODO: Create instances of BasicCoffee and wrap them using MilkDecorator and SugarDecorator.
// Print the final descriptions.

public interface Beverage {
    String getDescription();

    public static void main(String[] args) {
        // Coffee with Milk
        Beverage coffeeWithMilk = new MilkDecorator(new BasicCoffee());
        System.out.println(coffeeWithMilk.getDescription());

        // Coffee with Sugar
        Beverage coffeeWithSugar = new SugarDecorator(new BasicCoffee());
        System.out.println(coffeeWithSugar.getDescription());

        // Coffee with Milk + Sugar
        Beverage fullCoffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println(fullCoffee.getDescription());
    }
}

class BasicCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Black Coffee";
    }
}

class BeverageDecorator implements Beverage {
    private Beverage decoratedBeverage;

    public BeverageDecorator(Beverage beverage) {
        this.decoratedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return decoratedBeverage.getDescription();
    }
}

class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Milk";
    }
}

class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Sugar";
    }
}
