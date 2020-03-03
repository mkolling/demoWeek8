import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * A Calculator GUI in JavaFX!
 *
 * @author mik
 */
public class CalcGUI extends Application
{
    private CalcEngine calc = new CalcEngine();

    @FXML
    private TextField display;
    
    @FXML
    private void numberClick(ActionEvent event)
    {
        Button button = (Button) event.getSource();
        display.setText(display.getText() + button.getText());
    }
    
    @FXML
    private void clear(ActionEvent event)
    {
        display.setText("0");
    }
    
    @Override
    public void start(Stage stage) throws Exception
    {
        URL url = getClass().getResource("calc.fxml");
        Pane root = FXMLLoader.load(url);
        
        Scene scene = new Scene (root);
        
        stage.setTitle("JavaFX PPA Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
