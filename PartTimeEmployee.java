// Assignment #: 5
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: 10:30 T/Th
//  Description: The Assignment 5 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

public class PartTimeEmployee extends Employee{
double hourlyRate;
int hours;

	public PartTimeEmployee(String firstname, String lastname, String employeeid, double hourlyRate, int hours) {
		super(firstname, lastname, employeeid);
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}
	public void computePayAmount() { //Sets instance pay Amount to the number of hours worked times amount per hour. 
		this.payAmount=this.hourlyRate*this.hours;
	}
	
	public String toString(){
		return("\nPart Time Employee:"+
				super.toString()+ //Inherited from Employee Class
				"Hourly Rate:\t\t"+this.hourlyRate+"\n"+
				"Hours:\t\t\t"+this.hours+"\n");
	}

}
