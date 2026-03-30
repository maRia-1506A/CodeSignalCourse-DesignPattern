// ADAPTER DP

// TODO: Define the Hdmi interface
// It should have a method: void connectWithHdmiCable();// TODO: Create the Vga class
// It should have a method: void connectWithVgaCable() that prints "Connected with VGA cable."// TODO: Implement the HdmiAdapter class
// It should implement the Hdmi interface
// It should have a private instance of Vga
// It should have a constructor to initialize the Vga instance
// Implement the connectWithHdmiCable method to call connectWithVgaCable on the Vga instancepublic class Main {

// TODO: Create an instance of Vga
// TODO: Create an instance of HdmiAdapter using the Vga instance
// TODO: Use the adapter to connect with HDMI interface
// It should print "Connected with VGA cable."

interface Hdmi {
    void connectWithHdmiCable();
}

public class Vga {
    public void connectWithVgaCable() {
        System.out.println("Connected with VGA cable.");
    }

    public static void main(String[] args) {
        // Create Vga
        Vga vga = new Vga();

        // Create Adapter
        Hdmi adapter = new HdmiAdapter(vga);

        // Use adapter
        adapter.connectWithHdmiCable();
    }
}

class HdmiAdapter implements Hdmi {
    private Vga vga;

    public HdmiAdapter(Vga vga) {
        this.vga = vga;
    }

    public void connectWithHdmiCable() {
        vga.connectWithVgaCable();
    }
}
