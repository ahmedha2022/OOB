package glasses;

import java.util.ArrayList;

public class Store {
	private String name;
	public ArrayList<Glasses> glassList = new ArrayList<Glasses>();

	// TODO 14a: create a constructor for the Store
	public Store(String name) {
		this.name = name;

	}

	// TODO 14b: create an addGlass method that will add a glass to the ArrayList
	public void addGlass(Glasses x) {
		glassList.add(x);
	}

	// TODO 17: create a method that will get either Sunglasses or MedicalGlasses
	// given by index
	public Glasses getGlass(int index) {

		return glassList.get(index);

	}

	// TODO 20: make a method that will display the colors of all SUN Glasses in
	// hint: you will need to use the getter you made in todo 19.
	public void displayColors() {
		System.out.println("\nDISPLAYING COLORS:");
		for (int i = 0; i < glassList.size(); i++) {
			Glasses temp = glassList.get(i);
			if (temp instanceof SunGlasses)
				System.out.println(((SunGlasses) temp).getColor());// here we will make a casting and force
																	// the condition to display just
																	// sunglasses objects before casting the if will
																	// treat it as glass and i wanna make sure in the if
																	// is what im looking at is sunglasses for that we
																	// will using sunglasses, so whatever inside the
																	// brackets consider as sunglasses ya if 

		}

	}

}