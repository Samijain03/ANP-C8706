package July_5;

public class Image implements Printable{
	
	private int a,b;
	
	public Image(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void print() {
	System.out.println("Image Width and height :" + a + " " + b);
	}

}
