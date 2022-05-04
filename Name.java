public class Name
{
	/*
		Glennon Langan
		CISC 230
		Dr. Jarvis
		Feburary 26, 2019

		The purpose of this class is to create a Name object that is used by
		the abstract Employee class with methods to access and use
		individual parts of the name as well as return the formatted entire name

		Instance Variables:
			name
				name is a private String that holds the name in the format 'last, first, middle'

		Constructors:
			Name(String name)
				this constructor checks that the String passed in is not a zero length String
				if the String is zero it will throw an IllegalArgumentException
				if it passes the parameter check it will set the formal parameter, name,
				to the instance variable, name.

		Methods:
			public String getFullName()
				returns a string in the format
				'lastName, firstName middleName'

			public String getLastName()
				returns getField(0)
				which returns a String with
				only the last name

			public String getFirstName()
				returns getField(1)
				which returns a String with
				only the first name

			public String getMiddleName()
				returns getField(2)
				which returns a String with
				only the middle name

			public String getInitials()
				returns the first letter of each name
				in the order first, middle, last
				formatted as FML

			private String getField(int i)
				returns part of the name based on
				the value of formal parameter
				0 = LastName
				1 = FirstName
				2 = MiddleName

			private getName()
				returns the original String passed into the constructor

			Modification History:
				Feburary 26, 2019
					Original Version
	*/

	// instance variable
	private String name;

	public Name(String name)
	{
		// constructor
		// checks that the formal parameter is not an empty string
		// assigns it to the instance variable
		if (name.length() == 0)
			throw new IllegalArgumentException(getClass().getName() + ".constructor: the formal parameter name is empty, enter a valid name: " + name);
		this.name = name;
	}// Name(String)
	public String getFullName()
	{
		// accessor
		// returns the full name in the format 'last, first middle'
		String result;

		result = getLastName() + ", " + getFirstName() + " " + getMiddleName();
		// checks if there is just a last name
		// if there is only will return the last name
		if(getFirstName().length() == 0)
			result = getLastName();

		return result;
	}// getFullName()
	public String getLastName()
	{
		// returns the value returned by getField(0)
		return getField(0);
	}// getLastName()
	public String getFirstName()
	{
		// returns the value returned by getField(1)
		return getField(1);
	}// getFirstName()
	public String getMiddleName()
	{
		// returns the value returned by getField(2)
		return getField(2);
	}// getMiddleName()

	public String getInitials()
	{
		// returns the first letter of the
		// first name, middle name, and last name
		// in the format FML
		boolean complete;
		int 	i;
		String  result;

		complete = false;
		i = 1;
		result = "";
		/*
			i starts at 1 to be passed into getField(int i)
			i is increased by 1 after it is used in getField(int i)
			once i reaches 3 it is set back to 0
			the bolean case is set to true and ends the loop when
			i is equal to 1 again
		*/
		while(complete == false)
		{
			if (getField(i).length() > 0)
			{
				result = result + getField(i).substring(0,1).trim();
			}
			i = i + 1;
			if(i == 3)
			{
				i = 0;
			}
			if(i == 1)
			{
				complete= true;
			}
		}

		return result;
	}// getInitials()
	private String getField(int i)
	{
		/*
			returns part of the name based on
			the value of formal parameter
			0 = LastName
			1 = FirstName
			2 = MiddleName
		*/
		int    end;
		String field;
		String hold;
		int    start;
		hold = getName() + ",,,";
		end = hold.indexOf(",");
		start = 0;
		for(int j = 0; j < i; j++)
		{
			start = end + 1;
			end = hold.indexOf(",", start);
		}
		field = hold.substring(start, end).trim();

		return field;
	}// getField(int)
	private String getName()
	{
		// accessor
		// returns the original String passed into the constructor
		return name;
	}// getName()

}// end of class