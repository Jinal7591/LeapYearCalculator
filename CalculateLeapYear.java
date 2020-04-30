package main;

import java.util.Scanner;

public class CalculateLeapYear {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
				  System. out. print("Enter any year:");
				  int year = s. nextInt();
         
		 System.out.println(checkYear(year) ? "Leap Year" : 
             "Not a Leap Year" );
	}
	
	  public static boolean checkYear(int year) 
	    {  
	    return (((year % 4 == 0) && (year % 100 != 0)) || 
	            (year % 400 == 0)); 
	    } 

}
