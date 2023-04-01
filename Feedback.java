
package BusinessLogic;
import java.util.*;

public class Feedback {

	private int feedbacknumber;
	private String feedbackm;
	private String date;
	private int appointmentn;
	

	public Feedback(int n,String fm,String tp ,int g)
	{
		feedbacknumber = n;
		feedbackm = fm;
		date = tp;
		appointmentn= g;
	}
	
	
	public void setfeedback(String f)
	{
		feedbackm =f;	
	}
	
	public String getfeedbackm()
	{
		return feedbackm;
	}
	
	public void setfeedbackn(int n)
	{
		feedbacknumber = n;
	}
	
	public int getfeedbackn()
	{
		return feedbacknumber; 
	}
	
	public void setdate(String t)
	{
		date =t;
	}
	
	public String getdate()
	{
		return date;
	}
	
	public void setapptn(int an)
	{
		appointmentn = an;
	}
	
	public int getapptn()
	{
		return appointmentn;
	}
}

