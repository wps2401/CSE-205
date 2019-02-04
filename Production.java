// Assignment #: 4
// Name: William Schuhmann
// StudentID: 1215016803
// Lecture: 10:30 T/Th
// Description: Assignment 4 class displays a menu of choices to a user
//        and performs the chosen task. It will keep asking a user to
//        enter the next choice until the choice of 'Q' (Quit) is entered.
public class Production {
String companyName;
String locationCity;
String locationState;

//Methods
public String getCompanyName() {
	return companyName;
}
public String getLocationCity() {
	return locationCity;
}
public String getLocationState() {
	return locationState;
}


public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public void setLocationCity(String locationCity) {
	this.locationCity = locationCity;
}
public void setLocationState(String locationState) {
	this.locationState = locationState;
}

//Output
public String toString() {
	return "Movie Production:\t" + this.getCompanyName() + " at " + this.locationCity + ","+ this.getLocationState();
}
}
