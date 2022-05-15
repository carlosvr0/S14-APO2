package application;
	
import java.io.IOException;


import controller.MainMenuController;
import controller.ClockController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private MainMenuController mainController;
	private ClockController clockController;
	
	@FXML
	private Stage stageMenu;
	@FXML
	private Stage stageInternationalClock;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MainMenu.fxml"));
    	BorderPane p = (BorderPane) loader.load();
		
		mainController = loader.getController();
		mainController.setMain(this);
		
		stageMenu = new Stage();
		Scene scene = new Scene(p);
		stageMenu.setScene(scene);
		stageMenu.show();

	}
	

	public void showIClock() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Clock.fxml"));
		BorderPane p = (BorderPane) loader.load();
		
		clockController = loader.getController();
		clockController.setMain(this);
		
		stageInternationalClock = new Stage();
		Scene scene = new Scene(p);
		stageInternationalClock.setScene(scene);
		stageInternationalClock.show();
	}



	public void showChronometer() {
		System.out.println("HOLA");
		
	}
	
}
