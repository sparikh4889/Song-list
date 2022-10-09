package app;

import javafx.application.Application;
import javafx.stage.Stage;
import view.SongLibController;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class SongLib extends Application{
    @Override
	public void start(Stage primaryStage) throws Exception {
	  // create FXML loader
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("../view/SongLib.fxml"));
		
		// load fxml, root layout manger in fxml file in GridPane
		GridPane root = (GridPane)loader.load();
		
		// set up controller
		SongLibController songLibController = loader.getController();
		songLibController.start(primaryStage);
		
		// set scene to root
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
    //primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
	    // TODO Auto-generated method stub
		launch(args);
	}
}
