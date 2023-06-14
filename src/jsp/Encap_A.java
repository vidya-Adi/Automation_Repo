package jsp;

public class Encap_A 
{
	private int i;  //declaration
	public Encap_A()
	{
		i=10;    // initialization
		
	}
	
	public int getValue()
	{
		return i;    //giving only read access
	}
	public void setValue(int j)
	{
		i=j;  // giving writing access
	}

}
