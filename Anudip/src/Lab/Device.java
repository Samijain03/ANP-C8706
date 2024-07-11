package Lab;

public class Device {
	private String brand;
    private String model;
    private boolean PoweredOn;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.PoweredOn = false;
    }

    public void displayInfo() {
        System.out.println("Device Brand: " + brand);
        System.out.println("Device Model: " + model);
    }
    public void powerOn() {
        if (!PoweredOn) {
            PoweredOn = true;
            System.out.println(brand + " " + model + " is now powered on.");
        } else {
            System.out.println(brand + " " + model + " is already on.");
        }
    }
    public void powerOff() {
        if (PoweredOn) {
            PoweredOn = false;
            System.out.println(brand + " " + model + " is now powered off.");
        } else {
            System.out.println(brand + " " + model + " is already off.");
        }
    }
}

