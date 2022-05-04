public class JobShareEmployee extends SalariedEmployee
{
	/*
		Glennon Langan
		CISC 230
		Dr. Jarvis
		Feburary 26, 2019

		This class creates JobShareEmployee objects
		This class extends from SalariedEmployee
		which extends from the abstract class, Employee

		JobShareEmployees have an annual salary but only work
		a percentage of the time a normal salaried employee
		would and gets paid that same percentage of their
		base salary

		Instance Variables:
			percentEmployed
				percentEmployed is a private double that
				affects the amount of pay the employee
				recieves as a result of them working that
				percentage of time a normal salaried employee
				would

		Constructors:
			JobShareEmployee(Name name, double annualSalary, double percentEmployed)
				uses the SalariedEmployee constructor for
				name and annualSalary
				Checks that percentEmployed is greater than zero
				and less than 100
				if not it will throw an IllegalArgumentException
				if it passes the instance variable, percentEmployed,
				is set to the formal parameter, percentEmployed

		Methods:
			public double getPercentEmployed()
				returns the instance variable, percentEmployed

			public double WeeklyPay()
				Overrides the WeeklyPay() method in SalariedEmployee
				and takes the WeeklyPay() from that class and
				multiplies by the percentEmployed / 100 to determine
				the weekly pay of a JobShareEmployee

		Modification History:
			Feburary 26, 2019
				Original Version

			Feburary 27, 2019
				Updated the getWeeklyPay() method
				to get only two decimal places

			March 3, 2019
				Updated documentation
	*/

	// instance variable
	private double percentEmployed;

	public JobShareEmployee(Name name, double annualSalary, double percentEmployed)
	{
		// constructor
		// uses the constructor from the SalariedEmployee class
		// for name and annualSalary
		// checks that percentEmployed is greater than zero and less than 100
		super(name, annualSalary);
		if(percentEmployed <= 0 || percentEmployed >= 100)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: the percentEmployed cannot be zero or less nor can it be 100 or greater. The parameter entered had a value of: " + percentEmployed);
		this.percentEmployed = percentEmployed;
	}// JobShareEmployee(Name, double, double)

	public double getPercentEmployed()
	{
		// accessor
		// returns the instance variable, percentEmployed
		return percentEmployed;
	}// getPercentEmployed()

	@Override
	public double getWeeklyPay()
	{
		// uses the getWeeklyPay() from SalariedEmployee
		// and multiplies it by percentEmployed
		// is rounded and then divided by 100
		// to get the format XXXX.XX
		double pay = super.getWeeklyPay() * getPercentEmployed();
		pay = Math.round(pay);
		pay = pay / 100;

		return pay;
	}// getWeeklyPay()
}// end of class