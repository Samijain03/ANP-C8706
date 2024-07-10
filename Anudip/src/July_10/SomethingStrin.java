package July_10;

import java.util.Iterator;

public class SomethingStrin {
public static void main(String[] args) {
	String s=new String("Welcome");
	
	char arr[] = {'b','a','c','k'};
	
	String s2 = new String(arr);
	
	String j="Bro"; //String Constant Pool
	System.out.println(s + " " + s2 + " " +j);
	
	System.out.println(s.charAt(1));
	System.out.println(s.length());
	System.out.println(s.substring(3));
	System.out.println(s.substring(1, 4));
	System.out.println(s.toUpperCase());
	System.out.println(s.contains("lco"));
	
	String a="Piyush";
	
	for (int i = 0; i < 5; i++) {
		a=a+i;
	}
System.out.println(a);
}
}
