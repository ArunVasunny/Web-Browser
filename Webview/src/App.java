import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

    Image img = new Image(getClass().getResourceAsStream("/Images/icon.png"));

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("webview.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("NetPulse Browser");
        stage.getIcons().add(img);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false); 

    }
}
