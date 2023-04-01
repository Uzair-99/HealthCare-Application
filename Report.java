package BusinessLogic;
import Database.DBHandler;

public class Report {
		
		private int transactions;
		private String timeperiod;
		private int revenue;
		private int cost = 2000;
		public Report(int a, String b, int c)
		{
			transactions = a;
			timeperiod = b;
			revenue = c;
		}
		
		public int getTransactions() {
			return transactions;
		}
		public void setTransactions(int transactions) {
			this.transactions = transactions;
		}
		public String getTimeperiod() {
			return timeperiod;
		}
		public void setTimeperiod(String timeperiod) {
			this.timeperiod = timeperiod;
		}
		public int getRevenue() {
			return revenue;
		}
		public void setRevenue(int revenue) {
			this.revenue = revenue;
		}
		
		public void showreport(String timep)
		{
			DBHandler h = new DBHandler();
			
			h.showreports(timep);

			
		}
		
		
}
