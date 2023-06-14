import java.util.ArrayList;

public class A6 {
//* create list of chocolates of particular company
//* then create another list to have names of the company
//* then add the chocolate names to the company list
//*	
	

	public static void main(String[] args) 
	{
		ArrayList a =new ArrayList();
		a.add("Silk");
		a.add("Dairy Milk");
		a.add("Fruit and Nut");
		
		ArrayList c=new ArrayList();
		c.add("Nestle");
		c.add("Amul");
		c.add("Ferrero");
		
		c.add("chocolates");
		System.out.println(a);
		System.out.println(c);
		System.out.println(c.size());

	}

}
