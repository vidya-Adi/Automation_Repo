package practice;

import java.util.Scanner;

public class AddFactorial

{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int sum=0;
		while(num>0)
		{
			int d=num%10;
			sum=sum+fact(d);
			num/=10;
		}
		System.out.println("The sum of factorial is:"+sum);

	}
	
	public static int fact(int n)
	{
		int fact=1;
		
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}


}
