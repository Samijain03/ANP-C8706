package July_3;

public class Calculate {
	
	public double calculateArea(double r) {
		return 3.14*r*r;
	}
	public double calculateArea(double l,double h) {
		return l*h;
	}
	public double calculateArea(double l,double b,double h) {
		return (b*h)/2;
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		
		System.out.println(c.calculateArea(5));
		System.out.println(c.calculateArea(1, 2));
		System.out.println(c.calculateArea(5,5,5));
	}
	}

