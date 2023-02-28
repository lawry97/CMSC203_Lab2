package com.example.lab2_gui;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {


	//student Task #2:
	//  declare five buttons, a label, and a textfield
	private Button helloBtn = new Button("Hello");
	private Button howdyBtn = new Button("Howdy");
	private Button chineseBtn = new Button("Chinese");
	private Button clearBtn = new Button("Clear");
	private Button exitBtn = new Button("Exit");
	private Label feedBackLabl = new Label("FeedBack");
	private TextField field = new TextField();
	//  declare two HBoxes
	private HBox hb1 = new HBox();
	private HBox hb2 = new HBox();
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataMngr = new DataManager();




	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes

		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		hb1.setMargin(feedBackLabl, new Insets(10));
		hb1.setMargin(field, new Insets(10));

		hb2.setMargin(helloBtn, new Insets(10));
		hb2.setMargin(howdyBtn, new Insets(10));
		hb2.setMargin(chineseBtn, new Insets(10));
		hb2.setMargin(clearBtn, new Insets(10));
		hb2.setMargin(exitBtn, new Insets(10));


		hb1.setAlignment(Pos.CENTER);
		hb2.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		hb1.getChildren().addAll(feedBackLabl, field);
		//  add the buttons to the other HBox
		hb2.getChildren().addAll(helloBtn, howdyBtn, chineseBtn, clearBtn, exitBtn);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hb1, hb2);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	public class ButtonHandler implements EventHandler<ActionEvent>
	{

		@Override
		public void handle(ActionEvent event) {

			EventTarget target = event.getTarget();

			helloBtn.setOnAction( value->
			{
				field.setText(dataMngr.getHello());
			});

			howdyBtn.setOnAction( value->{
				field.setText(dataMngr.getHowdy());
			});

			chineseBtn.setOnAction(value->{
				field.setText(dataMngr.getChinese());
			});

			clearBtn.setOnAction(value->{
				field.clear();
			});

			exitBtn.setOnAction(value->{
				Platform.exit();
				System.exit(0);
			});

		}
	}
}
	
