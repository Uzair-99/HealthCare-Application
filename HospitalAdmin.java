package BusinessLogic;
import java.util.Scanner;

public class HospitalAdmin {
	
	private String username,password;
	private Patient patients[];
	private int patients_count;
	private Staff staffs[];
	private int staff_count;
	private Doctor doctors[];
	private int doc_count;
	private Appointment appts[];
	private int appts_count;
	
	public HospitalAdmin(){
		username = "\0";
		password = "\0";
		patients_count = 0;
		staff_count = 0;
		doc_count = 0;
		appts_count = 0;
	}

	
	public void createPatient() {
		
		Patient patients_new[] = new Patient[patients_count + 1];
	    for(int i = 0; i < patients_count; i++){
	    	patients_new[i] = patients[i];
	    }
	    
	    patients = patients_new; //patients will point to same mem as patients_new
	    
	   // patients[patients_count] = new Patient();
	    
	    //System.out.println(savings_count + ", " + savings.length);
	    
	    patients[patients_count].createPatient();
	    
	    patients_count++;
	}
	
	public void createAppt() {
		Appointment appointments_new[] = new Appointment[appts_count + 1];
        for(int i = 0; i < appts_count; i++){
        	appointments_new[i] = appts[i];
        }
        
        appts = appointments_new; //patients will point to same mem as patients_new
        
        appts[appts_count] = new Appointment();
        
        //System.out.println(savings_count + ", " + savings.length);
        
        //appts[appts_count].createAppt();	will make this in the setAppt function
        
        appts_count++;	
	}
	
	public void createStaff() {
		Staff staff_new[] = new Staff[staff_count + 1];
        for(int i = 0; i < staff_count; i++){
        	staff_new[i] = staffs[i];
        }
        
        staffs = staff_new; //patients will point to same mem as patients_new
        
        staffs[staff_count] = new Staff();
        
        //System.out.println(savings_count + ", " + savings.length);
        
        staffs[staff_count].createStaff();
        
        staff_count++;
	}
	
	public void createDoctor() {
		Doctor doctors_new[] = new Doctor[doc_count + 1];
        for(int i = 0; i < doc_count; i++){
        	doctors_new[i] = doctors[i];
        }
        
        doctors = doctors_new; //patients will point to same mem as patients_new
        
        doctors[doc_count] = new Doctor();
        
        doctors[doc_count].createDoctor();
        
        doc_count++;
	}
	
	public void editDoctorDetails() {
		int doctor_id = 0;
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Enter Doctor ID: ");
		doctor_id = account_input.nextInt();
		
		for(int i = 0; i < doc_count; i++) {
			if(doctors[i].getID() == doctor_id) {
				doctors[i].createDoctor();
			}
		}
	}
	
	public void editPatientDetails() {
		int patient_id = 0;
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Enter Patient ID: ");
		patient_id = account_input.nextInt();
		
		for(int i = 0; i < patients_count; i++) {
			if(patients[i].getID() == patient_id) {
				patients[i].createPatient();
			}
		}
	}
	
	public void editStaffDetails() {
		int staff_id = 0;
		
		Scanner account_input = new Scanner(System.in);
		System.out.println("Enter Staff ID: ");
		staff_id = account_input.nextInt();
		
		for(int i = 0; i < staff_count; i++) {
			if(staffs[i].getID() == staff_id) {
				staffs[i].createStaff();
			}
		}
	}
	
	public void deleteDoctor() {
		int local_id;
		Scanner account_input = new Scanner(System.in);
		
        System.out.println("Enter Account ID: \n");
        local_id = account_input.nextInt();
        
    	for(int i = 0; i < doc_count; i++){
    		
            if(doctors[i].getID() == local_id){
            	
                if(doc_count > 1){ //there are multiple accounts in array, we have to reduce the array
                    
                	Doctor doctors_new[] = new Doctor[doc_count - 1];
                    int k = 0;
                    for(int j = 0; j < doc_count - 1; j++){
                        if(k == i)
                            k++;

                        doctors_new[j] = doctors[k];
                        k++;
                    }

                 
                    doctors = doctors_new;
                    doc_count--;
                    
                }
                else if(doc_count == 1){ // there is only one savings account so delete array and state will be same as program starting state.
                	doctors[0] = new Doctor();
                	doc_count--;
                }
            }
        }
	}
	
	public void deleteStaff() {
		int local_id;
		Scanner account_input = new Scanner(System.in);
		
        System.out.println("Enter Account ID: %n");
        local_id = account_input.nextInt();
        
    	for(int i = 0; i < staff_count; i++){
    		
            if(staffs[i].getID() == local_id){
            	
                if(staff_count > 1){ //there are multiple accounts in array, we have to reduce the array
                    
                	Staff staff_new[] = new Staff[staff_count - 1];
                    int k = 0;
                    for(int j = 0; j < staff_count - 1; j++){
                        if(k == i)
                            k++;

                        staff_new[j] = staffs[k];
                        k++;
                    }

                 
                    staffs = staff_new;
                    staff_count--;
                    
                }
                else if(staff_count == 1){ // there is only one savings account so delete array and state will be same as program starting state.
                	staffs[0] = new Staff();
                	staff_count--;
                }
            }
        }
	}
	
	public void deletePatient() {
		int local_id;
		Scanner account_input = new Scanner(System.in);
		
        System.out.println("Enter Account ID: %n");
        local_id = account_input.nextInt();
        
    	for(int i = 0; i < patients_count; i++){
    		
            if(patients[i].getID() == local_id){
            	
                if(patients_count > 1){ //there are multiple accounts in array, we have to reduce the array
                    
                	Patient patients_new[] = new Patient[patients_count - 1];
                    int k = 0;
                    for(int j = 0; j < patients_count - 1; j++){
                        if(k == i)
                            k++;

                        patients_new[j] = patients[k];
                        k++;
                    }

                 
                    patients = patients_new;
                    patients_count--;
                    
                }
                else if(patients_count == 1){ // there is only one savings account so delete array and state will be same as program starting state.
                	//patients[0] = new Patient();
                	patients_count--;
                }
            }
        }
	}
	
	public void setAppt() {
		
		createAppt();
		appts[appts_count - 1].setID(appts_count);
		int temp_patient_id = 0;
		String patient_name;
		
		System.out.println("Enter Patient ID: ");
		Scanner account_input2 = new Scanner(System.in);
		temp_patient_id = account_input2.nextInt();
		
		System.out.println("Enter Patient Name: ");
		Scanner account_input3 = new Scanner(System.in);
		patient_name = account_input3.nextLine();
		
		//System.out.println("Appointment ID: ");
		//System.out.println(appts[appts_count - 1].getID());
		
		int choice = 0;
		
		System.out.println("Do you want to search by: %n 1. Doctor ID %n 2. Specialization %n%n");
		Scanner account_input = new Scanner(System.in);
		choice = account_input.nextInt();
		
		int temp_doctor_id;
        if(choice == 1){
    		System.out.println("Enter Doctor ID: %n");
    		Scanner account_input1 = new Scanner(System.in);
    		temp_doctor_id = account_input1.nextInt();
    		for(int i = 0; i < doc_count; i++) {
    			if(temp_doctor_id == doctors[i].getID()) {
    				appts[appts_count - 1].setDocID(temp_doctor_id);
    				appts[appts_count - 1].setDocName(doctors[i].getName());
    				appts[appts_count - 1].setPatientName(patient_name);
    				appts[appts_count - 1].setPatientID(temp_patient_id);
    				appts[appts_count - 1].setCharges(doctors[i].getChargesAppt());
    			}
    		}
        }
        
        else if(choice == 2) {
        	System.out.println("Enter Specialization: %n 1. Dermatologist %n 2. Gynecologist %n 3. Internal Medicine Specialist %n%n");
    		Scanner account_input4 = new Scanner(System.in);
    		String specs_name;
    		specs_name = account_input4.nextLine();
    		
    		for(int i = 0; i < doc_count; i++) {
    			if(doctors[i].getSpecs() == specs_name) {
    				doctors[i].showDocDetails();
    			}
    		}
    		
    		System.out.println("Enter Doctor ID from above list to set Appointment with: %n");
    		Scanner account_input5 = new Scanner(System.in);
    		int temp_doc_id = account_input5.nextInt();
    		appts[appts_count - 1].setDocID(temp_doc_id);
    		
    		for(int i = 0; i < doc_count; i++) {
    			if(doctors[i].getID() == temp_doc_id) {
    				appts[appts_count - 1].setCharges(doctors[i].getChargesAppt());
    			}
    		}
    		
        }
		
	}
	
	public void showPatients() {
		for(int i = 0; i < patients_count; i++) {
			patients[i].showPatientDetails();
		}
	}
	
	public void showDoctors() {
		for(int i = 0; i < doc_count; i++) {
			doctors[i].showDocDetails();
		}
	}
	
	public void showStaff() {
		for(int i = 0; i < staff_count; i++) {
			staffs[i].showStaffDetails();
		}
	}
	
	public void showAppts() {
		for(int i = 0; i < appts_count; i++) {
			appts[i].showApptDetails();
		}
	}
	
	public void saveToDB() {
		
	}
	
	public void loadDB() {
		
	}
}
