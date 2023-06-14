package practice;

import java.util.Scanner;

public class P5 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int count=0;
		while(num>0) 
		{
			int d=num%10;
			count++;
			num=num/10;
		}
        System.out.println("The number of digits in the given number is:"+count);
	}

}
