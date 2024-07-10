package june20;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length of side A: ");
	    double A = s.nextDouble();
	        
	    System.out.print("Enter the length of side B: ");
	    double B = s.nextDouble();
	    
	    System.out.print("Enter the length of side C: ");
	    double C = s.nextDouble();
	    
	    if(A==B && A==C)
	    {
	    	System.out.println("Equilateral");
	    }
	    
	    else if(A==B || B==C)
	    {   
	    	if(A>B || B>C || C>B || B>A)
	    	{
	    	System.out.println("Isosceles");
	    	}
	}
	    else if(A>B || B>A || A>C || )
}
}