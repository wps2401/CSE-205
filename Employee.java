// Assignment #: 5
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: 10:30 T/Th
//  Description: The Assignment 5 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
protected String firstName;				//The first name of an employee
protected String lastName;				//The last name of an employee
protected String employeeId;			//The id of an employee
protected double payAmount;		//The pay amount of an employee
protected NumberFormat nf = new DecimalFormat("$#,##0.00");

public Employee(String firstname, String lastname, String employeeid){
	this.firstName = firstname;
	this.lastName = lastname;
	this.employeeId = employeeid;
	this.payAmount = 0.0;
}

public String getEmployeeId(){
	return this.employeeId;
}

public void computePayAmount( ){
	return;
}

// Original Output
public String toString(){
	return ("\nFirst name:\t\t"+this.firstName+"\n"+
			"Last name:\t\t"+this.lastName+"\n"+
			"Employee ID:\t\t"+this.employeeId+"\n"+
			"Pay Amount:\t\t"+nf.format(this.payAmount)+"\n");
}
}
