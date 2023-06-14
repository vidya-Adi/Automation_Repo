package practice;

import java.util.Scanner;

//Print the fibonacci number in the form of array.

public class FibonacciNumber 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers to be generated");
		int num=s.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<=num-2; i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}

	}

}
