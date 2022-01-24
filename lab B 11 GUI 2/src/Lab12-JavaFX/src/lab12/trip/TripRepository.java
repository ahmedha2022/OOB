package lab12.trip;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.hildan.fxgson.FxGson;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import lab12.country.Country;

public class TripRepository {
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

	public static List<String> getCountries() {
		if (countries == null) loadCountries();
		return countries
					.stream()
				    .map(c -> c.getName())
				    .sorted()
					.collect(Collectors.toList());
	}
	
	public static List<String> getTripTypes() {
		return List.of("Business", "Leisure");
	}	
	
	public static List<String> getRatings() {
		return List.of("Excellent", "Good", "Poor");
	}	
	
    public static List<Trip> getTrips() {
    	List<Trip> trips = null;
		//Use FxGson as it supports classes with properties
		Gson gson = FxGson.coreBuilder().setPrettyPrinting()
						  .registerTypeAdapter(LocalDate.class, new LocalDateAdapter().nullSafe())
						  .create();
		String filePath = "data/trips.json";
		try {
			// Read file content
			String fileContent = Files.readString(Paths.get(filePath));
			// System.out.println(fileContent);

			// Convert json text to an array of Trip objects
			Trip[] tripsArray = gson.fromJson(fileContent, Trip[].class);
			trips = Arrays.asList(tripsArray);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/*
        trips.add(new Trip("Australia", "Leisure", LocalDate.of(2019, Month.SEPTEMBER, 10), LocalDate.of(2019, Month.SEPTEMBER, 20), "Excellent"));
        trips.add(new Trip("France", "Leisure", LocalDate.of(2019, Month.OCTOBER, 10), LocalDate.of(2019, Month.OCTOBER, 20), "Good"));
        trips.add(new Trip("Benin", "Leisure", LocalDate.of(2019, Month.NOVEMBER, 10), LocalDate.of(2019, Month.NOVEMBER, 20), "Poor"));
        */
        return trips;
    }
    
	public static void saveTrips(Trip[] trips) {
		//Use FxGson as it supports classes with properties
		Gson gson = FxGson.coreBuilder().setPrettyPrinting()
						  .registerTypeAdapter(LocalDate.class, new LocalDateAdapter().nullSafe())
						  .create();
		
		String filePath = "data/trips.json";
		String json = gson.toJson(trips);
		// Write json to a file
		try {
			Files.writeString(Paths.get(filePath), json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static final class LocalDateAdapter extends TypeAdapter<LocalDate> {
	    @Override
	    public void write( final JsonWriter jsonWriter, final LocalDate localDate ) throws IOException {
	        jsonWriter.value(localDate.toString());
	    }

	    @Override
	    public LocalDate read( final JsonReader jsonReader ) throws IOException {
	        return LocalDate.parse(jsonReader.nextString());
	    }
	}
}
