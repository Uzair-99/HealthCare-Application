package BusinessLogic;
import java.util.Scanner;

public abstract class User {
	protected String name,address,phone_no,password;
	protected int ID;
	protected double bank_balance;
	
	public User() {
		
		name = "\0";
		address = "\0";
		phone_no = "\0";
		ID = 0;
		bank_balance = 0;
		password = "\0";
	}
	public User(String name, String address, String phoneno, int id, String password) {
		super();
		this.name = name;
		this.address = address;
		this.phone_no = phoneno;
		this.ID = id;
		this.password = password;
		}
	
	public void showUserDetails() {
		
		System.out.print("Name: ");
		System.out.println(name);
		
		System.out.print("Password: ");
		System.out.println(password);
		
		System.out.print("ID: ");
		System.out.println(ID);
		
		System.out.print("Bank Balance: ");
		System.out.println(bank_balance);
		
		System.out.print("Address: ");
		System.out.println(address);
		
		System.out.print("Phone: ");
		System.out.println(phone_no);
		
	}
	
	public void createUser() {
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Name: ");
		name = account_input.nextLine();
		System.out.println();
		
		System.out.println("Address: ");
		Scanner account_input2 = new Scanner(System.in);
		address = account_input2.nextLine();
		System.out.println();
		
		System.out.println("Phone No: ");
		Scanner account_input3 = new Scanner(System.in);
		phone_no = account_input3.nextLine();
		System.out.println();
		
		System.out.println("Password: ");
		Scanner account_input5 = new Scanner(System.in);
		password = account_input5.nextLine();
		System.out.println();
		
		System.out.println("ID: ");
		Scanner account_input6 = new Scanner(System.in);
		ID = account_input6.nextInt();
		System.out.println();
		
		System.out.println("Bank Balance: ");
		Scanner account_input7 = new Scanner(System.in);
		bank_balance = account_input7.nextDouble();
		System.out.println();
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNo(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setBankBalance(double bank_balance) {
		this.bank_balance = bank_balance;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNo() {
		return phone_no;
	}
	
	public String getPassword() {
		return password;
	}
	
	public double getBankBalance() {
		return bank_balance;
	}
	
}


