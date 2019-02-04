// Assignment #: 4
// Name: William Schuhmann
// StudentID: 1215016803
// Lecture: 10:30 T/Th
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.
public class Movie {
private String movieTitle = "?";
private int year = 0;
private int length = 0;
private Production prodCompany;

//Methods
public String getMovieTitle() {
	return movieTitle;
}
public int getYear() {
	return year;
}
public int getLength() {
	return length;
}
public Production getProdCompany(){
	return prodCompany;
}


public void setMovieTitle(String movieTitle) {
	this.movieTitle = movieTitle;
}
public void setYear(int year) {
	this.year = year; 
}
public void setLength(int length) {
	this.length = length;
}
public void setProdCompany(String someName, String someCity, String someState) {
	this.prodCompany = new Production();
	this.prodCompany.setCompanyName(someName);
	this.prodCompany.setLocationCity(someCity);
	this.prodCompany.setLocationState(someState);
}

//Output
public String toString() {
	return "Movie Title:\t\t" + this.getMovieTitle() 
	      +"\nMovie Length:\t\t" + this.getLength() 
	      +"\nMovie Year:\t\t"                    + this.getYear() + " \n" 
	                                            +this.prodCompany.toString();
}}

