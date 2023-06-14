package practice;
//* add names retired cricketers
//    then add names of current cricketers
// then names of captains into
// different list
// merge the old nad new players in the list
// then remove old players
// then add captains into list
// at last remove the players
// and retain only captains

import java.util.ArrayList;

public class A7 
{

	public static void main(String[] args) 
	{
		ArrayList a =new ArrayList();
		a.add("Kapil Dev");
		a.add("Dravid");
		a.add("Dhoni");
		a.add("Zahir khan");
		
		ArrayList l =new ArrayList();
		l.add("Bumra");
		l.add("Rohit");
		l.add("Rahul");
		
		ArrayList m=new ArrayList();
		a.add("Sachin");
		a.add("Anil Kumble");
		a.add("Dhoni");
		
		ArrayList s=new ArrayList();
		s.addAll(a);
		s.addAll(l);
		System.out.println(s);
		
		s.removeAll(a);
		System.out.println(s);
		
		s.addAll(m);
		System.out.println(s);
		
		s.retainAll(m);
		System.out.println(s);

	}

}
