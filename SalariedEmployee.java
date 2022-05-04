public class SalariedEmployee extends Employee
{
	/*
		Glennon Langan
		CISC 230
		Dr. Jarvis
		Feburary 26, 2019

		This class creates SalariedEmployee objects, a type of Employee
		This class extends from the abstract class Employee

		Instance Variables:
			annualSalary
				annualSalary is a private double that
				represents the total amount of money
				an employee will be paid in a year

		Constructors:
			SalariedEmployee(Name name, double annualSalary)
				uses the constructor from the abstract class
				Employee with Name name
				Checks that formal parameter annualSalary is
				greater than zero and if it is the instance
				variable, annualSalary, to the formal parameter

		Methods:
			public double getAnnualSalary()
				returns the instance variable annualSalary

			public double getWeeklyPay()
				overrides the abstract method in the
				abstract class, Employee
				returns getAnnualSalary() / 52

		Modification Histoy:
			Feburary 26, 2019
				Original Version

			Feburary 27, 2019
				Updated getWeeklyPay() to return a
				double with a max of two decimal places

			March 3, 2019
				Updated documentation
	*/

	// instance variable
	private double annualSalary;

	public SalariedEmployee(Name name, double annualSalary)
	{
		// constructor
		// uses the constructor from the abstract class Employee
		// checks that annualSalary is greater than zero
		// if it is, sets the instance variable to the formal parameter
		super(name);
		if(annualSalary <= 0)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: the formal parameter annualSalary can not be less than or equal to zero. The value passed in was: " + annualSalary);
		this.annualSalary = annualSalary;
	}// SalariedEmployee(Name, double)

	public double getAnnualSalary()
	{
		// accessor
		// returns the instance variable annualSalary
		return annualSalary;
	}// getAnnualSalaty()

	public double getWeeklyPay()
	{
		// overrides the abstract method in the
		// abstract class, Employee
		// rounds to the nearest hundreth by
		// multiplying by 100 and after it is rounded
		// dividing by 100 to
		// return in the format XXXX.XX
		double pay = (getAnnualSalary() / 52) * 100;
		pay = Math.round(pay);
		pay = pay / 100;

		return pay;
	}// getWeeklyPay()
}// end of class