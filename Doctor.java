
package BusinessLogic;
import java.util.Scanner;

public class Doctor extends User{
	private String specialization;
	private double chargesAppt;
	
	public Doctor(){
		specialization = "\0";
		chargesAppt = 0;
	}
	
	public Doctor(String name, String address, String phoneno, int id, String password,String s,double ac) 
	{
		super(name, address, phoneno, id, password);
		specialization = s;
		//appt_charges = ac;
		// TODO Auto-generated constructor stub
	}
	
	public void createDoctor() {
		createUser();
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Specialization: ");
		specialization = account_input.nextLine();
		System.out.println();
		
		Scanner account_input1 = new Scanner(System.in);
		System.out.println("Appointment Charges: ");
		chargesAppt = account_input1.nextDouble();
		System.out.println();
	}
	
	public void showDocDetails() {
		showUserDetails();
		
		System.out.print("Specialization: ");
		System.out.println(specialization);
		
		System.out.print("Appointment Charges: ");
		System.out.println(chargesAppt);
		
	}
	
	public void setSpecs(String specs) {
		this.specialization = specs;
	}
	
	public void setChargesAppt(double chargesAppt) {
		this.chargesAppt = chargesAppt;
	}
	
	public String getSpecs() {
		return specialization;
	}
	
	public double getChargesAppt() {
		return chargesAppt;
	}
}

