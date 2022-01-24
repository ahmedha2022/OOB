package lab12.trip;

import java.time.LocalDate;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Trip {
	private StringProperty country;
	private StringProperty type;
	private ObjectProperty<LocalDate> fromDate;
	private ObjectProperty<LocalDate> toDate;
	private StringProperty rating;
	
	public StringProperty countryProperty() { return country; }
	public StringProperty typeProperty() { return type; }
	public ObjectProperty<LocalDate> fromDateProperty() { return fromDate; }
	public ObjectProperty<LocalDate> toDateProperty() { return toDate; }
	public StringProperty ratingProperty() { return rating; }
	
	public Trip() {
		this("", "", null, null, "");
	}
	
	public Trip(String country, String type, LocalDate fromDate, LocalDate toDate, String rating) {
		this.country = new SimpleStringProperty(country);
		this.type = new SimpleStringProperty(type);
		this.fromDate = new SimpleObjectProperty<LocalDate>(fromDate);
		this.toDate = new SimpleObjectProperty<LocalDate>(toDate);
		this.rating = new SimpleStringProperty(rating);
	}
	
	public String getCountry() {
		return country.getValue();
	}
	
	public String getType() {
		return type.getValue();
	}
	
	public LocalDate getFromDate() {
		return fromDate.getValue();
	}
	public LocalDate getToDate() {
		return toDate.getValue();
	}
	public String getRating() {
		return rating.getValue();
	}
	
	public void setCountry(String country) {
		this.country.setValue(country);
	}
	
	public void setType(String type) {
		this.type.setValue(type);
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate.setValue(fromDate);
	}
	public void setToDate(LocalDate toDate) {
		this.toDate.setValue(toDate);
	}
	
	public void setRating(String rating) {
		this.rating.setValue(rating);
	}
}
