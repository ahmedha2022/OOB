package lab12.country;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class CountryRespository {
	private static List<Country> countries;
	
	private static void loadCountries() {
		Gson gson = new Gson();
		String filePath = "data/countries.json";
		try {
			// Read file content
			String fileContent = Files.readString(Paths.get(filePath));
			// System.out.println(fileContent);

			// Convert json text to an array of Country objects
			Country[] countriesArray = gson.fromJson(fileContent, Country[].class);
			//countries = Arrays.asList(countriesArray);
			countries = new ArrayList<>(List.of(countriesArray));
			countries.removeIf(c -> c.getContinent().equals("") || c.getPopulation() == 0);
			System.out.printf("%d countries loaded%n", countries.size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<String> getContinents() {
		if (countries == null) loadCountries();
		return countries
					.stream()
				    .map(c -> c.getContinent())
				    .distinct()
				    .sorted()
					.collect(Collectors.toList());
	}
	
	public static List<String> getRegions(String continent) {
		if (countries == null) loadCountries();
		return countries
					.stream()
					.filter(c -> c.getContinent().equalsIgnoreCase(continent))
				    .map(c -> c.getRegion())
				    .distinct()
				    .sorted()
					.collect(Collectors.toList());
	}
	
	public static List<Country> getCountriesByRegion(String region) {
		if (countries == null) loadCountries();
		// Get countries by region
		return countries.stream()
						.filter(c -> c.getRegion() != null && c.getRegion().equalsIgnoreCase(region))
						.sorted( Comparator.comparing(Country::getPopulation) ) 
						.collect(Collectors.toList());
	}
}