package bookstores;

public class Book {

	private String title;
	

	public Book(String title)
	{
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	//TODO 09: create an "equals" method that will return true only if this book
	//         is similar to another given book

	public boolean equals(Book theOtherBook)
	{
		return this.title.equals( theOtherBook.title );
			
	}
	public String toString()
	{
		return "Title: " + title ;
	}
	
}
