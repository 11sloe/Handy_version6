import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.application.Platform;

public class Controller {
    private Binaerbaum baum;

    
    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtFeld;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    public Controller()
    {
        baum = new Binaerbaum();
        Datei d = new Datei();
        d.dateiLaden("woerter.txt", baum);
        baum.alleElementeAusgeben();
    }

    @FXML
    void button1Handler(ActionEvent event) {
        txtArea.appendText(button1.getText()+" ");
        txtFeld.clear();

    }

    @FXML
    void button2Handler(ActionEvent event) {
        txtArea.appendText(button2.getText()+" ");
        txtFeld.clear();

    }

    @FXML
    void button3Handler(ActionEvent event) {
        txtArea.appendText(button3.getText()+" ");
        txtFeld.clear();

    }

    //
    @FXML
    void txtFieldHandler(KeyEvent event) {
        if (event.getCode() == KeyCode.SPACE)
        {
            Platform.runLater(() -> { 
                    txtArea.appendText(txtFeld.getText());
                    txtFeld.clear();
                });    
        }
        else if (event.getCode() == KeyCode.ENTER)
        {
            Platform.runLater(() -> { 
                    txtArea.appendText(txtFeld.getText() + "\n");
                    txtFeld.clear();
                });   
        }
        else
        {
            Platform.runLater(() -> { 
                    String text = txtFeld.getText();
                    button1.setText(text);

                    String vorschlag = suchen(text);
                    button2.setText(vorschlag);

                }); 
        }

    }

    public String suchen(String text)
    {
        Vorschlag v = baum.suchen(new Vorschlag(text));
        if(v != null)
        {
            return v.getWort();
        }
        else
        {
            return null;
        }
    }

}