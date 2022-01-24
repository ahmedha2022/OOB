package bookstores;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		
		Book orgBook = new Book("Hunger Games");
		BookStore orgStore = new BookStore("Jarir", orgBook);
		
		
		
		//TODO 06: make a new book call it copyBook and make the title also "Hunger Games"
		Book copyBook = new Book("Hunger Games");
		//TODO 07: make a new Bookstore call it copyStore and make the name "Jarir", and assign it copyBook as the bestSeller
		BookStore copyStore = new BookStore("Jarir", copyBook);
		
		//TODO 08: using an if statement, can you check if orgBook is the same as copyBook?
		if (orgBook == copyBook)
		{
			System.out.println("using == we found out they are equal!");
		}else System.out.println("using == DID NOT WORK");
		
		//TODO 10: use your work from todo 9 to compare the two books again
		if (orgBook.equals(copyBook))
		{
			System.out.println("using \"EQUALS\" worked!");
		}else System.out.println("It did not work!");
		
		//TODO 11: using an if statement, can you check if orgStore is the same as copyStore?
		
		
		System.out.println("Now comparing stores:");
		if (orgStore == copyStore)
		{
			System.out.println("using == we found out they are equal!");
		}else System.out.println("using == DID NOT WORK");
		
		//TODO 13: use your work from todo 12 to compare the two book stores again
		if ( orgStore.equals(copyStore) )
		{
			System.out.println("using EQUALS we found out they are equal!");
		}else System.out.println("using EQUALS DID NOT WORK");
		
		//TODO 15: Print all books inside of orgStore
		/* when bookArr was public (we used this):
		 * for (int i = 0; i < orgStore.bookArr.length ; i++) System.out.println(
		 * orgStore.bookArr[i] );
		 * 
		 * 
		 * if you want to use for-each loop then:
		 * 
		 * for (Book b : orgStore.bookArr)
		 * 		System.out.println( b );
		 */
		
		// AFTER doing Todo 16 and making bookArr private:
		for (int i = 0; i < 3 ; i++)
			System.out.println( orgStore.getBook(i) );
	}
	
	

}
