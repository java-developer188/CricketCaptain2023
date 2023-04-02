package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class TossController implements Initializable {

	@FXML
	private ImageView coinImageView;
	
	@FXML
	private Button headsButton;
	
	@FXML
	private Button tailsButton;
	
	@FXML
	private Label tossMessageLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public void doToss() {
		//some coin toss animation work
		

	}

}
