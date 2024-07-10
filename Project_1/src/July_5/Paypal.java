package July_5;

public class Paypal implements Payment_Method{
    
	private int amount;
	private String Email;
	
	public Paypal(int amount,String Email) {
	this.amount=amount;
	this.Email=Email;
	}
	public void Pay() {
	System.out.println("Pay: " + amount);	
	}

	public String getpaymentdetails() {
	return "Payment Details: " +Email;
	}

}
