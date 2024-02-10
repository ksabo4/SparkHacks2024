//package com.sparkhacks;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class StartGame extends Application{
	public static Stage curStage;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });


		FXMLLoader fxmlLoader = new FXMLLoader(StartGame.class.getResource("MainMenu.fxml"));
		Scene scene1 = new Scene(fxmlLoader.load(), 1280, 720);
        //scene1.getStylesheets().add("GameStyle.css");
        scene1.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		primaryStage.setTitle("Finance Learning Game");
		primaryStage.setScene(scene1);
		primaryStage.show();
		curStage = primaryStage;
	}
}
