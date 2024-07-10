package june20;

public class Pattern_4 {
	public static void main(String[] args) 
	{
		int j;
		char a='*';
		
	  for (int i = 0; i <6; i++) {
		  for (int j2 =i; j2 < 6; j2++) 
		  {
		  System.out.print(" ");
		  }
		  for ( j = 0; j < i; j++) 
		  {		  
		  System.out.print(a);
		  }
		  System.out.println(" ");
	}
	
}
}
