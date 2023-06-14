package practice;

import java.util.Scanner;

public class P6 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		while(num>0)
		{
			int d=num%10;
			System.out.println("The factorial of "+d+" is:"+fact(d));
			num/=10;
		}
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


