package BusinessLogic;

public class Payment {

	private String paymentnumber;
	private String accountnumber;
	private double amount;
	
	
	Payment(String a, String pn, double ab)
	{
		paymentnumber =a;
		accountnumber = pn;
		amount = ab;
	}
	
	public void setaccnumber(String a)
	{
		accountnumber = a;
	}
	
	public String getaccn()
	{
		return accountnumber;
	}
	
	public void setpaynumber(String pn) {
		paymentnumber = pn;
	}
	
	public String getpayn()
	{
		return paymentnumber;
	}
	
	public void setamount(double x)
	{
		amount = x;
	}
	
	public double getamount()
	{
		return amount;
	}
	
	public String getpaymentnumber()
	{
		String id = "Transaction : " + paymentnumber;
		//paymentnumber++;
		return id;
	}
	
	
	
}
