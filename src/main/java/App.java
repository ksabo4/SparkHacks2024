//package com.sparkhacks;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
*/
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    private static Scene scene;

    // Creates the start scene with fxml "*.fxml" in a 640x480 screen
    // It's auto-generated, we can change it idk
    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainPage"), 1280, 720);
        // This lets you add styles.css as a stylesheet
        scene.getStylesheets().add(getClass().getResource("/com/sparkhacks/styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    // Sets root with fxml like a scene. Idk what the difference is between a scene and a root
    // but the root is changed in ScreenController.java to switch between Primary and Secondary
    // just as an example.
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    // FXML can be used to display screen content via fxml files
    // refer to ...\resources\com\sparkhacks\*.fxml
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
}