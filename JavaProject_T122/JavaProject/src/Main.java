import java.sql.SQLException;
import java.util.Vector;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{
	
	public Connect connect = Connect.getInstance();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void playGame(Stage stage) {
		Label nameLabel = new Label("Hello");
		
		StackPane stackPane1 = new StackPane();
		StackPane stackPane2 = new StackPane();
		
		
		Image img = new Image("/assets/sprite/player/player_idle.png");
		ImageView imgView = new ImageView(img);
		
		SpriteAnimation imgAnim = new SpriteAnimation(imgView, Duration.seconds(1), 4, 4, 0, 0, 60, 60);
		imgAnim.setCycleCount(Integer.MAX_VALUE);
		imgAnim.playFromStart();
		
		Image img2 = new Image("/assets/sprite/player/player_idle.png");
		ImageView imgView2 = new ImageView(img2);
		
		SpriteAnimation imgAnim2 = new SpriteAnimation(imgView2, Duration.seconds(1), 4, 4, 240, 0, 60, 60);
		imgAnim2.setCycleCount(Integer.MAX_VALUE);
		imgAnim2.playFromStart();
		
		
		VBox vBoxMenu = new VBox(nameLabel, imgView, imgView2);
		vBoxMenu.setAlignment(Pos.CENTER);
		
//	    vBoxMenu.setMargin(mediaView, new Insets(20, 20,20 , 20));
		
		Scene scene = new Scene(vBoxMenu, 1000, 500);
		stage.setScene(scene);
	}
	
	public void playVideo(Stage stage) {
		Media buzzer = new Media(getClass().getResource("/assets/video/intro_cut.mp4").toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
		MediaView mediaView = new MediaView(mediaPlayer);
		mediaView.setFitWidth(800);
		mediaPlayer.play();
		
		VBox vBoxMenu = new VBox(mediaView);
		vBoxMenu.setAlignment(Pos.CENTER);
		
	    vBoxMenu.setMargin(mediaView, new Insets(20, 20,20 , 20));
		
		Scene scene = new Scene(vBoxMenu, 1000, 500);
		stage.setScene(scene);
		
//		Image img = new Image("/assets/player_idle.png");
//		ImageView imgView = new ImageView(img);
//		
//		SpriteAnimation imgAnim = new SpriteAnimation(imgView, Duration.seconds(1), 4, 4, 0, 0, 60, 60);
//		imgAnim.setCycleCount(Integer.MAX_VALUE);
//		imgAnim.playFromStart();
		scene.setOnMouseClicked(e ->{
			playGame(stage);
		});
		
		mediaPlayer.setOnEndOfMedia(() -> {
			playGame(stage);
		});
		
	}
	
	public void options(Stage stage) {
		Label label = new Label("Options");
		label.setId("pressCapt");
		label.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		label.setTextFill(Color.WHITE);
		label.setAlignment(Pos.CENTER);
		
		Image image = new Image("/assets/sprite/frame.png");
		BackgroundSize bgSize = new BackgroundSize(1, 1, true, true, false, false);
		BackgroundImage bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		Background bg = new Background(bgImg);
		
		Button btnBack = new Button("Back");
		btnBack.setId("pressCapt");
		btnBack.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnBack.setStyle("-fx-background-color:transparent");
		btnBack.setTextFill(Color.WHITE);
		btnBack.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
		btnBack.setOnAction(e ->{
			try {
				start(stage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		Label music = new Label("Music");
		music.setId("pressCapt");
		music.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		music.setStyle("-fx-background-color:transparent");
		music.setTextFill(Color.WHITE);
		
		Label soundFx = new Label("Sound FX");
		soundFx.setId("pressCapt");
		soundFx.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		soundFx.setStyle("-fx-background-color:transparent");
		soundFx.setTextFill(Color.WHITE);
		
		Label showTimer = new Label("Show Timer");
		showTimer.setId("pressCapt");
		showTimer.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		showTimer.setStyle("-fx-background-color:transparent");
		showTimer.setTextFill(Color.WHITE);
		
		Slider slider1 = new Slider();
		Slider slider2 = new Slider();
		CheckBox cb = new CheckBox();
		
		HBox hbox1 = new HBox(music, slider1);
		HBox hbox2 = new HBox(soundFx, slider2);
		HBox hbox3 = new HBox(showTimer, cb);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vBoxMenu = new VBox(label, hbox1, hbox2, hbox3, btnBack);
		vBoxMenu.setBackground(bg);
		vBoxMenu.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vBoxMenu, 1000, 500);
		stage.setScene(scene);
	}
	
	public void highScore(Stage stage) {
		Label label = new Label("High Scores");
		label.setId("pressCapt");
		label.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		label.setTextFill(Color.WHITE);
		label.setAlignment(Pos.CENTER);
		GridPane gp = new GridPane();
		
		
		
		Image image = new Image("/assets/sprite/frame.png");
		BackgroundSize bgSize = new BackgroundSize(1, 1, true, true, false, false);
		BackgroundImage bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		Background bg = new Background(bgImg);
		
//		Label menu1 = new Label("Play");
//		menu1.setId("pressCapt");
//		menu1.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
//		menu1.setAlignment(Pos.CENTER);
		
		int idx = 0;
		for (User user2 : user) {
			Label txt = new Label(user2.getName());
			txt.setId("pressCapt");
			txt.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
			txt.setTextFill(Color.WHITE);
			txt.setAlignment(Pos.CENTER);
			gp.add(txt, 0, idx);
			
//			System.out.println(user2.getName());
			idx++;
		}
		
		gp.setAlignment(Pos.CENTER);
		
		Button btnBack = new Button("Back");
		btnBack.setId("pressCapt");
		btnBack.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnBack.setStyle("-fx-background-color:transparent");
		btnBack.setTextFill(Color.WHITE);
		btnBack.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
		btnBack.setOnAction(e ->{
			try {
				start(stage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		VBox vBoxMenu = new VBox(label, gp, btnBack);
		vBoxMenu.setBackground(bg);
		vBoxMenu.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vBoxMenu, 1000, 500);
		stage.setScene(scene);
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Image image = new Image("/assets/sprite/main_menu.png");
		BackgroundSize bgSize = new BackgroundSize(1, 1.2, true, true, false, false);
		BackgroundImage bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		Background bg = new Background(bgImg);
		
//		Image imageTitle = new Image("/res/assets/pokemAXEmerald.png");
//		ImageView imageTitleView = new ImageView(imageTitle);
//		imageTitleView.setFitHeight(75);
//		imageTitleView.setPreserveRatio(true);
		
		
		Label enter = new Label("Justice Courier");
		enter.setId("pressCapt");
		enter.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 40));

		
		Button btnmenu1 = new Button("Play");
		btnmenu1.setId("pressCapt");
		btnmenu1.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnmenu1.setStyle("-fx-background-color:transparent");
		btnmenu1.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
//		Label menu1 = new Label("Play");
//		menu1.setId("pressCapt");
//		menu1.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
//		menu1.setAlignment(Pos.CENTER);
		
		Button btnmenu2 = new Button("High Score");
		btnmenu2.setId("pressCapt");
		btnmenu2.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnmenu2.setStyle("-fx-background-color:transparent");
		btnmenu2.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
		Button btnmenu3 = new Button("Options");
		btnmenu3.setId("pressCapt");
		btnmenu3.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnmenu3.setStyle("-fx-background-color:transparent");
		btnmenu3.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
		Button btnmenu4 = new Button("Exit");
		btnmenu4.setId("pressCapt");
		btnmenu4.setFont(Font.loadFont(getClass().getResource("/assets/font/prstartk-webfont.ttf").toExternalForm(), 25));
		btnmenu4.setStyle("-fx-background-color:transparent");
		btnmenu4.setOnMouseEntered(e -> {
			Media buzzer = new Media(getClass().getResource("/assets/audio/sfx/menu_select_8.wav").toExternalForm());
			MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
//			mediaPlayer.setAutoPlay(true);
			mediaPlayer.play();
		});
		
		HBox hBox = new HBox(enter);
		hBox.setId("pressContain");
		hBox.setAlignment(Pos.CENTER);
//		hBox.setMaxWidth(200);
		hBox.setMinHeight(75);
		
		VBox vBoxMenu = new VBox(btnmenu1,btnmenu2,btnmenu3,btnmenu4);
		vBoxMenu.setAlignment(Pos.CENTER);
		

		Button next = new Button();

		next.setStyle("-fx-background-color : none;");
		
		btnmenu1.setOnAction(e ->{
			playVideo(primaryStage);
		});
		
		btnmenu2.setOnAction(e ->{
			highScore(primaryStage);
		});

		btnmenu3.setOnAction(e ->{
			options(primaryStage);
		});
		
		VBox vBox = new VBox(hBox, vBoxMenu, next);
		vBox.setMargin(hBox, new Insets(150, 0, 0, 0));
		vBox.setBackground(bg);
	    vBox.setPadding(new Insets(10, 50, 50, 50));
	    vBox.setSpacing(50);
		vBox.setAlignment(Pos.TOP_CENTER);
		
		
		Scene scene = new Scene(vBox, 1000, 500);
		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		
		getData();
		for (User user2 : user) {
			System.out.println(user2.getName());
		}
		
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	Vector<User> user = new Vector<>();
	
	private void getData() {	
		user.removeAllElements();
		String query ="SELECT * FROM highscorerecord";
		connect.rs = connect.execQuery(query);
		try {
			while(connect.rs.next()) {
				String name = connect.rs.getString("name");
				Integer time = connect.rs.getInt("time_spent");
				user.add(new User(name, time));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
