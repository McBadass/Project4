//-----------------------------------------------------------------------
// Class:			MainMenuController.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		Handles the MainMenu GUI
//
// Files:		    MainApp.java, MainMenuController.java, Menu.fxml,
//                  ProblemOne.java, ProblemTwo.java, ProblemThree.java,
//                  RootLayout.fxml, RootLayout.java
//-----------------------------------------------------------------------

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by tvories on 10/4/14.
 */


public class MainMenuController {
    //Reference to main application
    private MainApp mainApp;
    DecimalFormat dFormat = new DecimalFormat("#,###.0000", DecimalFormatSymbols.getInstance());

    @FXML
    private TextField seriesIntTextField;
    @FXML
    private TextField palStringTextField;
    @FXML
    private TextField gcdInt1TextField;
    @FXML
    private TextField gcdInt2TextField;

    @FXML
    private Button seriesProcessButton;
    @FXML
    private Button palProcessButton;
    @FXML
    private Button gcdProcessButton;

    @FXML
    private Label seriesResultLabel;
    @FXML
    private Label palResultLabel;
    @FXML
    private Label gcdResultLabel;

    /**
     * Handles ProblemOne method button click
     * @param event
     */
    public void handleSeriesProcessButton(ActionEvent event) {
        String input = seriesIntTextField.getText();
        if (verifyInt(input)) {
            double result = mainApp.p1.process(Integer.parseInt(input));
            seriesResultLabel.setTextFill(Color.GREEN);
            seriesResultLabel.setText(String.format(dFormat.format(result)));
        }
        else {
            //TODO: find some nice way of popping up or notifying this data.
            System.out.println("Must be an integer!");
        }
    }

    /**
     * Handles ProblemTwo method button click
     * @param event
     */
    public void handlePalProcessButton(ActionEvent event) {
        String input = palStringTextField.getText();
        boolean isPal = mainApp.p2.process(input);
        if (isPal){
            palResultLabel.setTextFill(Color.GREEN);
            palResultLabel.setText("Input is Palindrome!");
        }
        else {
            palResultLabel.setTextFill(Color.RED);
            palResultLabel.setText("Maybe you should learn what a palindrome is...");
        }
    }

    /**
     * Handles ProblemThree method button click
     * @param event
     */
    public void handleGcdProcessButton(ActionEvent event) {
        String input1 = gcdInt1TextField.getText();
        String input2 = gcdInt2TextField.getText();
        if(verifyInt(input1) && verifyInt(input2)) { // If both inputs are ints
            int result = mainApp.p3.GCD(Integer.parseInt(input1), Integer.parseInt(input2));
            gcdResultLabel.setTextFill(Color.GREEN);
            gcdResultLabel.setText("" + result);
        } else {
            System.out.println("Must be an integer!");
        }
    }

    /**
     * Verifies that the input from a text field is able
     * to be parsed to an integer
     * @param input
     * @return
     */
    public boolean verifyInt(String input) {
        try {
            int temp = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}
