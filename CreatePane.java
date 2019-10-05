package application;
//Assignment #: Arizona State University CSE205
//Name: William Schuhmann
//StudentID: 1215016803
//Lecture: T/Th 10:30 am
//Description: CreatePane generates a pane where a user can enter
//a movie information and create a list of available movies.

import java.util.ArrayList;
import javafx.scene.layout.HBox;
//import all other necessary javafx classes here
//----
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.*;

import javafx.scene.layout.GridPane;

public class CreatePane extends HBox
{
private ArrayList<Movie> movieList;

//The relationship between CreatePane and ReviewPane is Aggregation
private ReviewPane reviewPane;
private TextField f1;
private TextField f2;
private TextField f3;
private Label message;
private TextArea tear;
private Movie film;
private Label eb;
private Movie movie;

//constructor
public CreatePane(ArrayList<Movie> list, ReviewPane rePane)
{
this.movieList = list;
this.reviewPane = rePane;

//Step #1: initialize each instance variable and set up the layout
//----
GridPane grid = new GridPane();
grid.setHgap(5.5);
grid.setVgap(5.5);
f1 = new TextField();
f2 = new TextField();
f3 = new TextField();
Label f11 = new Label("Title");
Label f22 = new Label("Length");
Label f33 = new Label("Year");
eb = new Label("");

Button addMovie = new Button("Create a Movie");
grid.add(addMovie, 3, 6);
tear = new TextArea("No Movie");
tear.setPrefSize(400, 450);
this.getChildren().addAll(grid,tear);
addMovie.setOnAction(new ButtonHandler());


grid.add(eb, 2, 2);
grid.add(f11, 2, 3);
grid.add(f22, 2, 4);
grid.add(f33, 2, 5);
grid.add(f1, 3, 3);
grid.add(f2, 3, 4);
grid.add(f3, 3, 5);
//create a GridPane hold those labels & text fields
//consider using .setPadding() or setHgap(), setVgap()
//to control the spacing and gap, etc.
//----


//You might need to create a sub pane to hold the button
//----

//Set up the layout for the left half of the CreatePane.
//----


//the right half of this pane is simply a TextArea object
//Note: a ScrollPane will be added to it automatically when there are no
//enough space

//Add the left half and right half to the CreatePane
//Note: CreatePane extends from HBox
//----

//Step #3: register source object with event handler
//----

} //end of constructor

//Step 2: Create a ButtonHandler class
//ButtonHandler listens to see if the button "Create a Movie" is pushed or not,
//When the event occurs, it get a movie's Title, Year, and Length
//information from the relevant text fields, then create a new movie and add it inside
//the movieList. Meanwhile it will display the movie's information inside the text area.
//It also does error checking in case any of the textfields are empty or non-numeric string is typed
private class ButtonHandler implements EventHandler<ActionEvent>
{
//Override the abstact method handle()
public void handle(ActionEvent event)
{
 //declare any necessary local variables here
 //---
 String t1;
 String t2;
 String t3;
 t1=f1.getText();
 t2=f2.getText();
 t3=f3.getText();
 //when a text field is empty and the button is pushed
 if (t1.equals("")|t2.equals("")|t3.equals("")){
	 eb.setText("Fill out all the values");
	 eb.setTextFill(Color.RED);         
 }else	//for all other cases
     {
    	 try {
    		 int numone=Integer.parseInt(t2);
    		 int numtwo=Integer.parseInt(t3);
    	 }catch(NumberFormatException e) {
    		 eb.setText("Incorrect data format");
    		 eb.setTextFill(Color.RED);
    	 }
         movie = new Movie();
         movie.setMovieTitle(t1);
         movie.setLength(Integer.parseInt(t2));
         movie.setYear(Integer.parseInt(t3));
         movieList.add(movie);
         reviewPane.updateMovieList(movie);
         tear.setText("");
         eb.setText("Movie Added");
         eb.setTextFill(Color.RED);
         f1.setText("");
         f2.setText("");
         f3.setText("");
     }
 for(int i=0;i<movieList.size();i++) {
	 tear.appendText(movieList.get(i).toString());
 }
} //end of handle() method
} //end of ButtonHandler class
}