// Assignment #: 5
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: 10:30 T/Th
//  Description: The Assignment 5 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

public class EmployeeParser {
	public static Employee parseStringToEmploye(String lineToParse) {
		String initialSplit[] = lineToParse.split(":");
		if (initialSplit.length == 6) {
			String firstName = initialSplit[1];
			String lastName = initialSplit[2];
			String employeeID = initialSplit[3];
			if(initialSplit[0].equalsIgnoreCase("FullTime")) {
				double salary = Double.parseDouble(initialSplit[4]);
				double bonus = Double.parseDouble(initialSplit[5]);
				FullTimeEmployee fullTimeObj = new FullTimeEmployee(firstName, lastName, employeeID, salary, bonus);
					return fullTimeObj;
			}
			else if (initialSplit[0].equalsIgnoreCase("PartTime")) {
				double hourlyRate = Double.parseDouble(initialSplit[4]);
				int hours = Integer.parseInt(initialSplit[5]);
				PartTimeEmployee partTimeObj = new PartTimeEmployee (firstName, lastName, employeeID, hourlyRate, hours);
				return partTimeObj;
			}
			else {
				return null;
			}
		}
		return null;
	}
}
