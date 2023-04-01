package BusinessLogic;
import java.util.Scanner;

public class Appointment{
	private String doc_name,patient_name,day;
	private int ID,patient_id,doctor_id;
	private double charges;
	
	public Appointment(){
		doc_name = "\0";
		patient_name = "\0";
		day = "\0";
		ID = 0;
		charges = 0;
	}
	
	public void createAppt() {
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Doctor Name: ");
		doc_name = account_input.nextLine();
		System.out.println();
		
		Scanner account_input1 = new Scanner(System.in);
		System.out.println("Doctor ID: ");
		doctor_id = account_input1.nextInt();
		System.out.println();
		
		System.out.println("Patient Name: ");
		Scanner account_input2 = new Scanner(System.in);
		patient_name = account_input2.nextLine();
		System.out.println();
		
		System.out.println("Patient ID: ");
		Scanner account_input4 = new Scanner(System.in);
		patient_id = account_input4.nextInt();
		System.out.println();
		
		System.out.println("Day: ");
		Scanner account_input3 = new Scanner(System.in);
		day = account_input3.nextLine();
		System.out.println();
		
		System.out.println("ID: ");
		Scanner account_input6 = new Scanner(System.in);
		ID = account_input6.nextInt();
		System.out.println();
		
		System.out.println("Charges: ");
		Scanner account_input7 = new Scanner(System.in);
		charges = account_input7.nextDouble();
		System.out.println();
		
	}
	
	public void showApptDetails() {
		System.out.print("Doctor Name: ");
		System.out.println(doc_name);
		
		System.out.print("Doctor ID: ");
		System.out.println(doctor_id);
		
		System.out.print("Patient Name: ");
		System.out.println(patient_name);
		
		System.out.print("Patient ID: ");
		System.out.println(patient_id);
		
		System.out.print("Appt ID: ");
		System.out.println(ID);
		
		System.out.print("Day: ");
		System.out.println(day);
		
		System.out.print("Charges: ");
		System.out.println(charges);
		
	}
	
	public void setDocName(String doc_name) {
		this.doc_name = doc_name;
	}
	
	public void setDocID(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	
	public void setPatientName(String patient_name) {
		this.patient_name = patient_name;
	}
	
	public void setPatientID(int patient_id) {
		this.patient_id = patient_id;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	public String getDocName() {
		return doc_name;
	}
	
	public int getDocID() {
		return doctor_id;
	}
	
	public String getPatientName() {
		return patient_name;
	}
	
	public int getPatientID() {
		return patient_id;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getDay() {
		return day;
	}
	
	public double getCharges() {
		return charges;
	}
	
	
}
