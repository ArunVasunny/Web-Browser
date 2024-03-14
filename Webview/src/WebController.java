import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class WebController implements Initializable{
    
    @FXML 
    public WebView myWebView;

    @FXML 
    public TextField textField;

    @FXML
    public WebEngine webEngine;
    public WebHistory history;
    public double webZoom,currentZoom;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        webEngine = myWebView.getEngine();
        history = webEngine.getHistory();
        // loadPage();
    }

    public void loadPage()
    {
        String url = ("https://www."+textField.getText()+".com");
        System.out.println(url);
        webEngine.load(url);
    }

    public void refreshPage()
    {
        webEngine.reload();
    }

    public void zoomIn()
    {
        currentZoom = myWebView.getZoom();
        webZoom = currentZoom + 0.1;
        myWebView.setZoom(webZoom);
    }

    public void zoomOut()
    {
        currentZoom = myWebView.getZoom();
        webZoom = currentZoom - 0.1;
        myWebView.setZoom(webZoom);
    }

    public void displayHistory()
    {
        history = webEngine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        for (WebHistory.Entry entry : entries) {
            System.out.println(entry.getUrl()+" "+entry.getLastVisitedDate());
        }
    }

    public void back()
    {
        history = webEngine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        int currentIndex = history.getCurrentIndex();

        if (currentIndex > 0) {
            history.go(-1);
        } else {
            System.out.println("No previous page in history.");
        }
        

    }

    public void next()
    {
        history = webEngine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        int currentIndex = history.getCurrentIndex();

        if (currentIndex < entries.size() - 1) {
            history.go(1);
        } else {
            System.out.println("No next page in history.");
        }
    }
    

    //Textfield Gets executed when enter pressed
    public void onEnter(ActionEvent event){
        loadPage();
    }

    

}
