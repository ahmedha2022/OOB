package bookstores;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {

		Book orgBook = new Book("Hunger Games"); // make a new object from Book class and naming it orginalbook if i did
													// not put new will point to null but then the object i created with
													// new which will make a new adress in in the heap the object's
													// address will point to obejct's variable name which is in stack
													// part
		BookStore orgStore = new BookStore("Jarir", orgBook);// here i make another object like before put what i did
																// when creating bookstore class i have intialized a
																// constructor that taking the book class as parameter
																// inside of if and what will happen in the memory like
																// i explained nefore but when come to book class will
																// point to the same address of the above

		// TODO 06: make a new book call it copyBook and make the title also "Hunger
		// Games"
		Book copyBook = new Book("Hunger Games");

		// TODO 07: make a new Bookstore call it copyStore and make the name "Jarir",
		// and assign it copyBook as the bestSeller
		BookStore copyStore = new BookStore("Jarir", copyBook);

		// TODO 08: using an if statement, can you check if orgBook is the same as
		// copyBook?
		if (orgBook == copyBook) // here will compare the addresses
			System.out.print("they are equal");
		else
			System.out.print(" the address are not equal \n");

		// TODO 10: use your work from todo 9 to compare the two books again
		if (orgBook.equals(copyBook)) {
			System.out.println("using \"EQUALS\" worked!");
		} else
			System.out.println("It did not work!");

		// TODO 11: using an if statement, can you check if orgStore is the same as
		// copyStore?
		if (orgStore == copyStore) // here will compare the addresses so the addresses as well
			System.out.print("they are equal");
		else
			System.out.print(" the address are not equal \n");

		// TODO 13: use your work from todo 12 to compare the two book stores again
		if (orgStore.equals(copyStore))
			System.out.print("they are equal\n");
		else
			System.out.print(" the address are not equal \n");

		// TODO 15: Print all books inside of orgStore
       //first way by using for loop
		for (int i = 0; i < orgStore.bookar.length; i++)
			System.out.println(orgStore.bookar[i]); // we need to put i inside the array to chagne

		System.out.println(Arrays.toString(orgStore.bookar));// when using Arrays.string dont need to use brackets

	}

}
