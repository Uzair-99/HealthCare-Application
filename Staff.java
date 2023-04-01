package BusinessLogic;
import java.util.Scanner;

public class Staff extends User{
	private String role;
	private double wage;
	public Staff(){
		role = "\0";
		wage = 0.0;
	}
	
	public Staff(String name, String address, String phoneno, int id, String password,String r,double b) {
		super(name, address, phoneno, id, password);
		role = r;
		wage =b;
		// TODO Auto-generated constructor stub
		}
	public void createStaff() {
		createUser();
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Role: ");
		role = account_input.nextLine();
		System.out.println();
		
	}
	
	public void showStaffDetails() {
		showUserDetails();
		
		System.out.print("Role: ");
		System.out.println(role);
		System.out.print("Wage: ");
		System.out.println(wage);
		
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
}


