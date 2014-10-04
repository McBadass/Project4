//-----------------------------------------------------------------------
// Class:			MainApp.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Desc:            Programming assignment 4. Main App controls JavaFX
//                  GUI.
//
// Files:           All files in src folder
//-----------------------------------------------------------------------

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application{

    private Stage primaryStage;
    private BorderPane rootLayout;
    public ProblemOne p1;
    public ProblemTwo p2;
    public ProblemThree p3;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Curse the Recurse");
        setUserAgentStylesheet(STYLESHEET_MODENA);

        p1 = new ProblemOne();
        p2 = new ProblemTwo();
        p3 = new ProblemThree();
        initRootLayout();
        showMainMenu();
    }

    /**
     * Initializes the root layout
     */
    public void initRootLayout() {
        try {
            //Load root layout from fxml file
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            //Show the scene containing the root layout
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Shows the MainMenu inside the RootLayout
     */
    public void showMainMenu() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("Menu.fxml"));
            AnchorPane mainMenu = (AnchorPane) loader.load();

            //Set MainMenu to the center of RootLayout
            rootLayout.setCenter(mainMenu);

            //Give the controller access to mainApp
            MainMenuController mainMenuController = loader.getController();
            mainMenuController.setMainApp(this);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
        launch(args);
	}
}
