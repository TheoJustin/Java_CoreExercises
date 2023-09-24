import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class Factory {

	public Button makeButton(String buttonName) {
		Button btn = new Button(buttonName);
		btn.setTextFill(Color.BLUE);
		
		return btn;
	}
	

}
