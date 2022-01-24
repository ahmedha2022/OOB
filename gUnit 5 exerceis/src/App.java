import glasses.MedicalGlasses;
import glasses.Store;
import glasses.SunGlasses;

public class App {

	public static void main(String[] args) {
		new App(); // this will call the constructor of App below

	}

	public App() {
		// TODO 08: create a medical glass with your own information
		MedicalGlasses m1 = new MedicalGlasses(100, "metal", "gucci", -6, 6);

		// TODO 09: create a sun glass with your own information
		SunGlasses s1 = new SunGlasses(500, "metal", "poilce", "black", "circle");

		// TODO 10: print the full prices of the glasses above.
		System.out.println(m1.getFullPrice());
		System.out.println(s1.getFullPrice());

		// TODO 12: print ALL glasses information
		// hint: what do you need to create inside MedicalGlasses and SunGlasses?
		System.out.println(m1);
		System.out.println(s1);

		/*
		 * TODO 14: create a Store class that has the following: - name (String) -
		 * ArrayList to hold medical and sun glasses (call it glassAList)
		 * 
		 */

		// TODO 15: create a new Store and put the glasses from todo 08 and 09 in it (in
		// position 0, and 1)
		Store st1 = new Store("moussa optics");
		st1.addGlass(m1);
		st1.addGlass(s1);

		// TODO 16: print all the glasses in the store.
		// Q1: should you print medical glasses differently than sun glasses? java store
		// my class
		System.out.println("ptinting only the store glasses");

		for (int i = 0; i < st1.glassList.size(); i++) {

			System.out.println(st1.glassList.get(i));
		}

		// TODO 18: print only the Medical glasses in the store.
		// Use your work from todo 17 to access the glasses by index
		System.out.println("ptinting only medical glasses");
		for (int i = 0; i < st1.glassList.size(); i++) {
			if (st1.getGlass(i) instanceof MedicalGlasses)// can i know if is the current glass is a type of
															// medicalglass,when i look at the current glass is actually
															// is a medical galss
															// if this one is an object MedicalGlasses or achildren of
															// medical glasses to find specifi object from arraylist

				System.out.println(st1.getGlass(i));
		}

		// TODO 21: add another new SunGlasses with a different color to your store

		st1.addGlass( new SunGlasses(200, "metal", "Gucci", "Mirror", "Square")  );

		// TODO 22: use your work from todo 20 to print all the colors of the SUN
		// glasses in the store.
		st1.displayColors();

	}

}
