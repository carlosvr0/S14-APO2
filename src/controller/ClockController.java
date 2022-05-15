package controller;

import java.awt.Label;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.TimeZone;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.LocalTime;

public class ClockController implements Initializable{
	
	public Calendar calendar;
	public SimpleDateFormat timeFormat;
	public LocalTime localT;
	
	private Main main;
	
	@FXML
	public Label localTimeLabel;
	
	@FXML
    private ComboBox<String> citiesOptionBox;
	
	
	public ClockController() {}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		timeFormat = new SimpleDateFormat("hh:mm::ss aa");
		
		localT = new LocalTime(this);
		localT.start();
		
		
		ObservableList<String> citiesTimeZones = FXCollections.observableArrayList(TimeZone.getAvailableIDs());
		citiesOptionBox.setItems(citiesTimeZones);
	}


	public void setMain(Main main) {
		this.main = main;
	}
	

}
