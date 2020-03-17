package org.DayOne;

import java.util.GregorianCalendar;

public class Codehw1 {
	public static void main(String[] args) 
	{ boolean leap=false;
	GregorianCalendar gg= new GregorianCalendar();
	int year=Integer.parseInt(args[0]);
		 if(year>=1582)
	        {
	            if(year % 100 != 0&& year%4==0|| year%400==0)
	            leap=true;
	            else   
	            leap = false;
	}
		 else leap = false;



if(leap)
System.out.println("It's a Leap year");
else
System.out.println("Not a leap year");
	}

}
