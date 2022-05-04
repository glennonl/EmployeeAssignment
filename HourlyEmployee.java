public class HourlyEmployee extends Employee
{
	/*
		Glennon Langan
		CISC 230
		Dr. Jarvis
		Feburary 26, 2019

		The purpose of this class is to
		create an HourlyEmployee object
		This class extends from the
		abstract class Employee

		Instance Variables:
			hoursWorked
				hoursWorked is a private double
				that holds the value of how many
				hours the employee worked in
				one week

			ratePerHour
				ratePerHour is a private double
				that holds the amount of money
				the employee recieves per hour
				of work

		Constructor:
			HourlyEmployee(Name name, double ratePerHour, double hoursWorked)
				Utilizes the constructor in the abstract class, Employee, with
				Name name and then checks the other formal parameters
				Once the checks are passed the formal parameters are assigned
				to their corresponding instance variables

		Methods:
			public double getRatePerHour()
				returns the instance variable ratePerHour

			public double getHoursWorked()
				returns the instance variable hoursWorked

			public double getWeeklyPay()
				Overrides the abstract method in the
				Employee class
				returns getRatePerHour() * getHoursWorked()

		Modification Histoy:
			Feburay 26, 2019
				Original Version

			Feburary 27, 2019
				Updated getWeeklyPay() to always return a double
				with a max of two decimal places
	*/

	// instance variables
	private double hoursWorked;
	private double ratePerHour;

	public HourlyEmployee(Name name, double ratePerHour, double hoursWorked)
	{
		// constructor
		// uses constructor in the abstract class
		// checks formal parameters
		super(name);
		if(ratePerHour <= 0)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: the formal parameter ratePerHour can not be less than or equal to zero. The value passed in was: " + ratePerHour);
		if(hoursWorked <= 0)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: the formal parameter hoursWorked can not be less than or equal to zero. The value passed in was: " + hoursWorked);

		this.ratePerHour = ratePerHour;
		this.hoursWorked = hoursWorked;
	}// HourlyEmployee(Name, double, double)

	public double getRatePerHour()
	{
		// accessor
		// returns the instance variable ratePerHour
		return ratePerHour;
	}// getRatePerHour

	public double getHoursWorked()
	{
		// accessor
		// returns the instance variable hoursWorked
		return hoursWorked;
	}// getHoursWorked()

	public double getWeeklyPay()
	{
		// Overrides the abstract method in Employee class
		// returns how much the employee will be paid this week
		double pay = getRatePerHour() * getHoursWorked();
		pay = pay * 100;
		pay = Math.round(pay);
		pay = pay / 100;

		return pay;
	}// getWeeklyPay()
}// end of class