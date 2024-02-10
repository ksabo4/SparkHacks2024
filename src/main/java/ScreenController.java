//package com.sparkhacks;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class ScreenController implements Initializable {
    private Character player;
    private int income;
    @FXML
    private Label gameText;

    @FXML
    private Label moneyText;
    @FXML
    private Label investmentText;
    @FXML
    private Label happinessText;
    @FXML
    private Label ageText;
    @FXML
    private Label goalText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        player = new Character();
        income = 3000;
    }

    @FXML
    private void buttonPressed(ActionEvent event) throws IOException {
        String buttonNum = (String)((Node) event.getSource()).getUserData();
        if (buttonNum.equals("1"))
        {
            player.invest(100, 1);
        }
        else if (buttonNum.equals("2"))
        {
            player.gamble(5);
        }
        else if (buttonNum.equals("3"))
        {
            player.spend(1000);
        }
        else if (buttonNum.equals("4"))
        {
            player.work(90);
        }
        else if (buttonNum.equals("5"))
        {
            player.gamble(100);
        }
        else if (buttonNum.equals("6"))
        {
            player.invest(50, 0);
        }
        else if (buttonNum.equals("7"))
        {
            player.progressTime(income);
        }
        else if (buttonNum.equals("8"))
        {
            player.withdrawInvestments(1000,1);
        }
        else if (buttonNum.equals("9"))
        {
            player.withdrawInvestments(1000,0);
        }
        moneyText.setText("Money: $" + player.getMoney());
        investmentText.setText("Investments: $" + player.getInvestments());
        happinessText.setText("Happiness: " + player.getHappiness());
        ageText.setText("Age: " + player.getAge() + " Years");
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
