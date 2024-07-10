package July_1st;

public class Run {
 
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
        vehicle.drive();
        
        CAR car = new CAR();
        car.drive();
        car.honk();
        
        Sports_Car sportsCar = new Sports_Car();
        sportsCar.drive();
        sportsCar.honk();
	}
}
