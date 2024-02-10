import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {

    @FXML
    private Label portLabel;

    @FXML
    private Button playButton;
    //For changing scenes
    private Stage stage;
    private Scene scene;
    private Parent root;

    public static boolean validPort = true;

    //This method is called upon fxml load
    public void initialize(URL location, ResourceBundle resources) {
        /*if (GuiServer.clientConnection.isConnected()) {
            portLabel.setText("You are on\n port " + Client.portNumber);
        } else {
            portLabel.setText("You are not\nconnected\nto the server");
            playButton.setText("Change\nPort");
        }*/

    }

    @FXML
    protected void onPlayButtonPressed(ActionEvent event) {

        try {
            root = FXMLLoader.load(Objects.requireNonNull(MainMenu.class.getResource("mainPage.fxml")));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root, 1280, 720);
            scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Your goal");
            alert.setHeaderText(null);
            alert.setContentText("Your goal this run is to become a Astronaut (Net Worth > 100,000, Happiness > 90%");

            // Display the alert and wait for the user to close it before continuing
            alert.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Issues switching to Main Page scene");
        }
        /*else
        {
            try {
                root = FXMLLoader.load(Objects.requireNonNull(LoadScreen.class.getResource("LoadScreen.fxml")));
                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root, 700, 500);
                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Issues switching to LoadScreen scene");
            }
        }*/


    }

    @FXML
    protected void onQuitButtonPressed() {
        Platform.exit();
        System.exit(0);
    }
}
