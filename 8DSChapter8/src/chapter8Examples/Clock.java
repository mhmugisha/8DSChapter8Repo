

//Precondition: A statement specifying the condition(s) that must be true before the
//function is called.
//Postcondition: A statement specifying what is true after the function call is completed.

package chapter8Examples;

public class Clock {
	private int hr;   //store hours
	private int min;  //store minutes
	private int sec;  //store seconds
	
/*.............................................................................*/
	//Default CONSTRUCTOR
	//Postcondition: hr = 0; min = 0; sec = 0. 
	
	public Clock()
	{
		setTime(0, 0, 0);
	}
/*................................................................................*/	
	//CONSTRUCTOR with parameters, to set the time. Time is set according to the parameters.
	//Postcondition: hr = hours; min = minutes; sec = seconds	
	
	public Clock(int hours, int minutes, int seconds)
	{
		setTime(hours, minutes, seconds);
	}
/*..................................................................................*/
	//METHOD to set the time
	//The time is set according to the parameters.
	//Postcondition: hr = hours; min = minutes; sec = seconds

	public void setTime(int hours, int minutes, int seconds)
	{
		if (0 <= hours && hours < 24)
			hr = hours;
		else hr = 0;
		
		if (0 <= minutes && minutes < 59)
			min = minutes;
		else
			min = 0;

		if (0 <= seconds && seconds < 59)
			sec = seconds;
		else
			sec = 0;
	}
/*....................................................................................*/	
	//METHOD to return the hours. Postcondition: the value of hr is returned.

	public int getHours() 
	{
		return hr;
	}
/*..................................................................................*/	
	//METHOD to return the minutes. Postcondition: the value of min is returned.
	
	public int getMinutes()
	{
		return min;
	}
/*..................................................................................*/	
	//METHOD to return the seconds. Postcondition: the value of sec is returned. 
	
	public int getSeconds()
	{
		return sec;
	}
/*..................................................................................*/	
	//METHOD to print the time
	//Postcondition: Time is printed in the form hh:mm:ss
	public void printTime()
	{
		if (hr < 10)
			System.out.print("0");
		    System.out.print(hr + ":");
		if (min < 10)
			System.out.print("0");
		    System.out.print(min + ":");
		if (sec < 10)
		    System.out.print("0");
		    System.out.print(sec);
	}
/*.....................................................................................*/
	//METHOD to increment the time by one second
	//Postcondition: The time is incremented by one second
	//If the before-increment time is 23:59:59, the time is reset to 00:00:00
	
	public void incrementSeconds()
	{
		sec++;
		if (sec > 59)
			{
				sec = 0;
				incrementMinutes(); //increment minutes
			}
	}
/*....................................................................................*/	
	//METHOD to increment the time by one minute
	//Postcondition: The time is increment by one minute
	//If the pre-increment time is 23:59:53, time is reset to 00:00:53.
	
	public void incrementMinutes()
	{
		min++;
		if(sec > 59)
		{
			sec = 0;
			incrementMinutes(); //increment minutes
		}
	}
/*....................................................................................*/	
	//Method to increment the time by one hour
	//Postcondition: The time is incremented by one hour
	//If the before-increment time is 23:45:53, the time
	//is reset to 00:45:53
	
	public void incrementHours()
	{
		hr++;
		if (hr > 23)
			hr = 0;
	}
	
/*...................................................................................*/	
	//Method to compare two times. Postcondition: Returns true if this time is equal to
	// otherClock; otherwise returns false
	
	public boolean equals(Clock otherClock)
	{
		return (hr == otherClock.hr
		&& min == otherClock.min
		&& sec == otherClock.sec);
	}
/*...................................................................................*/	
	
	//METHOD to copy time. Postcondition: The instance variables of otherClock
	// copied into the corresponding data are members of this time.
	// hr = otherClock.hr;
	// min = otherClock.min;
	// sec = otherClock.sec;
	
	public void makeCopy(Clock otherClock)
	{
		hr = otherClock.hr;
		min = otherClock.min;
		sec = otherClock.sec;
	}
/*....................................................................................*/	
	
	//METHOD to return a copy of timE. Postcondition: A copy of the object is created and
	// a reference of the copy is returned
	
	public Clock getCopy()
	{
		Clock temp = new Clock();
		temp.hr = hr;
		temp.min = min;
		temp.sec = sec;
		
		return temp;
	}
/*.....................................................................................*/	
}
