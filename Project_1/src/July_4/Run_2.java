package July_4;

public class Run_2 {
public static void main(String[] args) {
	Employee E=new FullTimeEmployee();
	System.out.println(E.calculateSalary(1000));
	
	Employee k=new PartTImeEmployee();
	System.out.println(k.calculateSalary(100));
}
}
