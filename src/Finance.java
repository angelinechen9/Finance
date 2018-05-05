
public class Finance {
	private int monthlysalary;
	private int studentloan;
	private int carloan;
	private int homeloan;
	private int ira;
	private int[] other;
	
	public Finance(int monthlysalary, double taxrate, int studentloan, int carloan, int homeloan, int ira, int[] other) {
		this.monthlysalary = (int) (monthlysalary * (1 - taxrate));
		this.studentloan = studentloan;
		this.carloan = carloan;
		this.homeloan = homeloan;
		this.ira = ira;
		this.other = other;
	}
	
	/**
	 * calculates the present value
	 * @param r the annual interest rate
	 * @param k the payment interval
	 * @param t the time period
	 * @param PV the loan amount
	 * @return the monthly payment
	 */
	public static int presentvalue(double r, int k, int t, int PV) {
		int R = (int) (PV / ((1 - Math.pow(1 + (r / k), -(k * t))) / (r / k)));
		return R;
	}
	
	/**
	 * calculates the future value
	 * @param R the monthly payment
	 * @param r the annual interest rate
	 * @param k the payment interval
	 * @param t the time period
	 * @return the total payment
	 */
	public static int futurevalue(int R, double r, int k, int t) {
		int FV = (int) (R * ((Math.pow(1 + (r / k), k * t) - 1) / (r / k)));
		return FV;
	}
	
	/**
	 * gets the monthly salary
	 * @return the monthly salary
	 */
	public int getmonthlysalary() {
		return this.monthlysalary;
	}
	
	/**
	 * sets the monthly salary
	 * @param monthlysalary the monthly salary
	 */
	public void setmonthlysalary(int monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	
	/**
	 * gets the student loan
	 * @return the student loan
	 */
	public int getstudentloan() {
		return this.studentloan;
	}
	
	/**
	 * sets the student loan
	 * @param studentloan the student loan
	 */
	public void setstudentloan(int studentloan) {
		this.studentloan = studentloan;
	}
	
	/**
	 * gets the car loan
	 * @return the car loan
	 */
	public int getcarloan() {
		return this.carloan;
	}
	
	/**
	 * sets the car loan
	 * @param carloan the car loan
	 */
	public void setcarloan(int carloan) {
		this.carloan = carloan;
	}
	
	/**
	 * gets the home loan
	 * @return the home loan
	 */
	public int gethomeloan() {
		return this.homeloan;
	}
	
	/**
	 * sets the home loan
	 * @param homeloan the home loan
	 */
	public void sethomeloan(int homeloan) {
		this.homeloan = homeloan;
	}
	
	/**
	 * gets the IRA
	 * @return the IRA
	 */
	public int getira() {
		return this.ira;
	}
	
	/**
	 * sets the IRA
	 * @param ira the IRA
	 */
	public void setira(int ira) {
		this.ira = ira;
	}
	
	/**
	 * gets the other expenses
	 * @return the other expenses
	 */
	public int[] getother() {
		return this.other;
	}
	
	/**
	 * sets the other expenses
	 * @param other the other expenses
	 */
	public void setother(int[] other) {
		this.other = other;
	}
	
	/**
	 * calculates the net income
	 * @return the net income
	 */
	public int netincome() {
		int other = 0;
		for (int i = 0; i < this.other.length; i++) {
			other = other + this.other[i];
		}
		int netincome = this.monthlysalary - (this.studentloan + this.carloan + this.homeloan + this.ira + other);
		return netincome;
	}
	
	/**
	 * checks if the person can afford the lifestyle
	 * @return true if the person can afford the lifestyle and false if the person cannot afford the lifestyle
	 */
	public boolean afford() {
		int netincome = netincome();
		if (netincome >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
