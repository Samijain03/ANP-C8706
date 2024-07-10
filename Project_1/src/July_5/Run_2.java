package July_5;

public class Run_2 {
public static void main(String[] args) {
Payment_Method Cc=new Credit_Card("9978", "10/12/28");
Cc.Pay();
Cc.getpaymentdetails();

Payment_Method Pa=new Paypal(10000, "@gmail.com");
Pa.Pay();
System.out.println(Pa.getpaymentdetails());
}
}
