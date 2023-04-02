package application.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class StartController {

	@FXML
	private TextField playerName;

	public void play(MouseEvent event) {
		Node node = (Node)event.getSource();
		switchToPlayScene(((Stage) node.getScene().getWindow()));

	}

	public void play(KeyEvent event) {
		Scene scene = (Scene) event.getSource();
		switchToTossScene((Stage) scene.getWindow());

	}
	
	public void switchToTossScene(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Toss.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			stage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void switchToPlayScene(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Play.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			stage.setScene(scene);
			stage.setFullScreen(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
