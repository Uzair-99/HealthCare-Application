package BusinessLogic;
import java.util.Scanner;

public class Patient extends User{

	public Patient(String name, String address, String phoneno, int id,double bankbalance )
	{
		this.name = name;
		this.address = address;
		this.phone_no = phoneno;
		this.ID = id;
		//this.password = password;
		this.bank_balance = bankbalance;
	}
	public void createPatient() {
		createUser();
	}
	
	public void showPatientDetails() {
		showUserDetails();
	}
	
}
