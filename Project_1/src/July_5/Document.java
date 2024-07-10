package July_5;

public class Document implements Printable{
    
	private String Text;
	public Document(String Text) {
		this.Text=Text;	
	}
	
	public void print() {
        System.out.println("Document Text: " + Text);
    }

}
