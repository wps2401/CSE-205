package application;
//Assignment #: Arizona State University CSE205
//Name: William Schuhmann 
//StudentID: 1215016803
//Lecture: T/Th 10:30 am
//Description: ReviewPane displays a list of available movies
//from which a user can select to reviw.

import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;	//**Need to import to handle event
import javafx.event.EventHandler;	//**Need to import to handle event

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import java.util.ArrayList;

//import all other necessary javafx classes here
//----

public class ReviewPane extends VBox
{
private ArrayList<Movie> movieList;

//A ListView to display movies created
private ListView<Movie> movieListView;

//declare all other necessary GUI variables here
//----
private RadioButton poorBut;
private RadioButton badBut;
private RadioButton aveBut;
private RadioButton goodBut;
private RadioButton excBut;
private ObservableList<Movie> m;
private ToggleGroup group;

//constructor
public ReviewPane(ArrayList<Movie> list)
{
//initialize instance variables
this.movieList = list;

Button submit = new Button();
submit.setText("Submit Review");



poorBut = new RadioButton("Poor");
badBut = new RadioButton("Bad");
aveBut = new RadioButton("Average");
goodBut = new RadioButton("Good");
excBut = new RadioButton("Excellent");

group = new ToggleGroup();
poorBut.setToggleGroup(group);
badBut.setToggleGroup(group);
aveBut.setToggleGroup(group);
goodBut.setToggleGroup(group);
excBut.setToggleGroup(group);



TextArea textArea2 = new TextArea();

//set up the layout
m = FXCollections.observableArrayList(list);
movieListView = new ListView<>(m);
movieListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

HBox pane3 = new HBox();
pane3.setPadding(new Insets(15, 12, 15, 12));
pane3.setSpacing(10);

//ReviewPane is a VBox - add the components here
//----

pane3.getChildren().addAll(poorBut, badBut, aveBut, goodBut, excBut, movieListView);

this.getChildren().add(textArea2);
this.getChildren().add(pane3);
this.getChildren().add(submit);

//Step #3: Register the button with its handler class
//----

//ReviewPane.RatingHandler aHandler = new ReviewPane.RatingHandler();
submit.setOnAction(new RatingHandler());
RatingHandler rhandle = new RatingHandler();
submit.setOnAction(rhandle);

} //end of constructor

//This method refresh the ListView whenever there's new movie added in CreatePane
//you will need to update the underline ObservableList object in order for ListView
//object to show the updated movie list
public void updateMovieList(Movie newMovie)
{
m.add(newMovie);
//movieListView.refresh();
}

//Step 2: Create a RatingHandler class
private class RatingHandler implements EventHandler<ActionEvent>
{
	
//Override the abstact method handle()
public void handle(ActionEvent event)
{
 //When "Submit Review" button is pressed and a movie is selected from
 //the list view's average rating is updated by adding a additional
 //rating specified by a selected radio button
	
Movie tempMovie = movieListView.getSelectionModel().getSelectedItem();
if (group.getSelectedToggle() != null && tempMovie != null) {
	if (poorBut.isSelected()){
	      tempMovie.addRating(1.0);       
	     }else if (badBut.isSelected()) {
	    	 tempMovie.addRating(2.0);
	     }else if (aveBut.isSelected()) {
	    	 tempMovie.addRating(3.0);
	     }else if (goodBut.isSelected()) {
	    	 tempMovie.addRating(4.0);
	     }else {
	    	 tempMovie.addRating(5.0);
	     }
	 movieListView.refresh();
}

}
} //end of RatingHandler
} //end of ReviewPane class