package controller;

import javafx.fxml.FXML;

public class AppController {
	
	private MainController mainController;
	

	@FXML
	public void back() {
		mainController.loadMenuScreen();
	}


	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
}
