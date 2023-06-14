package get;
// eneter numbers into the arraylist
// ask the user to enter an element
// without built in functions
// search weather the song is there or not

import java.util.ArrayList;
import java.util.Scanner;

import practice.Song;
public class G3
{
   String title;
   public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public Song(String title) 
	{
		super();
		this.title = title;
	
	}

}


public class Song 
{

	public static void main(String[] args) 
	{
     ArrayList g3=new ArrayList();
     song.add("shakalak");
     song.add("Maihoona");
     song.add("Twinkle twinkle");
     
     
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the song to play");
	String title = sc.nextLine().trim().toLowerCase();
	
	int found = 0;
	for(Object o:album)
	{
		Song s = (Song)o;
		if(title.equals(s.title));
		{
			found = 1;
			System.out.println("song is present");
			break;
		}
		
	}
	if(found == 0)
	{
		System.out.println("song is not there");
	}


	}

}
