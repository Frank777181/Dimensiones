package dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Dimensiones extends Application {

	private Label primerLabel;
	private Label segundoLabel;
	private Label tercerLabel;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primerLabel = new Label(".");
		segundoLabel = new Label(".");
		tercerLabel = new Label(".");
		
		VBox root = new VBox(5, primerLabel, segundoLabel, tercerLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		primerLabel.textProperty().bind(Bindings.concat("Altura: ").concat(scene.heightProperty()));
		segundoLabel.textProperty().bind(Bindings.concat("Anchura: ").concat(scene.widthProperty()));
		tercerLabel.textProperty().bind(Bindings.concat("Area: ").concat(scene.heightProperty().multiply(scene.widthProperty())));
	
		
		primaryStage.setTitle("Dimensiones");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
