package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainMenuController {
	
	private Main main;

	public void setMain(Main main) {
		this.main = main;
	}
	
	
	@FXML
	public void clock(ActionEvent event) throws IOException {
		main.showIClock();
	}
	

	@FXML
	public void chronometer(ActionEvent event) throws IOException {
		main.showChronometer();
	}
}
