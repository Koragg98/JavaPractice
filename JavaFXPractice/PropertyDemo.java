package javafxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;

/**
 * @author iraki
 */
public class PropertyDemo extends Application{

    @Override
    public void start(Stage stage)
    {
        Button b=new Button("Click _me");
        
        b.setBackground(Background.fill(Color.BLUE));
        b.setTextFill(Color.WHITE);
        b.setMnemonicParsing(true);
        
        Tooltip tp=new Tooltip("click to save");
        b.setTooltip(tp);
        
        b.setStyle("-fx-background-color:red;-fx-border-color:blue;");
        
        Alert a=new Alert(AlertType.INFORMATION,"Button is clicked");
        b.setOnAction(e -> a.show());
        
        FlowPane fp=new FlowPane(b);
        Scene s=new Scene(fp,400,400);
        
        stage.setScene(s);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
