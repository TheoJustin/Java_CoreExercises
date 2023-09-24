import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	public void play(Stage primaryStage) throws Exception {
		
	}
	
	
	public void home(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Image image = new Image("/res/assets/EmeraldTitleBg.png");
		ImageView imageView = new ImageView(image);
		BackgroundSize bgSize = new BackgroundSize(1, 1.2, true, true, false, false);
		BackgroundImage bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		Background bg = new Background(bgImg);
		
		Image imageTitle = new Image("/res/assets/pokemAXEmerald.png");
		ImageView imageTitleView = new ImageView(imageTitle);
		imageTitleView.setFitHeight(75);
		imageTitleView.setPreserveRatio(true);
		
		
		Label enter = new Label("Press Enter");
		enter.setId("pressCapt");
		enter.setFont(Font.loadFont(getClass().getResource("/res/fonts/PKMN_RBYGSC.ttf").toExternalForm(), 20));
		
		HBox hBox = new HBox(enter);
		hBox.setId("pressContain");
		hBox.setAlignment(Pos.CENTER);
		hBox.setMaxWidth(200);
		hBox.setMinHeight(75);
		

		Button next = new Button();

		next.setStyle("-fx-background-color : none;");
		
		next.setOnKeyPressed(e ->{
			if(e.getCode() == KeyCode.ENTER) {
				try {
					play(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		VBox vBox = new VBox(imageTitleView, hBox, next);
		vBox.setMargin(hBox, new Insets(150, 0, 0, 0));
		vBox.setBackground(bg);
	    vBox.setPadding(new Insets(10, 50, 50, 50));
	    vBox.setSpacing(50);
		vBox.setAlignment(Pos.TOP_CENTER);
		
		
		Scene scene = new Scene(vBox, 900, 600);
		scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		
		Media buzzer = new Media(getClass().getResource("/res/sounds/musics/petalburg_city.mp3").toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(buzzer);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.play();
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		
	}
	
	public void loading(Stage primaryStage) throws Exception {
		
		
		
		Rectangle rect = new Rectangle(0, 0, 50, 50);
		rect.setFill(Color.GREENYELLOW);
		
		RotateTransition rotateTrans = new RotateTransition(Duration.seconds(0.5), rect);
		rotateTrans.setByAngle(180);
		rotateTrans.setCycleCount(5);
		rotateTrans.setAutoReverse(true);
		rotateTrans.play();
		

		Image image = new Image("/res/assets/load_bg.jpg");
		ImageView imageView = new ImageView(image);
		BackgroundSize bgSize = new BackgroundSize(1, 1.2, true, true, false, false);
		BackgroundImage bgImg = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, bgSize);
		Background bg = new Background(bgImg);
		
		ProgressBar progressBar = new ProgressBar();
		progressBar.setPrefWidth(300);
		
		
		VBox vBox = new VBox(rect, progressBar);
		vBox.setBackground(bg);
	    vBox.setPadding(new Insets(10, 50, 50, 50));
	    vBox.setSpacing(50);
		vBox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vBox, 900, 600);
		
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		rotateTrans.setOnFinished(e->{
			try {
				home(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	}
	
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		loading(primaryStage);
	}

}
