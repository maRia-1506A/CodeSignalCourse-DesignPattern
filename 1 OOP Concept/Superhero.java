// TODO: Define the Superhero enum
// TODO: Define the constants SUPERMAN, BATMAN, WONDER_WOMAN, and SPIDERMAN with their respective power levels and year introduced
// TODO: Create private final int fields for power level and year introduced
// TODO: Implement a constructor that accepts power level and year introduced as parameters and initializes the corresponding fields
// TODO: Write accessor methods getPowerLevel() and getYearIntroduced() returning int values

public enum Superhero {
    // enum constants
    SUPERMAN(100, 1938),
    BATMAN(85, 1939),
    WONDER_WOMAN(95, 1941),
    SPIDERMAN(90, 1962);

    // private final fields
    private final int powerLevel, yearIntroduction;

    // constructors
    Superhero(int powerLevel, int yearIntroduction) {
        this.powerLevel = powerLevel;
        this.yearIntroduction = yearIntroduction;
    }

    // getter method
    public int getPowerLevel() {
        return powerLevel;
    }

    public int getYearIntroduced() {
        return yearIntroduction;
    }

    // main class
    public static void main(String[] args) {
        for(Superhero hero: Superhero.values()) {
            System.out.println(hero);
            System.out.println("Power level: "+ hero.getPowerLevel());
            System.out.println("Year Introduced: "+hero.getYearIntroduced());
            System.out.println();
        }
    }
}