/*
 * Programmer: Tre' Jeter
 * 
 * Purpose: Solve Laplace Transforms using Laplace Identity 
 * methods with an inputted number
 * Excludes some methods from the Laplace Table
 * 
 * Date: August 3, 2020
*/

import java.util.*;
import java.lang.Math;

public class Laplacian 
{
	public static Scanner number = new Scanner(System.in);
	public static Scanner scan = new Scanner(System.in);
	public static Scanner quit = new Scanner(System.in);
	public static int inputtedNum = 0;
	public static String variable = "t";
	public static String laplace = "";
	public static String num = "";
	public static String extra = "";
	public static String format = "";
	public static String denominator = "";
	
	public static void main(String [] args)
	{
		System.out.println("Please enter a number");
		inputtedNum = number.nextInt();
		
		while(true) 
		{
			System.out.println("Which method would you like the Laplace computed in?");
			System.out.println("1.) Laplace of a number --> L{a} ");
			System.out.println("2.) Laplace of t or a number times t --> L{at} ");
			System.out.println("3.) Laplace of t raised to a power n --> L{t^n} ");
			System.out.println("4.) Laplace of a number divided by the square root of t --> L{a/sqrt(t)} ");
			System.out.println("5.) Laplace of e raised to a power times t --> L{e^(at)} ");
			System.out.println("6.) Laplace of t times e raised to a power times t --> L{te^(at)} ");
			System.out.println("7.) Laplace of t raised to a power times e raised to a power times t --> L{t^n * e^(at)} ");
			System.out.println("8.) Laplace of the sine of a number times t --> L{sin(at)} ");
			System.out.println("9.) Laplace of the cosine of a number times t --> L{cos(at)} ");
			System.out.println("10.) Laplace of 1 minus the cosine of a number times t --> L{1 - cos(at)} ");
			System.out.println("11.) Laplace of a number times t minus the sine of a number times t --> L{at - sin(at)} ");
			System.out.println("12.) Laplace of the sine of a number times t minus that number times t multiplied by the cosine of that number times t --> L{sin(at) - at[cos(at)]} ");
			System.out.println("13.) Laplace of the sine of a number times t plus that number times t multiplied by the cosine of that number times t --> L{sin(at) + at[cos(at)]} ");
			System.out.println("14.) Laplace of t times the sine of a number times t --> L{tsin(at)} ");
			System.out.println("15.) Laplace of t times the cosine of a number times t --> L{tcos(at)} ");
			System.out.println("16.) Laplace of e raised to a number times t times the sine of another number times t --> L{e^(at)sin(bt)} ");
			System.out.println("17.) Laplace of e raised to a number times t times the cosine of another number times t --> L{e^(at)cos(bt)} ");
			System.out.println("18.) Laplace of the hyperbolic sine function of a number times t --> L{sinh(at)} ");
			System.out.println("19.) Laplace of the hyperbolic cosine function of a number times t --> L{cosh(at)} ");
			System.out.println("20.) Quit");
		
		    int choice = number.nextInt();
		    if(choice == 1)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method1(inputtedNum) + "\n");
		    }
		    if(choice == 2)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method2(variable, inputtedNum) + "\n");
		    }
		    if(choice == 3)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method3(variable, inputtedNum) + "\n");
		    }
		    if(choice == 4)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method4(variable, inputtedNum) + "\n");
		    }
		    if(choice == 5)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method5(variable, inputtedNum) + "\n");
		    }
		    if(choice == 6)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method6(variable, inputtedNum) + "\n");
		    }
		    if(choice == 7)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method7(variable, inputtedNum) + "\n");
		    }
		    if(choice == 8)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method8(variable, inputtedNum) + "\n");
		    }
		    if(choice == 9)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method9(variable, inputtedNum) + "\n");
		    }
		    if(choice == 10)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method10(variable, inputtedNum) + "\n");
		    }
		    if(choice == 11)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method11(variable, inputtedNum) + "\n");
		    }
		    if(choice == 12)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method12(variable, inputtedNum) + "\n");
		    }
		    if(choice == 13)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method13(variable, inputtedNum) + "\n");
		    }
		    if(choice == 14)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method14(variable, inputtedNum) + "\n");
		    }
		    if(choice == 15)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method15(variable, inputtedNum) + "\n");
		    }
		    if(choice == 16)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method16(variable, inputtedNum) + "\n");
		    }
		    if(choice == 17)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method17(variable, inputtedNum) + "\n");
		    }
		    if(choice == 18)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method18(variable, inputtedNum) + "\n");
		    }
		    if(choice == 19)
		    {
		    	System.out.println("The Laplace of your input following your chosen method is " + method19(variable, inputtedNum) + "\n");
		    }
		    if(choice == 20)
		    {
		    	System.out.println("Thanks for using the Laplacian Calculator!\n");
		    	System.exit(0);
		    }
		    //number.close();
		}
	}
	
	public static String method1(int inputtedNum)
	{
		/*
		 * Method 1 is the case of L{a} --> the Laplace of a single number
		 * is that number divided by s (depicted as a/s)
		 */
		if(inputtedNum == 0)
		{
			laplace = String.valueOf(inputtedNum);
			System.out.println("This is the format of your problem: L{" + laplace + "}");
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = num;
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = num + "/s";
			return laplace;
		}
	}
	
	public static String method2(String variable, int inputtedNum)
	{
		/*
		 * Method 2 is the case of L{at} --> the Laplace of a number times t or 
		 * just t alone is that number over s squared (depicted as s^2)
		 */
		if(inputtedNum == 0)
		{
			laplace = String.valueOf(inputtedNum);
			System.out.println("This is the format of your problem: L{" + laplace + "t}");
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = num + "(" + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = num + "/s^2";
			return laplace;
		}
		
	}
	
	/*
	 * Some methods require the use of the factorial
	 * of an inputted number
	 */
	public static int factorial(int inputtedNum)
	{
		if(inputtedNum == 0)
		{
			return 1;
		}
		else
		{
			return(inputtedNum * factorial(inputtedNum - 1));
		}
	}
	
	public static String method3(String variable, int inputtedNum)
	{
		/*
		 * Method 3 is the case of L{t^n} --> the Laplace of t raised to a power
		 * is n factorial divided by s raised to n + 1 (depicted as n!/s^(n+1))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "^(" + num + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method1(1);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			denominator = String.valueOf(inputtedNum + 1);
			format = variable + "^(" + num + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(factorial(inputtedNum)) + "/s^" + denominator;
			return laplace;
		}
	}
	
	public static String method4(String variable, int inputtedNum)
	{
		/*
		 * Method 4 is the case of L{a/sqrt(t)} --> the Laplace of a number
		 * divided by the square root of t is that number multiplied by
		 * the square root of pi divided by s (depicted as sqrt(pi/s))
		 */
		if(inputtedNum == 0)
		{
			laplace = String.valueOf(inputtedNum);
			format = laplace + "/sqrt(" + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = num + "/sqrt(" + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = num + "[sqrt(pi/s)]";
			return laplace;
		}
	}
	
	public static String method5(String variable, int inputtedNum)
	{
		/*
		 * Method 5 is the case of L{e^(at)} --> the Laplace of e raised
		 * to a power times t is 1 divided by s minus that power
		 * (depicted as 1/(s-a))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method1(1);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "1/(s-" + num + ")";
			return laplace;
		}
	}
	
	public static String method6(String variable, int inputtedNum)
	{
		/*
		 * Method 6 is the case of L{te^(at)} --> the Laplace of t times
		 * e raised to a power times t is 1 divided by s minus that power squared
		 * (depicted as 1/(s-a)^2)
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method2(variable, 1);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = variable + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "1/(s-" + num + ")^2";
			return laplace;
		}
	}
	
	public static String method7(String variable, int inputtedNum)
	{
		/*
		 * Method 7 is the case of L{t^n * e^(at)} --> the Laplace of t raised to a power
		 * and multiplied by e raised to a power times t is the factorial of the power t is raised to
		 * divided by s minus a raised to n plus one (depicted as n!/(s-a)^(n+1))
		 */
		System.out.println("For this method, please enter a number for n");
		int n = number.nextInt();
		if(n == 0 && inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "^" + String.valueOf(n) + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method5(variable, inputtedNum);
			return laplace;
		}
		if(n != 0 && inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "^" + String.valueOf(n) + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = variable + "^(" + n + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			denominator = String.valueOf(n + 1);
			laplace = String.valueOf(factorial(n)) + "/s^" + denominator;
			return laplace;
		}
		if(n == 0 && inputtedNum != 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "^" + String.valueOf(n) + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "1/(s-" + num + ")";
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			denominator = String.valueOf(n + 1);
			format = variable + "^" + String.valueOf(n) + "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(factorial(n)) + "/(s-" + num + ")^" + denominator;
			return laplace;
		}
	}
	
	public static String method8(String variable, int inputtedNum)
	{
		/*
		 * Method 8 is the case of L{sin(at)} --> the Laplace of the sine
		 * of a number, a, times t is that number, a, divided by
		 * s squared plus a squared (depicted as a/(s^2 + a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "sin(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(Math.sin(0));
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = num + "/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
	
	public static String method9(String variable, int inputtedNum)
	{
		/*
		 * Method 9 is the case of L{cos(at)} --> the Laplace of the cosine
		 * of a number, a, times t is s divided by
		 * s squared plus a squared (depicted as s/(s^2 + a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "cos(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(Math.cos(0)) + "/s";
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "s/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
	
	public static String method10(String variable, int inputtedNum)
	{
		/*
		 * Method 10 is the case of L{1 - cos(at)} --> the Laplace of 1 minus
		 * the cosine of a number, a, times t is a squared divided by s times s squared
		 * plus a squared (depicted as a^2/s(s^2 + a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "1 - cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "1 - cos(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "1 - " + String.valueOf(Math.cos(0));
			laplace = String.valueOf(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "1 - cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(Math.pow(inputtedNum, 2)) + "/s(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
	
	public static String method11(String variable, int inputtedNum)
	{
		/*
		 * Method 11 is the case of L{at - sin(at)} --> the Laplace of a number
		 * times t minus the sine of that number times t is that number cubed
		 * divided by s squared times s squared + that number squared
		 * (depicted as a^3/s^2(s^2 + a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = num + variable + " - sin(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0 - sin(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = num + variable + " - sin(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(Math.pow(inputtedNum, 3)) + "/s^2(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
	
	public static String method12(String variable, int inputtedNum)
	{
		/*
		 * Method 12 is the case of L{sin(at) - at[cos(at)]} --> the Laplace
		 * of the sine of a number times t minus that number times t multiplied by
		 * the cosine of that number times t is 2 times that number cubed
		 * divided by s squared plus that number squared all raised to the second power
		 * (depicted as 2a^3/(s^2 + a^2)^2)
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ") - " + num + variable + "[cos(" + num + variable + ")]";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "sin(0) - 0[cos(0)]";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0 - 0(1)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ") - " + num + variable + "cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(2 * Math.pow(inputtedNum, 3)) + "/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")^2";
			return laplace;
		}	
	}
	
	public static String method13(String variable, int inputtedNum)
	{
		/*
		 * Method 13 is the case of L{sin(at) + at[cos(at)]} --> the Laplace
		 * of the sine of a number times t plus that number times t multiplied by
		 * the cosine of that number times t is 2 times that number times s squared
		 * divided by s squared plus that number squared all raised to the second power
		 * (depicted as 2as^2/(s^2 + a^2)^2)
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ") + " + num + variable + "[cos(" + num + variable + ")]";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "sin(0) + 0[cos(0)]";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0 + 0(1)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "sin(" + num + variable + ") + " + num + variable + "[cos(" + num + variable + ")]";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(2 * inputtedNum + "s^2") + "/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")^2";
			return laplace;
		}
	}
	
	public static String method14(String variable, int inputtedNum)
	{
		/*
		 * Method 14 is the case of L{tsin(at)} --> the Laplace of t times
		 * the sine of a number times t is 2 times that number times s divided by
		 * s squared plus that number squared all raised to the second power
		 * (depicted as 2as/(s^2 + a^2)^2)
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "sin(" + num + variable + ")" ;
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = variable + "sin(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = variable + "(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "0";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = variable + "sin(" + num + variable + ")" ;
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = String.valueOf(2 * inputtedNum + "s") + "/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")^2";
			return laplace;
		}
	}
	
	public static String method15(String variable, int inputtedNum)
	{
		/*
		 * Method 15 is the case of L{tcos(at)} --> the Laplace of t times
		 * the cosine of a number times t is s squared minus that number squared 
		 * divided by s squared plus that number squared all raised to the second power
		 * (depicted as (s^2 - a^2)/(s^2 + a^2)^2)
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = variable + "cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = variable + "cos(0)";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = variable + "(" + String.valueOf(Math.cos(0)) + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method2(variable, 1);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = variable + "cos(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "(s^2 - " + String.valueOf(Math.pow(inputtedNum, 2)) + ")" + "/(s^2 + " + String.valueOf(Math.pow(inputtedNum, 2)) + ")^2";
			return laplace;
		}
	}
	
	public static String method16(String variable, int inputtedNum)
	{
		/*
		 * Method 16 is the case of L{e^(at)sin(bt)} --> the Laplace of
		 * e raised to a number times t times the sine of another number times t
		 * is the second number divided by s minus a all squared plus the second number squared
		 * (depicted as b/(s - a)^2 + b^2)
		 */
		System.out.println("Type an additional number please: ");
		int b = scan.nextInt();
		
		if((inputtedNum == 0) && (b == 0))
		{
			laplace = String.valueOf(0);
			return laplace;
		}
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "sin(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(0)" + "sin(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = String.valueOf(Math.exp(0)) + "sin(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "sin(" + extra + variable + ")";
			laplace = method8(variable, b);
			return laplace;
		}
		if(b == 0)
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "sin(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(" + num + variable + ")" + String.valueOf(Math.sin(0));
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "0";
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "sin(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = extra + "/(s - " + num + ")^2 + " + String.valueOf(Math.pow(b, 2));
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = format;
			return laplace;
		}
	}
	
	public static String method17(String variable, int inputtedNum)
	{
		/*
		 * Method 17 is the case of L{e^(at)cos(bt)} --> the Laplace of
		 * e raised to a number times t times the cosine of another number times t
		 * is s minus a divided by s minus a all squared plus the second number squared
		 * (depicted as (s - a)/(s - a)^2 + b^2)
		 */
		System.out.println("Type an additional number please: ");
		int b = scan.nextInt();
		
		if((inputtedNum == 0) && (b == 0))
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = String.valueOf(Math.exp(0)) + "(" + String.valueOf(Math.cos(0)) + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method1(1);
			return laplace;
		}
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(0)" + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = String.valueOf(Math.exp(0)) + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "cos(" + extra + variable + ")";
			laplace = method9(variable, b);
			return laplace;
		}
		if(b == 0)
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(" + num + variable + ")" + String.valueOf(Math.cos(0));
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "e^(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method5(variable, inputtedNum);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			extra = String.valueOf(b);
			format = "e^(" + num + variable + ")" + "cos(" + extra + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = "s - " + num + "/(s - " + num + ")^2 + " + String.valueOf(Math.pow(b, 2));
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = format;
			return laplace;
		}
	}
	
	public static String method18(String variable, int inputtedNum)
	{
		/*
		 * Method 18 is the case of L{sinh(at)} --> the Laplace of
		 * the hyperbolic sine function of a number times t is that number
		 * divided by s squared minus a squared
		 * (depicted as a/(s^2 - a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "sinh(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = String.valueOf(Math.sinh(0));
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method1(0);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "sinh(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = inputtedNum + "/(s^2 - " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
	
	public static String method19(String variable, int inputtedNum)
	{
		/*
		 * Method 19 is the case of L{cosh(at)} --> the Laplace of
		 * the hyperbolic cosine function of a number times t is s
		 * divided by s squared minus a squared
		 * (depicted as s/(s^2 - a^2))
		 */
		if(inputtedNum == 0)
		{
			num = String.valueOf(inputtedNum);
			format = "cosh(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			format = String.valueOf(Math.cosh(0));
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = method1(1);
			return laplace;
		}
		else
		{
			num = String.valueOf(inputtedNum);
			format = "cosh(" + num + variable + ")";
			System.out.println("This is the format of your problem: L{" + format + "}");
			laplace = "s/(s^2 - " + String.valueOf(Math.pow(inputtedNum, 2)) + ")";
			return laplace;
		}
	}
}