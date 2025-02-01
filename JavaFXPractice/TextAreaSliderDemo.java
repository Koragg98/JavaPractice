package javafxpractice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author iraki
 */
public class TextAreaSliderDemo extends Application {

    public void start(Stage stage)
    {
        TextArea ta=new TextArea();
        ta.setPrefRowCount(20);
        ta.setPrefColumnCount(100);
        
        Slider sl=new Slider(10,50,10);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);
        sl.setShowTickLabels(true);
        
        //sl.setOnMouseDragged(e -> ta.setFont(Font.font(sl.getValue())));
        sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));
        
        VBox vb=new VBox(ta,sl);
        Scene s=new Scene(vb,400,400);
        stage.setScene(s);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
