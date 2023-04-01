package FrontEnd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application {
	private static Stage stg;

	@Override
	public void start(Stage primaryStage) throws Exception{
		stg=primaryStage;
		primaryStage.setResizable(false);
		Parent root = FXMLLoader.load(getClass().getResource("homesc1.fxml"));
			primaryStage.setTitle("Healthcare MANAGEMENT SYSTEM");
			primaryStage.setScene(new Scene(root,600,400));
			primaryStage.show();

	}
public void changeScene(String fxml) throws Exception{
	Parent pane= FXMLLoader.load(getClass().getResource(fxml));
	stg.getScene().setRoot(pane);
}
	
	public static void main(String[] args) {
		launch(args);
	}
}
