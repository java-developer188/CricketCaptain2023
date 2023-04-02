package application;
	
import application.controller.StartController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/view/Start.fxml"));
			Parent root = fxmlLoader.load();
			
			StartController startController = fxmlLoader.getController();
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			scene.setOnKeyPressed(event -> {
			    if (event.getCode() == KeyCode.ENTER) {
			       startController.play(event);
			    }
			    if (event.getCode() == KeyCode.ESCAPE) {
	                event.consume();
	            }
			});

			primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../cc23.jpeg")));
			primaryStage.setTitle("Cricket Captain 2023");
			primaryStage.setScene(scene);
			primaryStage.setFullScreen(false);
			primaryStage.setResizable(false);
			primaryStage.setFullScreenExitHint("");
			//primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
