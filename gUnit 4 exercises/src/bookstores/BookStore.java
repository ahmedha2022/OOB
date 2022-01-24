package bookstores;

public class BookStore {

	private String name;
	private Book bestSeller;
	
	
	//TODO 14: create an array to store 3 books (call it "bookArr")
	//         You can put three new books with any titles you want.
	public Book[] bookar = {new Book("sadf"),new Book("sdf"),new Book("ddd")};
	
	
	
	public BookStore()
	{
		name = "NO NAME";
		bestSeller = null;
	}
	
	public BookStore(String name, Book bestSeller)
	{
		this.name = name;
		this.bestSeller = bestSeller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(Book bestSeller) {
		this.bestSeller = bestSeller;
	}
	
	//TODO 12: create an "equals" method that will return true only if this book store
	//         is similar to another book store given as a parameter.
	public boolean equals(BookStore giveAname)
	{
		
		return this.name.equals(giveAname.name) && this.bestSeller.equals(giveAname.bestSeller); // we need to compare the name with a name and this here is not very importnant in first stage but the other is important
	}
	
	
	
	//TODO 16: change the bookArr variable in the top to private, what happens? 
	//         Hint: fix it by creating a get method that will get one book from bookArr using its index
	
	
	//TODO 17 (Extra only): create an addBook method that will add a book to the array
	//        Question: should you keep the bookArr as a normal array? propose a better solution.
	
	//TODO 18 (Extra only): what would you do to fix the "equals" method such that it takes care
	//                      comparing the bookArr items as well?
	
	
	public String toString()
	{
		String answer = "Name: " + name + "\nBest Seller: " + bestSeller + "\n";

		
		return answer;
	}
	
	
	
}
