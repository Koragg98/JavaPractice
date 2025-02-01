package javafxpractice;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * @author iraki
 */
public class FileChooserColorPickerDatePickerDemo extends Application{
    
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
        
        DatePicker dp=new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setValue(LocalDate.now());
        
        ColorPicker cp=new ColorPicker(Color.BLACK);
        
        Button b=new Button("File");
        
        dp.setOnAction(e ->{String oldText=ta.getText();
                       String newText=oldText.replaceFirst("Date:.*\\n?", "");
                       ta.setText("Date: "+dp.getValue()+"\n"+newText);});
        cp.setOnAction(e -> ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8)));
        b.setOnAction(e -> 
                        {
                            FileChooser fc=new FileChooser();
                            fc.setInitialDirectory(new File("."));
                            File f=fc.showOpenDialog(stage);
                            try
                            {
//                                Scanner sc=new Scanner(new FileInputStream(f));
//                                String str="";
//                                while(sc.hasNext())
//                                    str=str+sc.nextLine()+"\n";
//                                ta.setText(str);
                                FileInputStream fis=new FileInputStream(f);
                                byte fileContent[]=fis.readAllBytes();
                                ta.setText(new String(fileContent));
                            }
                            catch(Exception excep){System.out.println("Invalid File: "+excep);}
                        }
                     );
        VBox vb=new VBox(10);
        vb.getChildren().addAll(ta,sl,dp,cp,b);
        vb.setAlignment(Pos.TOP_CENTER);
        Scene s=new Scene(vb,600,600);
        stage.setScene(s);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
