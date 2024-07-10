package July_3;

public class Bank {

	public double deposit(double amount) {
	return amount;	
	}
	
	public double deposit(double amount,double intrest) {
		System.out.println("Deposit:" + amount);
		return amount * (intrest/ 100);	
	}
	
	public static void main(String[] args) {
		Bank b=new Bank();
		
		System.out.println("Fixed Deposit:" + b.deposit(1000));
		System.out.println("Depositing amount with intrest:" + b.deposit(4000,8));
	}
}
