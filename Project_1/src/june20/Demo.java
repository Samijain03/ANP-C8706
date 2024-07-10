package june20;

public class Demo {
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.Display();
	}
}

class Student{
	String Name= "A";
	String Address= "B";
	String Subject= "C";
    
	void Display() {
		System.out.println("Name= " + Name);
		System.out.println("Address= " + Address);
		System.out.println("Subject= " + Subject);
	}
}
