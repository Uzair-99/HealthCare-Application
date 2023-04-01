package Database;

import BusinessLogic.*;
import java.sql.*;
import java.util.ArrayList;


public class DBHandler {
	
	private String username="root";
	private String pass="i201751";
	Connection con;//connection object
	
	
	public void DBHandler() {//default constructor
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/final_projf", username , pass);
			System.out.println("Connection made to DB");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failed");
			e.printStackTrace();
		}
	}
	
    public boolean saveFeedback(Feedback feedback) {		//Feedback function
        int rowsInserted =0 ;
        try{
            DBHandler();
            PreparedStatement statement = con.prepareStatement("INSERT INTO _feedback (feedbacknumber,review,_date,app_id) VALUES (?,?,?,?)");
            //statement.setInt(1, 22);
            //statement.setString(2,"Best");
            //statement.setString(3, "29-2-2022");
            //statement.setInt(4, 11);
            
           statement.setInt(1, feedback.getfeedbackn());
            statement.setString(2,feedback.getfeedbackm());
            statement.setString(3, feedback.getdate());
            statement.setInt(4,feedback.getapptn());
            rowsInserted = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rowsInserted > 0) {
            System.out.println("A new feedback was inserted in the system successfully");
            return true;
        }
        return false;
    }
    
    public boolean savePayment(Payment transaction) {		//Payment Function

    DBHandler();
    int rowsInserted = 0;
        try (PreparedStatement statement = con.prepareStatement("INSERT INTO Payment (paymentnumber, accountnumber, amount) VALUES (?,?,?)")) {
            statement.setString(1, transaction.getpaymentnumber());
            statement.setString(2, transaction.getaccn());
            statement.setDouble(3, transaction.getamount());
            rowsInserted = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rowsInserted > 0) {
            System.out.println("Payment was made successfully");
            return true;
        }
        return false;
    }

    public boolean showreports(String timeperiod){		//Report Function
        Statement stmt;
        //ArrayList<String> BranchIDs = new ArrayList<>();
        try {
            stmt = con.createStatement();
            String sql="Select *from report";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, timeperiod);
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }
            
            return true;
        }
        catch (SQLException e) {
            System.out.println("exception: "+e);
            return false;
        }
    }
    
    //Save Patient

    public boolean savePatient(Patient p1) {		//Feedback function
        int rowsInserted =0 ;
        try{
            DBHandler();
            PreparedStatement statement = con.prepareStatement("INSERT INTO _patient (_name,address, phoneno, id, bankbalance) VALUES (?,?,?,?,?)");
            //statement.setInt(1, 22);
            //statement.setString(2,"Best");
            //statement.setString(3, "29-2-2022");
            //statement.setInt(4, 11);
            
            statement.setString(1,p1.getName());
            statement.setString(2, p1.getAddress());
            statement.setString(3, p1.getPhoneNo());
            statement.setInt(4, p1.getID());
            statement.setDouble(5, p1.getBankBalance());
            rowsInserted = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rowsInserted > 0) {
            System.out.println("A new feedback was inserted in the system successfully");
            return true;
        }
        return false;
    }
    

    
    
    public boolean saveDoctor(Doctor p1) {		//Feedback function
        int rowsInserted =0 ;
        try{
            DBHandler();
            PreparedStatement statement = con.prepareStatement("INSERT INTO doctorr (_name,address, phoneno, id, specialization, app_charges) VALUES (?,?,?,?,?,?)");
            //statement.setInt(1, 22);
            //statement.setString(2,"Best");
            //statement.setString(3, "29-2-2022");
            //statement.setInt(4, 11);
            
            statement.setString(1,p1.getName());
            statement.setString(2, p1.getAddress());
            statement.setString(3, p1.getPhoneNo());
            statement.setInt(4, p1.getID());
            statement.setString(5, p1.getSpecs());
            statement.setDouble(6, p1.getChargesAppt());
            rowsInserted = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rowsInserted > 0) {
            System.out.println("A new feedback was inserted in the system successfully");
            return true;
        }
        return false;
    }
    
    
    public boolean searchPatient(String _name,String password) {
        Statement stmt;
        try {
        	DBHandler();
            stmt = con.createStatement();
            String sql="Select * from Customers where name = ?AND password = ? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, _name);
            statement.setString(2, password);
            ResultSet rs= stmt.executeQuery(sql);
            if(rs.next()) {
                return true;
            }
        }
        catch (SQLException e) {
            System.out.println("exception: "+e);
            return false;
        }
        return false;
    }

    
	}
