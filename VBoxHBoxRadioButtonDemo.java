package javafxpractice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;

/**
 * @author iraki
 */
public class VBoxHBoxRadioButtonDemo extends Application implements EventHandler<ActionEvent>{

    Text t;
    CheckBox c1,c2,c3;
    RadioButton r1,r2,r3;
    ChoiceBox<Integer> cb;
    
    public void start(Stage stage)
    {
        //create objects
        t=new Text("Hello World");
        
        r1=new RadioButton("Red");
        r2=new RadioButton("Green");
        r3=new RadioButton("Blue");
        
        ToggleGroup tg=new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        
        c1=new CheckBox("Normal");
        c2=new CheckBox("Bold");
        c3=new CheckBox("Italic");
        
        cb=new ChoiceBox<>();
        cb.getItems().addAll(10,20,30,50);
        cb.setValue(20);
        
        HBox hb1=new HBox();
        hb1.getChildren().addAll(r1,r2,r3);
        hb1.setSpacing(15);
        hb1.setPadding(new Insets(10,10,10,10));
        
        //constructor: (spacing),(spacing, Node...child)
        HBox hb2=new HBox(15,c1,c2,c3);
        hb2.setPadding(new Insets(10,10,10,10));
        
        VBox vb=new VBox(15);
        vb.getChildren().addAll(t,hb1,hb2,cb);
        vb.setPadding(new Insets(10,10,10,10));
        vb.setAlignment(Pos.TOP_CENTER);
        
        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        cb.setOnAction(this);
        
        Scene s=new Scene(vb,400,400);
        stage.setScene(s);
        stage.show();
    }
    public void handle(ActionEvent e)
    {
        if(r1.isSelected()) t.setFill(Paint.valueOf("RED"));
        if(r2.isSelected()) t.setFill(Paint.valueOf("GREEN"));
        if(r3.isSelected()) t.setFill(Paint.valueOf("BLUE"));
        
        FontWeight fw=FontWeight.NORMAL;
        FontPosture fp=FontPosture.REGULAR;
        
        if(c2.isSelected()) fw=FontWeight.BOLD;
        if(c3.isSelected()) fp=FontPosture.ITALIC;
        
        t.setFont(Font.font("Times New Roman",fw,fp,cb.getValue()));
    }
    public static void main(String[] args) {
        launch(args);
    }
}
