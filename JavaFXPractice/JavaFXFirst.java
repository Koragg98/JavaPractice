package javafxpractice;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * @author iraki
 */
public class JavaFXFirst extends Application
{
    @Override
    public void start(Stage stage) {
        
        //Child control
        Button b=new Button("Click me");
        //Parent layout container
        FlowPane fp=new FlowPane();
        fp.getChildren().add(b);
        //Scene with scene graph i.e., list of controls
        Scene sc=new Scene(fp);
        //scene is set to stage and shown
        stage.setScene(sc);
        stage.setTitle("My First FX App");
        stage.show();
    }
    public static void main(String[] args) {
        //belongs to apllication class which launch the stage
        launch(args);
    }

}
