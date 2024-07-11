package Lab;

public class Main {
public static void main(String[] args) {
	
	Device d=new Device("Brand","model");
	d.displayInfo();
	d.powerOn();
	d.displayInfo();
	d.powerOff();
	
	SmartPhone S=new SmartPhone("Iphone", "13", "IOS 17.1", "12 MP");
	S.displaySmartphoneInfo();
	S.takePhoto();
	S.powerOn();
	S.powerOff();
}
}
