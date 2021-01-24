package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private TextArea textArea2;
    @FXML
    private TextArea textArea;

    @FXML
    private void closeMethod(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void sendMessage(ActionEvent actionEvent) {
        textArea.appendText(textArea2.getText() + "\n");
        textArea2.clear();
        textArea2.requestFocus();
    }
}
