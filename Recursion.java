/**
 * Provides a set of recursive functions and then tests them in the main
 * 
 * @author Gregory Abellanosa <gregoryabellanosa@gmail.com>
 *
 */
public class Recursion {

	public static void main(String[] args) {
		if (addDigits(428) == 14)
		{
			System.out.println("Number is: 428");
			System.out.println("Sum of digits: " + addDigits(428));
			System.out.println("addDigits is correct!\n");
		}
		if (addDigits(321) == 6)
		{
			System.out.println("Number is: 321");
			System.out.println("Sum of digits: " + addDigits(321));
			System.out.println("addDigits is correct!\n");
		}
		if (revFibonacci(0,1,1,5) == 5)
		{
			System.out.println(revFibonacci(0,1,1,5));
			System.out.println("revFibonacci is correct!\n");
		}
		else
		{
			System.out.println("revFibonacci 1 is wrong");
		}
		if (revFibonacci(0,1,1,10) == 55)
		{
			System.out.println(revFibonacci(0,1,1,10));
			System.out.println("revFibonacci is correct!\n");
		}
		else
		{
			System.out.println("revFibonacci 2 is wrong");
		}
		if (binToDec("1101100") == 108)
		{
			System.out.println("1101100");
			System.out.println("The decimal form is: " + binToDec("1101100"));
			System.out.println("binToDec is correct!\n");
		}
		if (binToDec("1011101") == 93)
		{
			System.out.println("1011101");
			System.out.println("The decimal form is: " + binToDec("1011101"));
			System.out.println("binToDec is correct!\n");
		}
	}
	
	/**
	 * Finds the sum of the digits of num
	 * 
	 * @param num value to find the sum of
	 * @return the sum of the digits
	 */
	public static int addDigits(int num)
	{
		int r = num % 10;  //gets the remainder    
	    int n = num / 10;  //gets the quotient
	    if(n == 0)
	    {
	      return num; //if there is only one digit in the number then it will return the sum of itself
	    } else {
	      return addDigits(n) + r; //adds the remainder to each call
	    }
	}
	
	/**
	 * Finds the nth Fibonacci value
	 * 
	 * @param f1 n-2 Fibonacci value
	 * @param f2 n-1 Fibonacci value
	 * @param c counter
	 * @param n the number c should count up to
	 * @return the nth Fibonacci value
	 */
	public static int revFibonacci(int f1, int f2, int c, int n)
	{
		if (c == n)
		{
			return f2; //returns the last number if there is only one number (left)
		}
		else
		{
			c++; //
			int F2 = f1 + f2;
			return revFibonacci(f2, F2, c, n);
		}
		
	}
	
	/**
	 * Converts a binary string to decimal
	 * 
	 * @param bin the binary string
	 * @return the decimal value
	 */
	public static int binToDec(String bin)
	{
		int binNumber = bin.length(); //gets the amount of digits are in the string 
		
		if (binNumber == 0)
		{
			return 0; //if the length of the string is 0 that means there are no digits and the decimal of that binary is 0
		}
		String a = bin.substring(0 , 1); //a is the current digit being counted for calculating the decimal
		String b = bin.substring(1); //b is the res of the digits in the string which will later be accessed by the recursive call
		return Integer.parseInt(a) * (int) Math.pow(2, binNumber-1) //binary converts to decimal by summing numbers of base 2
				+ binToDec(b); 
		
	}
}
