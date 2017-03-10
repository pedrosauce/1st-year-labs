public class book
{
	//Declare our instance variables

	private String title;
	private String author;
	private String publisher;
	private int ISBN;

	//counter variable for unique ISBN
	private static int counter = 1111;

	//single constructor
	public book(String title, String author, String publisher)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;

		ISBN = counter++;
	}

	//Get methods

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public int getISBN()
	{
		return ISBN;
	}

	//Set methods

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}


	public String toString()
	{
		return "Title: " + title + "Author: " + author + "Publisher: " + publisher + "ISBN: " + ISBN;
	}
}