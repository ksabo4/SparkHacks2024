//package com.sparkhacks;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScreenController {

    @FXML
    private Label gameText;
    @FXML
    private void gameText() throws IOException {
        System.out.println("Clicked!");
        gameText.setText("New Text");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
