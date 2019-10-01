package buildingHola;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaBindings extends Application {
	
	private TextField nombreText;
	private Label saludoLabel;
	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setPrefColumnCount(10);
		
		saludoLabel = new Label(".");
		
		VBox root = new VBox(5,nombreText,saludoLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		//StringProperty saludoASecas = new SimpleStringProperty("¡Hola! ");
		
		//Establecemos el bindeo
		//saludoLabel.textProperty().bind(saludoASecas.concat(nombreText.textProperty().concat(" paso")));
		saludoLabel.textProperty().bind(Bindings.concat("¡Hola ",nombreText.textProperty(),"!"));
		
		Scene scene = new Scene(root,320,200);
		
		
		primaryStage.setTitle("Hola en Bindings");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
