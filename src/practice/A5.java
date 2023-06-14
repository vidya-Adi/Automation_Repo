package practice;
//* add names of four fruits into the list
//* then add vegetable name in between 3 & 4 fruit

import java.util.ArrayList;

public class A5 
{

	public static void main(String[] args) 
	{
		ArrayList a =new ArrayList();
		a.add("apple");
		a.add("mango");
		a.add("grapes");
		a.add("banana");
		a.add("orange");
		
		a.add(3,"potato");
		System.out.println(a);
	}

}
