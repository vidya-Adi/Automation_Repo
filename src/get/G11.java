package get;

import java.util.ArrayList;

public class G11 
{
public static void main (String[] args) 
{
	ArrayList bag=new ArrayList();
	bag.add(new book("Two States","Chetan Bhagat"));
	bag.add(new book("Fault in our stars","Unknown"));
	bag.add(new book("Power of your subconsis Mind","Joseph Murphy"));
	
	System.out.println(bag);
	
	
	System.out.println(((Book)bag.get(0)).getTitle());
	
	System.out.println(((Book)bag.get(2)).getTitle());
	
	System.out.println("[");
	for(int i=0;i<bag.size();i++)
	{
		System.out.println(((Book)bag.get(i)).getAuthor()+" ");
	}
	
	System.out.println("]");
}

class Book
{
String title;
String author;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
	
}
@Override
public String toString() 
{
	return "Book [author=" + author + ", title=" + title + "]";
}
public void Book(String title,String author)
{
	super();
	this.title =title;
	this.author=author;
}

}
