package lab12.trip;

import java.time.LocalDate;

public class Trip {
	private String country;
	private String type;
	private LocalDate fromDate;
	private LocalDate toDate;
	private String rating;

	public Trip() {
	}

	public Trip(String country, String type, LocalDate fromDate, LocalDate toDate, String rating) {
		super();
		this.country = country;
		this.type = type;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.rating = rating;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
