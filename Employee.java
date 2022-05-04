abstract public class Employee
{
	/*
		Glennon Langan
		CISC 230
		Dr. Jarvis
		Feburary 26, 2019

		The class is an abstract class that all classes in the directory
		are related to

		Instance Variables:
			name
				name is a private Name object

		Constructors:
			Employee(Name name)
				assigns the Name object formal parameter, name, to
				the instance variable, name, after making sure the
				formal parameter's value isn't null

		Methods:
			public Name getName()
				returns the instance variable, name,
				which is a Name object

			public void setName(Name name)
				sets the instance variable, name,
				to the formal parameter, name.

			public String getFullName()
				returns the getFullName() method
				from the Name class, which returns
				a String in the format
				'last, first middle'

			abstract public double getWeeklyPay()
				uses the method with the same signature from its subclasses

		Modification History:
			Feburary 26, 2019
				Original Version
	*/

	// instance variable
	private Name name;

	public Employee(Name name)
	{
		// constructor
		// checks that the formal parameter is not null
		if(name == null)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: object passed into the constructor has a value of null: " + name);
		this.name = name;
	}// Employee(Name)

	public Name getName()
	{
		// accessor
		// returns the instance variable, name
		return name;
	}// getName()

	public void setName(Name name)
	{
		// mutator
		// changes the instance variable to the formal parameter
		this.name = name;
	}// setName(Name)

	public String getFullName()
	{
		// uses the getFullName from the Name class
		// returns a String in the format
		// last, first middle
		return getName().getFullName();
	}// getFullName()

	abstract public double getWeeklyPay();
	// uses methods with same signature from associated subclass

}// end of class