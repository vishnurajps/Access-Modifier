package AccessModifier;

public class BankAccount {
	public String bankname;
	int accountnumber;
	private double balance;
	
	public void display() {
		System.out.println(bankname);
		System.out.println(accountnumber);
		System.out.println(balance);
	}
	
	public void setvalues(String bn, int an, double b)
	{
		bankname = bn;
		accountnumber = an;
		balance = b;
	}
	
		
	public static void main(String[] args)
	{
		BankAccount details = new BankAccount();
		details.setvalues("SBI Bank", 123456789, 10000000);
		details.display();
	}
}
