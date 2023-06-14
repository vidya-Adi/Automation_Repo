package practice;

import java.util.Scanner;

public class StrongNumber

{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int d=num%10;
			sum=sum+fact(d);
			num/=10;
		}
		if(temp==sum)
		{
		   System.out.println("The given number is strong number");
		}
		else
			System.out.println("The number is not a strong number");

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

