// Assignment #: 5
//         Name: William Schuhmann
//    StudentID: 1215016803
//      Lecture: 10:30 T/Th
//  Description: The Assignment 5 class displays a menu of choices to a user
//               and performs the chosen task. It will keep asking a user to
//               enter the next choice until the choice of 'Q' (Quit) is
//               entered.

import java.io.*;         //to use InputStreamReader and BufferedReader
import java.util.*;       //to use ArrayList

public class Assignment5
 {
	public static void main(String[] args){
     // ArrayList object is used to store Employee objects
     ArrayList<Employee> employeeList = new ArrayList<Employee>();

     try
      {
       printMenu();     // print out menu

       // create a BufferedReader object to read input from a keyboard
       InputStreamReader isr = new InputStreamReader (System.in);
       BufferedReader stdin = new BufferedReader (isr);
          
       String line, inputInfo;
       boolean operation = false;
       char input1;
       do
        {
         System.out.println("What action would you like to perform?");
         line = stdin.readLine().trim();
         input1 = line.charAt(0);
         input1 = Character.toUpperCase(input1);

         if (line.length() == 1)
          {
           switch (input1)
            {
             case 'A':   //Add Employee
               System.out.print("Please enter some employee information to add:\n");
               inputInfo = stdin.readLine().trim();
               employeeList.add(EmployeeParser.parseStringToEmploye(inputInfo));
               
             
               /***********************************************************************************
               ***  ADD your code here to call employee parser method to parse the string, 
               ***  then add the returned object to the list of employee
               ***********************************************************************************/
                    
               break;
                    
             case 'C':   //Compute Pay Amount
                   for (int i=0;i<employeeList.size(); i++) {
                	   (employeeList.get(i)).computePayAmount();
                   }
               /***********************************************************************************
               ***  ADD your code here to compute pay amounts for all employees
               ***********************************************************************************/
                    
                System.out.print("pay amount computed\n");
               break;
             case 'D':   //Search for Employee
               System.out.print("Please enter an employeeID to search:\n");
               String id = stdin.readLine().trim();
               
               operation=false;
               for (int i=0; i<employeeList.size(); i++) {
            	 if ((employeeList.get(i)).getEmployeeId().equals(id))
            		 operation=true;
               }

                /***********************************************************************************
                ***  ADD your code here to search an employee with the entered id
                ***********************************************************************************/
                    
                if (operation == true)
                 System.out.print("Employee found\n");
                else
                 System.out.print("Employee not found\n");
               break;
             case 'L':   //List Employees
                 if (employeeList.size()==0) {
                	 System.out.println("No Employee");
                 }
            	 for (int i=0; i<employeeList.size(); i++) {
            		 System.out.println(employeeList.get(i));
            	 }
                /***********************************************************************************
                ***  ADD your code here to print all employee, print "no employee\n" if the list is empty
                ***********************************************************************************/
                    
               break;
             case 'Q':   //Quit
               break;
             case '?':   //Display Menu
               printMenu();
               break;
             default:
               System.out.print("Unknown action\n");
               break;
            }
         }
        else
         {
           System.out.print("Unknown action\n");
          }
        } while (input1 != 'Q'); // stop the loop when Q is read
      }
     catch (IOException exception)
      {
        System.out.println("IO Exception");
      }
  }

  /** The method printMenu displays the menu to a user **/
  public static void printMenu()
   {
     System.out.print("Choice\t\tAction\n" +
                      "------\t\t------\n" +
                      "A\t\tAdd Employee\n" +
                      "C\t\tCompute Pay\n" +
                      "D\t\tSearch for Employee\n" +
                      "L\t\tList Employees\n" +
                      "Q\t\tQuit\n" +
                      "?\t\tDisplay Help\n\n");
  }
}

