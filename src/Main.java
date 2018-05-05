
public class Main {
	public static void main(String[] args) {
		//calculates the student loan
		int studentloan = Finance.presentvalue(.0363, 12, 15, 79292);
		//calculates the car loan
		int carloan = Finance.presentvalue(.0239, 12, 1, 17998);
		//calculates the home loan
		int homeloan = Finance.presentvalue(.03625, 12, 30, 1302894);
		int[] other = {200, 200, 500, 100, 100, 200};
		Finance finance = new Finance(9904, .3, studentloan, carloan, homeloan, 100, other);
		//shows the monthly salary in the budget table
		System.out.println("monthly salary " + finance.getmonthlysalary());
		//shows the student loan in the budget table
		System.out.println("student loan " + -finance.getstudentloan());
		//shows the car loan in the budget table
		System.out.println("car loan " + -finance.getcarloan());
		//shows the home loan in the budget table
		System.out.println("home loan " + -finance.gethomeloan());
		//shows the IRA in the budget table
		System.out.println("IRA " + -finance.getira());
		//shows the other expenses in the budget table
		for (int i = 0; i < finance.getother().length; i++) {
			System.out.println("other " + -finance.getother()[i]);
		}
		//calculates the net income
		System.out.println("net income " + finance.netincome());
		//prints true if the person can afford the lifestyle and false if the person cannot afford the lifestyle
		System.out.println("afford " + finance.afford());
	}
}
