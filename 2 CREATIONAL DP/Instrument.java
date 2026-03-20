// TODO: Define an abstract class Instrument with a method called play
// TODO: Create a class Guitar that extends Instrument and implements the play method
// TODO: Create a class Piano that extends Instrument and implements the play method
// TODO: Create a class NullInstrument that extends Instrument and implements the play method
// TODO: Create a class InstrumentFactory with an enum for InstrumentType
// TODO: Add a factory method to create instruments based on the type

// TODO: Create a Main class to test the Instrument factory method
// TODO: Use the InstrumentFactory to create a Guitar and call the play method
// TODO: Use the InstrumentFactory to create a Piano and call the play method
// TODO: Use the InstrumentFactory to create an unsupported instrument (null) and call the play method

// main class 
public abstract class Instrument {
    abstract void play();

    public static void main(String[] args) {
        Instrument guiter= InstrumentFactory.getInstrument(InstrumentFactory.instrumentType.GUITER);
        guiter.play();
        System.out.println();

        Instrument piano= InstrumentFactory.getInstrument(InstrumentFactory.instrumentType.PIANO);
        piano.play();
        System.out.println();

        Instrument nothing= InstrumentFactory.getInstrument(null);
        nothing.play();
    }
}

class Guiter extends Instrument {
    public void play() {
        System.out.println("Guiter is playing");
    }
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Piano is playing");
    }
}

class NullInstrument extends Instrument {
    public void play() {
        System.out.println("No instrument");
    }
}

class InstrumentFactory {
    enum instrumentType{
        GUITER, PIANO;
    }
    public static Instrument getInstrument(instrumentType type){
        if(type==null){
            return new NullInstrument();
        }
        switch (type) {
            case GUITER:
                return new Guiter();
            case PIANO:
                return new Piano();
            default:
                return new NullInstrument();
        }
    }
}
