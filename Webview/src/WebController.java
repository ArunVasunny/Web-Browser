import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebController implements Initializable{
    @FXML 
    WebView myWebView;

    @FXML 
    TextField textField;

    @FXML
    WebEngine webEngine;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


    }

    

}
