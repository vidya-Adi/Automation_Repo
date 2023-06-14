package get;

import java.util.ArrayList;

public class G4 
{
	public static void main(String[] args) 
	{
		ArrayList bag = new ArrayList();
		bag.add(new book("Two States","Chetan Bhagat"));
		bag.add(new book("Fault in our stars","Unknown"));
		bag.add(new book("Power of your subconsis Mind","Joseph Murphy"));
		
		//System.out.println(bag);
		
		//System.out.println(((book)bag.get(0)).getTitle());
		
		//print the title of 3rd book
		System.out.println(((book)bag.get(2)).getTitle());
		
		//print all the authors
		System.out.print("[");
		for(int i = 0; i < bag.size();i++)
		{
			System.out.print(((book)bag.get(i)).getAuthor()+" ");
		}
		System.out.print("]");
	}
}
	
	class book
	{
		String author;
		String title;
		
		public String getAuthor() 
		{
			return author;
		}

		public void setAuthor(String author) 
		{
			this.author = author;
		}

		public String getTitle() 
		{
			return title;
		}

		public void setTitle(String title) 
		{
			this.title = title;
		}
		
		@Override
		public String toString() 
		{
			return "Book [author=" + author + ", title=" + title + "]";
		}

		public book(String title, String author) 
		{
			super();
			this.author = author;
			this.title = title;
		}

	}

