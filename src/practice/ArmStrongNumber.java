package practice;

import java.util.Scanner;

public class ArmStrongNumber 
{

	public static int main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int count=count(num);
		int sum=0;
		
		
	public static int count (int n)
	{
		int count=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+product(d,count);
			n=n/10;
			count++;
		}
		return count;
	}		
		public static int product (int d, int c)
		
		{
			int product=1;
			for(int i=1;i<=c;i++)
			{
				product*=i;
			}
			return product;
			
		}

	}

}
