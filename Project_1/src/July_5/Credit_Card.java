package July_5;

public class Credit_Card implements Payment_Method{
    
	private String Card_Number;
	private String Expiry_date;
	
	public Credit_Card(String Card_Number, String Expiry_date) {
		this.Card_Number=Card_Number;
		this.Expiry_date=Expiry_date;
	}
	public void Pay() {
	System.out.println("Card Number: " + Card_Number);	
	}

	public String getpaymentdetails() {
		System.out.println("Card Number: " + Card_Number+ "Expiry Date: " + Expiry_date);
		return null;
	}

}
