package July_10;

public class String_1 {
public static void main(String[] args) {
	

	String S="hello";
	String AS="Agree";
	String K="hello";
	String G="HELLO";
	System.out.println(S.toUpperCase());
	System.out.println(S.contains("ell"));
	System.out.println(S.length());
	System.out.println(S.substring(1,3));
	System.out.println(S.replace('e', 'a'));
	System.out.println(S.equals(AS));
	System.out.println(S.equals(K));
	System.out.println(S.equalsIgnoreCase(G));
	
	StringBuilder A=new StringBuilder("World");
	System.out.println(A.reverse());
}
}