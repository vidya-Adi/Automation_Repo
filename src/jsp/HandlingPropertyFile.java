package jsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile 
{

	public static void main(String[] args) throws IOException 
	{
		//get the java representative object of physical file
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		
		//create an object of property class
		Properties p=new Properties();
		
		//load the file so that get property method will come to know where the file is
		p.load(fis);
		
		//read or get data from the property file by passing the key
       String url=p.getProperty("url");
       String un=p.getProperty("username");
       String pw=p.getProperty("password");
       System.out.println(url);
       System.out.println(un);
       
       

	}

}
