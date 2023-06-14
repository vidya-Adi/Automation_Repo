package practice;

import java.util.Scanner;

public class Length 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of the array");
	    for (int i=0; i<a.length ;i++)
	    {
		a[i]=s.nextInt();
	    }
	    System.out.println("Array before reversing");
	    for(Integer i:a)
	    {
	    	System.out.print(i+" ");
	    }
	    int i=0;
	    int j=size-1;
	    while(i<=j)
	    {
	    	int temp=a[i];
	    	a[i]=a[j];
	    	a[j]=temp;
	    	i++;
	    	j--;
	    	
	    }
	    System.out.println();
	    System.out.println("Array after reversing");
	    for(Integer k:a)
	    {
	    	System.out.print(k+"");
	    }
	    
        
	}

}
