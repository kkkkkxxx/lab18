package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    static int countMessages;
    @FXML
    private TextArea areaMessage;

    @FXML
    private TextField textMessage;

    @FXML
    private Button buttonSend;

    @FXML
    private void clickSend(ActionEvent eventOne){
        countMessages++;
        String m = textMessage.getText();
        areaMessage.appendText("Your message: " + m + "\n");
        textMessage.setText("");
        System.out.println(countMessages);
    }
}
