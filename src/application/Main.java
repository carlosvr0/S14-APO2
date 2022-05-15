package application;
	
import java.io.IOException;

import controller.ClockController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private ClockController clockController;
	
	@FXML
	private Stage stageMainClock;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			showClock();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showClock() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Clock.fxml"));
		BorderPane p = (BorderPane) loader.load();
		
		clockController = loader.getController();
		clockController.setMain(this);
		
		stageMainClock = new Stage();
		Scene scene = new Scene(p);
		stageMainClock.setScene(scene);
		stageMainClock.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
