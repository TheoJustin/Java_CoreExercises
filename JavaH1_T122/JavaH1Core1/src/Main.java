
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene;
		Label label;
		TextField txt;
		Button btn;
		
	    InputStream stream = new FileInputStream("D:\\New folder\\JavaH1\\assets\\logo.png");
	    Image image = new Image(stream);
	    ImageView imageView = new ImageView();
	    imageView.setImage(image);
	    imageView.setX(10);
	    imageView.setY(10);
	    imageView.setFitWidth(575);
	    imageView.setPreserveRatio(true);
	    
	    VBox layout2 = new VBox();
	    layout2.getChildren().add(imageView);
	    layout2.setAlignment(Pos.CENTER);
	    
	    label = new Label("NIK: ");
	    btn = new Button("Next");
	    txt = new TextField();
	    
	    
	    
	    HBox nikInput = new HBox();
	    nikInput.getChildren().addAll(label, txt);

	    nikInput.setAlignment(Pos.CENTER);
	    layout2.getChildren().addAll(nikInput, btn);
	    
	    
	    scene = new Scene(layout2, 1000, 600);
	    stage.setTitle("Vicket.com");

	    BackgroundFill backgroundFill =
	            new BackgroundFill(
	                    Color.valueOf("#bff0ff"),
	                    new CornerRadii(10),
	                    new Insets(10)
	                    );

	    Background background =
	            new Background(backgroundFill);

	    Alert a = new Alert(AlertType.NONE);
	    btn.setOnAction(e ->{
	    	if(txt.getText().length()==24) {
	    		try {
					registrationScene(stage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	}else {
	    		a.setAlertType(AlertType.WARNING);
	    		a.show();
	    	}
	    	
	    });
	    
	    
	    layout2.setBackground(background);
	    
	    stage.setScene(scene);

	    stage.show();
	}
	
	public void registrationScene(Stage stage) throws Exception  {
		Scene scene;
		Label label1;
		Label label2;
		Label label3;
		Label label4;
		TextField txt1;
		TextField txt2;
		Button btn;
		RadioButton pick1;
		RadioButton pick2;
		CheckBox cb;
		
		
	    InputStream stream = new FileInputStream("D:\\New folder\\JavaH1\\assets\\logo.png");
	    Image image = new Image(stream);
	    ImageView imageView = new ImageView();
	    imageView.setImage(image);
	    imageView.setX(10);
	    imageView.setY(10);
	    imageView.setFitWidth(575);
	    imageView.setPreserveRatio(true);
	    
	    VBox layout2 = new VBox();
	    layout2.getChildren().add(imageView);
	    layout2.setAlignment(Pos.CENTER);
	    
	    label1 = new Label("Full Name : ");
	    label2 = new Label("Phone Number : ");
	    label3 = new Label("Gender : ");
	    label4 = new Label("Agree to terms & condition");
	    btn = new Button("Next");
	    txt1 = new TextField();
	    txt2 = new TextField();
	    pick1 = new RadioButton("Male");
	    pick2 = new RadioButton("Female");
	    cb = new CheckBox();
	    
	    HBox fullName = new HBox(label1, txt1);
	    fullName.setAlignment(Pos.CENTER);
	    HBox phoneNumber = new HBox(label2, txt2);
	    phoneNumber.setAlignment(Pos.CENTER);
	    HBox genderTwo = new HBox(pick1, pick2);
	    genderTwo.setAlignment(Pos.CENTER);
	    VBox genderFill = new VBox(label3, genderTwo);
	    genderFill.setAlignment(Pos.CENTER);
	    HBox termsCond = new HBox(cb, label4);
	    termsCond.setAlignment(Pos.CENTER);
	    
	    GridPane gridPane = new GridPane();
	    
	    gridPane.add(label1, 0, 0);
	    gridPane.add(label2, 0, 1);
	    gridPane.add(txt1, 1, 0);
	    gridPane.add(txt2, 1, 1);
	    gridPane.add(label3, 0, 2);
	    gridPane.add(pick1, 0, 3);
	    gridPane.add(pick2, 1, 3);
	    gridPane.add(cb, 0, 4);
	    gridPane.add(label4, 1, 4);
	    gridPane.add(btn, 0, 5);
	    
	    
	    
//	    gridPane.add(fullName, 0, 0, 1, 1);
//	    gridPane.add(phoneNumber, 0, 1, 1, 1);
//	    gridPane.add(genderFill, 0, 2, 1, 1);
//	    gridPane.add(termsCond, 0, 3, 1, 1);
//      gridPane.add(btn, 0, 4, 1, 1);
//	    layout2.getChildren().add(fullName);
//	    layout2.getChildren().add(phoneNumber);
//	    layout2.getChildren().add(genderFill);
//	    layout2.getChildren().add(termsCond);
//	    layout2.getChildren().add(btn);
        

	    gridPane.setStyle("-fx-background-color: white");
	    layout2.getChildren().add(gridPane);
	    gridPane.setAlignment(Pos.CENTER);
	    gridPane.setMaxWidth(350);
	    
	    scene = new Scene(layout2, 1000, 600);

	    BackgroundFill backgroundFill =
	            new BackgroundFill(
	                    Color.valueOf("#bff0ff"),
	                    new CornerRadii(10),
	                    new Insets(10)
	                    );

	    Background background =
	            new Background(backgroundFill);
	    
	    
	    layout2.setBackground(background);
	    
	    stage.setScene(scene);
	}

}


