package jsp;

public class Encap_B 
{
	public static void main (String[] args)
	{
		Encap_A a1 =new Encap_A();
		int x=a1.getValue();  // utilization
		System.out.println(x);
		a1.setValue(30);     //utilization
		System.out.println(a1.getValue());
	}

}
