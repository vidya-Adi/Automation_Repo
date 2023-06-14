package practice;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to reverse");
	int num=s.nextInt();
	int temp=num;
	System.out.println("OriginalNumber:"+num);
	int rev=0;
	while(num>0)
	{	
      int d=num%10;
      rev = rev*10+d;
      num=num/10;
	}
	System.out.println("ReversedNumber:"+rev);

}
}
