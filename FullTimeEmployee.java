// Assignment #: 5
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: 10:30 T/Th
//  Description: The Assignment 5 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

public class FullTimeEmployee extends Employee{
private double salary;
private double bonus;

public FullTimeEmployee(String firstname, String lastname, String employeeid, double salary, double bonus) {
	super(firstname, lastname, employeeid);
	this.bonus = bonus;
	this.salary = salary;
}

public void computePayAmount() {
	this.payAmount=this.salary+this.bonus;
}
//Output
public String toString() {
	return ("\nFull Time Employee:"+
			super.toString()+ //Inherited from Employee Class
			"Salary:\t\t\t"+nf.format(this.salary)+"\n"+
			"Bonus:\t\t\t"+nf.format(this.bonus)+"\n"
			);
								
			
}
}