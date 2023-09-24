

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	//register
	Scene scene;
	BorderPane borderContainer;
	GridPane gridContainer;
	FlowPane flowContainer;
	VBox vContainer, registDiv, Vbox2;
	Label titleLbl, alreadyLbl, hereLbl;
	TextField emailTF, usernameTF;
	PasswordField passwordPF, confirmPF;
	Button regisButton;
	ImageView imageView;
	Image image;
	HBox Hbox, Hbox2, Hbox3;
	BackgroundSize bgSize;
	BackgroundImage bgImg;
	Background bg;
	Image spoImage;
	ImageView spoImageView;
	
	// login
	Scene lscene;
	BorderPane lborderContainer;
	GridPane lgridContainer;
	FlowPane lflowContainer;
	VBox lvContainer, lregistDiv, lVbox2;
	Label ltitleLbl, lalreadyLbl, lhereLbl;
	TextField lemailTF, lusernameTF;
	PasswordField lpasswordPF, lconfirmPF;
	Button lregisButton;
	ImageView limageView;
	Image limage;
	HBox lHbox, lHbox2, lHbox3;
	BackgroundSize lbgSize;
	BackgroundImage lbgImg;
	Background lbg;
	Image lspoImage;
	ImageView lspoImageView;
	
	
	
	public void initializeRegister() {
		borderContainer = new BorderPane();
		gridContainer = new GridPane();
		flowContainer = new FlowPane();
		Hbox = new HBox();
		Hbox2 = new HBox();
		Hbox3 = new HBox();
		Vbox2 = new VBox();
		registDiv = new VBox();
		
		titleLbl = new Label("SporRGify");
		
		usernameTF = new TextField();
		usernameTF.setPromptText("Username");
		emailTF = new TextField();
		emailTF.setPromptText("Email");
		passwordPF = new PasswordField();
		passwordPF.setPromptText("Password");
		confirmPF = new PasswordField();
		confirmPF.setPromptText("Confirm Password");
		regisButton = new Button("Register");
		
		alreadyLbl = new Label("Already have an account? Login");
		hereLbl = new Label("Here");
		
		scene = new Scene(borderContainer, 700, 550);
		
		image = new Image("assets/background-img.gif");
		imageView = new ImageView(image);
		bgSize = new BackgroundSize(1, 1.2, true, true, false, false);
		bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		bg = new Background(bgImg);
		
		spoImage = new Image("assets/logo.png");
		spoImageView = new ImageView(spoImage);
		
		
		image = new Image("assets/background-img.gif");
		imageView = new ImageView(image);
	}
	
	public void arrangeComponentRegister() {
		
		
		usernameTF.setMaxWidth(400);
		usernameTF.setPrefHeight(30);
		emailTF.setMaxWidth(400);
		emailTF.setPrefHeight(30);
		passwordPF.setMaxWidth(400);
		passwordPF.setPrefHeight(30);
		confirmPF.setMaxWidth(400);
		confirmPF.setPrefHeight(30);
		
		spoImageView.setPreserveRatio(true);
		spoImageView.setFitWidth(50);
		
		registDiv.setAlignment(Pos.CENTER);
		Hbox.setAlignment(Pos.CENTER);
		Hbox2.setAlignment(Pos.CENTER);
		Vbox2.setAlignment(Pos.CENTER);
		flowContainer.setAlignment(Pos.CENTER);
		Hbox3.setAlignment(Pos.CENTER);
		
		titleLbl.setTextFill(Color.WHITE);
		alreadyLbl.setTextFill(Color.WHITE);
		titleLbl.setFont(Font.font(24));
		hereLbl.setTextFill(Color.GREEN);
	}
	
	public void addComponentRegister() {
		borderContainer.setBackground(bg);
		borderContainer.setCenter(Hbox);
		
		Hbox.getChildren().add(registDiv);
		flowContainer.getChildren().add(alreadyLbl);
		flowContainer.getChildren().add(hereLbl);
		
		Hbox3.getChildren().addAll(spoImageView, titleLbl);
		
		registDiv.getChildren().addAll(Hbox2);
		Hbox2.getChildren().add(Vbox2);
		Vbox2.getChildren().addAll(Hbox3, usernameTF, emailTF, passwordPF, confirmPF, regisButton, flowContainer);
		
		Vbox2.setStyle("-fx-background-color:black");
		Vbox2.setPadding(new Insets(25, 100, 25, 100));
		Vbox2.setMargin(usernameTF, new Insets(5, 0, 5, 0));
		Vbox2.setMargin(emailTF, new Insets(5, 0, 5, 0));
		Vbox2.setMargin(passwordPF, new Insets(5, 0, 5, 0));
		Vbox2.setMargin(confirmPF, new Insets(5, 0, 5, 0));
		
	}
	private double progress = 20;
	
	public void goHome(Stage primaryStage) throws Exception {
		Scene hscene;
		VBox vBox1, vBox2;
		HBox hBox1, hBox2, hBox3, hBox4, hBox5, hBox6;
		Label homeLbl, favoriteLbl, myAudioLbl, insertAudioLbl;
		Image home, fav, audio, insert;
		ImageView homeView, favView, audioView, insertView;
		
		vBox1 = new VBox();
		vBox2 = new VBox();
		hBox1 = new HBox();
		hBox2 = new HBox();
		
		hBox3 = new HBox();
		hBox4 = new HBox();
		hBox5 = new HBox();
		hBox6 = new HBox();
		
		homeLbl = new Label("Home");
		homeLbl.setTextFill(Color.WHITE);
		homeLbl.setFont(Font.font(20));
		favoriteLbl = new Label("Favorite");
		favoriteLbl.setTextFill(Color.WHITE);
		favoriteLbl.setFont(Font.font(20));
		myAudioLbl = new Label("My Audio");
		myAudioLbl.setTextFill(Color.WHITE);
		myAudioLbl.setFont(Font.font(20));
		insertAudioLbl = new Label("Insert Audio");
		insertAudioLbl.setTextFill(Color.WHITE);
		insertAudioLbl.setFont(Font.font(20));
		
		vBox1.getChildren().add(hBox1);
		hBox1.getChildren().add(vBox2);
		
		hBox2.getChildren().addAll(spoImageView, titleLbl);
		
		
//		hBox3.getChildren().addAll();
		home = new Image("assets/home.png");
		homeView = new ImageView(home);
		homeView.setPreserveRatio(true);
		homeView.setFitWidth(25);
		
		fav = new Image("assets/sidebar-love.png");
		favView = new ImageView(fav);
		favView.setPreserveRatio(true);
		favView.setFitWidth(25);
		
		audio = new Image("assets/my-audio.png");
		audioView = new ImageView(audio);
		audioView.setPreserveRatio(true);
		audioView.setFitWidth(25);
		
		insert = new Image("assets/insert-audio.png");
		insertView = new ImageView(insert);
		insertView.setPreserveRatio(true);
		insertView.setFitWidth(25);
		
		hBox3.getChildren().addAll(homeView, homeLbl);
		hBox4.getChildren().addAll(favView, favoriteLbl);
		hBox5.getChildren().addAll(audioView, myAudioLbl);
		
		Slider slider = new Slider(0, 100, 50);
		
		ProgressBar pBar = new ProgressBar(slider.getValue() / 100);
		pBar.setMaxWidth(Double.MAX_VALUE);
		
		
		slider.valueProperty().addListener((obs, oldVal, newVal) -> {
			pBar.setProgress((double)obs.getValue()/ 100);
			progress = (double)obs.getValue();
			System.out.println(obs.getValue());
			System.out.println(pBar.getProgress());
		});
		
		vBox2.getChildren().addAll(hBox2, hBox3, hBox4, hBox5, slider);
		

		vBox2.setStyle("-fx-background-color:black");
		hBox2.setPadding(new Insets(25, 100, 25, 25));

		
		
		hscene = new Scene(vBox1, 700, 550);
		primaryStage.setScene(hscene);
	}
	
	
	public void goLogin(Stage primaryStage) throws Exception {
		lborderContainer = new BorderPane();
		lgridContainer = new GridPane();
		lflowContainer = new FlowPane();
		lHbox = new HBox();
		lHbox2 = new HBox();
		lHbox3 = new HBox();
		lVbox2 = new VBox();
		lregistDiv = new VBox();
		
		ltitleLbl = new Label("SporRGify");
		
		lemailTF = new TextField();
		lemailTF.setPromptText("Email");
		lpasswordPF = new PasswordField();
		lpasswordPF.setPromptText("Password");
		lregisButton = new Button("Register");
		
		lalreadyLbl = new Label("New to SpoRGify? Register");
		lhereLbl = new Label("Here");
		
		lscene = new Scene(lborderContainer, 700, 550);
		
		limage = new Image("assets/background-img.gif");
		limageView = new ImageView(limage);
		lbgSize = new BackgroundSize(1, 1.2, true, true, false, false);
		lbgImg = new BackgroundImage(limage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, lbgSize);
		lbg = new Background(lbgImg);
		
		lspoImage = new Image("assets/logo.png");
		lspoImageView = new ImageView(lspoImage);
		
		
		limage = new Image("assets/background-img.gif");
		limageView = new ImageView(limage);
		lemailTF.setMaxWidth(400);
		lemailTF.setPrefHeight(30);
		lpasswordPF.setMaxWidth(400);
		lpasswordPF.setPrefHeight(30);
		
		lspoImageView.setPreserveRatio(true);
		lspoImageView.setFitWidth(50);
		
		lregistDiv.setAlignment(Pos.CENTER);
		lHbox.setAlignment(Pos.CENTER);
		lHbox2.setAlignment(Pos.CENTER);
		lVbox2.setAlignment(Pos.CENTER);
		lflowContainer.setAlignment(Pos.CENTER);
		lHbox3.setAlignment(Pos.CENTER);
		
		ltitleLbl.setTextFill(Color.WHITE);
		lalreadyLbl.setTextFill(Color.WHITE);
		ltitleLbl.setFont(Font.font(24));
		lhereLbl.setTextFill(Color.BLUE);
		lborderContainer.setBackground(lbg);
		lborderContainer.setCenter(lHbox);
		
		lHbox.getChildren().add(lregistDiv);
		lflowContainer.getChildren().add(lalreadyLbl);
		lflowContainer.getChildren().add(lhereLbl);
		
		lHbox3.getChildren().addAll(lspoImageView, ltitleLbl);
		
		lregistDiv.getChildren().addAll(lHbox2);
		lHbox2.getChildren().add(lVbox2);
		lVbox2.getChildren().addAll(lHbox3, lemailTF, lpasswordPF, lregisButton, lflowContainer);
		
		lVbox2.setStyle("-fx-background-color:black");
		lVbox2.setPadding(new Insets(25, 100, 25, 100));
		lVbox2.setMargin(lemailTF, new Insets(5, 0, 5, 0));
		lVbox2.setMargin(lpasswordPF, new Insets(5, 0, 5, 0));

		primaryStage.setScene(lscene);
		
		Alert alert = new Alert(Alert.AlertType.WARNING);
		lregisButton.setOnAction(e -> {
			if(lemailTF.getText().isEmpty()) {
				alert.setContentText("You must fill email");
				alert.show();
			}else if(lpasswordPF.getText().isEmpty()) {
				alert.setContentText("You must fill password");
				alert.show();
			}else {
				try {
					goHome(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("test");
		initializeRegister();
		addComponentRegister();
		arrangeComponentRegister();
		primaryStage.setTitle("SpoRGify");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
		Alert alert = new Alert(Alert.AlertType.WARNING);
		regisButton.setOnAction(e -> {
			if(usernameTF.getText().isEmpty()) {
				alert.setContentText("You must fill username");
				alert.show();
			}else if(emailTF.getText().isEmpty()) {
				alert.setContentText("You must fill email");
				alert.show();
			}else if(passwordPF.getText().isEmpty()) {
				alert.setContentText("You must fill password");
				alert.show();
			}else if(confirmPF.getText().isEmpty()) {
				alert.setContentText("You must fill confirmed password");
				alert.show();
			}else {
				try {
					goLogin(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

}
