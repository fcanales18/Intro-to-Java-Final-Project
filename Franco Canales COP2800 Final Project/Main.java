package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	
//The main window in which we set all others sub windows 
private static Stage primarystage; 

//Boarder layout in all windows 
private static BorderPane mainLayout;
	
//First function that will be called once we click run
@Override
	public void start(Stage primaryStage) throws IOException {
		//FA initializing everything

	    this.primarystage=primaryStage;
		this.primarystage.setTitle("Banking System");
		primaryStage.setResizable(false);
		showMainView();
		}


	public static void showMainView() throws IOException
	{
	
	 
	//FXMLLoader loads fxml file 
	FXMLLoader loader =new FXMLLoader();
	//Loads mainView fxml file 
		loader.setLocation(Main.class.getResource("mainScreen.fxml"));
		mainLayout=loader.load();
		
		//Sets the fxml file to display(scene)
		Scene scene = new Scene(mainLayout);
		primarystage.setScene(scene);
		primarystage.show();
	}
	
	
	
	//The main function of this program where code starts execute
	public static void main(String[] args) {
		
		launch(args);
		//Code executes from start function declared above
	}
}
