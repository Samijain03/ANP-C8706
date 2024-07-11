package Lab;

public class SmartPhone extends Device{
    private String OS;
    private String Cammera;
	
    public SmartPhone(String brand, String model, String OS, String Cammera) {
		super(brand, model);
		this.OS = OS;
		this.Cammera = Cammera;
	}
    
    public void displaySmartphoneInfo() {
        displayInfo();
        System.out.println("Operating System: " + OS);
        System.out.println("Camera Resolution: " + Cammera);
    }

    public void takePhoto() {
        System.out.println("Taking a photo with resolution: " + Cammera);
    }
}