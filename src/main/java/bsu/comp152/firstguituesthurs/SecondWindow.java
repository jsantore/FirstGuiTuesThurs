package bsu.comp152.firstguituesthurs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindow {
    @FXML
    private Label helloLabel;

    @FXML
    protected void HelloClicked(){
        helloLabel.setText("We set it up ourselves this time");
    }
}
