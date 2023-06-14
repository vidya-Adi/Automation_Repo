package practice;

import java.util.Scanner;

public class Largest 
{

	public static void main(String[] args) 
	{
	int [] a= {2,4,1,34,12,10};
	int largest=0;
	int sec_largest=0;
	for(int i=0;i<a.length;i++)
	{
	    if (a[i]>largest)
     {
	     largest=a[i];
	     sec_largest=largest;
     }
	    if(a[i]>sec_largest && largest!=a[i])
	    {
	    	sec_largest=a[i];
	    }
	}
	System.out.println("The second largest element is:"+sec_largest);

	
	}

}
