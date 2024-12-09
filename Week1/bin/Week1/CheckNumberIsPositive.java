package Week1;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		CheckNumberIsPositive obj=new CheckNumberIsPositive();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    	System.out.println("Enter number");
	    		obj.checkNumber(myObj.nextFloat());
	}
	
	
	public void checkNumber(float f)
	{
		if(f < 0)
		{
			System.out.println("Negative number");
		}
		else
			System.out.println("Positive number");
	}

}
