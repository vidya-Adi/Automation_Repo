package practice;

import java.util.Scanner;

public class DigitalSum 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find digital sum");
		int num=s.nextInt();
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int d=i%10;
			sum+=d;
			
		}
		System.out.println("The digital sum is:" +sum);

	}

}
