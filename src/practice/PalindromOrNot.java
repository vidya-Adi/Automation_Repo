package practice;

import java.util.Scanner;

public class PalindromOrNot 
{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to reverse");
	int num=s.nextInt();
	int temp=num;
	int rev=0;
	while(num>0)
	{	
      int d=num%10;
      rev = rev*10+d;
      num=num/10;
	}
	
	if(rev==temp)
	{
	System.out.println("The number is palindrome");
	}
	
	else
	{
		System.out.println("The number is not palindrome");
		
	}

}
}
