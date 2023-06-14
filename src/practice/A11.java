package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class A11
{
	String title;
    String artist;
    public String getTitle() 
    {
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getArtist() 
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

 @Override
	public String toString() 
 {
	 
		return title;
		
 }

public A11(String title, String artist) 
{
	super();
	this.title = title;
	this.artist = artist;
}

public A11()
{
	super();
}

public static void main(String[] args) 
	{
		ArrayList album =new Arraylist();
		album.add(new A11("ParwaNahi","AM"));
		album.add(new A11("Waka Waka","Shakira"));
		album.add(new A11("Castle of glass","Link in park"));
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the song to play");
		String title=sc.nextLine().trim().toLowerCase();
		
		int found=0;
		for(object o:album)
		{
			song s=(Song)o;
			if(title.equals(s.title))
			{
				 found=1;
				 System.out.println("You can play the song");
				 break;
			}
			}
		if(found==0) 
		{
			System.out.println("you dont have this song");
		}

	}

}
