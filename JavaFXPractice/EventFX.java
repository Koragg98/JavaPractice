package javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 * @author iraki
 */
//public class EventFX extends Application implements EventHandler<ActionEvent>{
public class EventFX extends Application {

    Button b;
    int cnt=0;
    @Override
    public void start(Stage stage)
    {
        b=new Button("Count");
        b.setPrefSize(60, 40);
        
//        b.setOnAction(new EventHandler<ActionEvent>()
//                {
//                    @Override
//                    public void handle(ActionEvent e)
//                    {
//                        cnt++;
//                        b.setText(String.valueOf(cnt));
//                    }
//                }
//        );
        b.setOnAction(e ->{cnt++;b.setText(String.valueOf(cnt));});
        
        FlowPane fp=new FlowPane(b);
        Scene s=new Scene(fp,400,400);
        stage.setScene(s);
        stage.show();
    }
//    @Override
//    public void handle(ActionEvent e)
//    {
//        cnt++;
//        b.setText(String.valueOf(cnt));
//    }
    public static void main(String[] args) {
        launch(args);
    }

}
