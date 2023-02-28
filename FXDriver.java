package com.example.lab2_gui;


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		FXMainPane.ButtonHandler btn = root.new ButtonHandler();
		btn.handle(new ActionEvent());
		//  set the scene to hold root
		Scene scene = new Scene(root, 800, 200);
		//set stage title
		stage.setTitle("Hello World GUI");
		//set scene to stage
		stage.setScene(scene);
		//display the stage
		stage.show();

	}
}
