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
	
	public boolean equals(Book getAname)// u need to make a comparing just for one used which is comparing the content of this class and with other content or the title of this book usually this method if wanna comparing strings to ech other
	{
		
		return this.title.equals(getAname.title); /* here title refeirng to the class name above i need to specify what i want to compare inside the paranthess*/
	}
	

	public String toString()
	{
		return "Title: " + title ;
	}
	
}
