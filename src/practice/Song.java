package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Song
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
	
	public String toString()
	{
		return title;
	}
	
	
	public Song()
	{
		super();
	}
	
	public Song(String title, String artist) 
	{
		super();
		this.title = title;
		this.artist = artist;
	}
}

class album
{
	public static void main(String[] args)
	{
		//create an arrayList to store songs
		ArrayList album = new ArrayList();
		album.add(new Song("parwanahi","AM"));
		album.add(new Song("waka waka","Shakira"));
		album.add(new Song("castle of glass","LinkenPark"));
		System.out.println(album);
		
		//Ask the user to enter a song to search
		
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
				System.out.println("You can play");
				break;
			}
			
		}
		if(found == 0)
		{
			System.out.println("You don't have this song");
		}

	}
}
