package javafxpractice;


import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * @author iraki
 */
public class PaneDemo extends Application {

    public void start(Stage stage) throws Exception
    {
        ImageView iv1=null;
        ImageView iv2=null;
        ImageView iv3=null;
        iv1=new ImageView(new Image(new FileInputStream("C:\\Users\\iraki\\OneDrive\\Documents\\Desktop\\iv1.jpg")));
        iv2=new ImageView(new Image(new FileInputStream("C:\\Users\\iraki\\OneDrive\\Documents\\Desktop\\iv2.jpg")));
        iv3=new ImageView(new Image(new FileInputStream("C:\\Users\\iraki\\OneDrive\\Documents\\Desktop\\iv3.jpg")));
        
        ScrollPane sp1=new ScrollPane(iv1);
        ScrollPane sp2=new ScrollPane(iv2);
        ScrollPane sp3=new ScrollPane(iv3);
        
//        Tab t1=new Tab("Ifle Tower",sp1);
//        Tab t2=new Tab("Qutub Minar",sp2);
//        Tab t3=new Tab("India Gate",sp3);
//        
//        TabPane root=new TabPane();
//        root.getTabs().addAll(t1,t2,t3);

        TitledPane t1=new TitledPane("Ifle Tower",sp1);
        TitledPane t2=new TitledPane("Qutub Minar",sp2);
        TitledPane t3=new TitledPane("India Gate",sp3);
        
        Accordion root=new Accordion();
        root.getPanes().addAll(t1,t2,t3);

//        SplitPane root=new SplitPane(sp1,sp2,sp3);
//        root.setDividerPositions(0.33,0.66);
        
//        Button b1=new Button("One");
//        Button b2=new Button("Two");
//        Button b3=new Button("Three");
//        Button b4=new Button("Four");
//        Button b5=new Button("Five");
//        
//        GridPane root=new GridPane();
//        root.add(b1, 0, 0);
//        root.add(b2, 1, 0);
//        root.addRow(1, b3,b4);
//        root.add(b5, 7, 7);
        
        //Border Pane
//        root.setTop(b1);
//        root.setLeft(b2);
//        root.setCenter(b3);
//        root.setRight(b4);
//        root.setBottom(b5);
        
        //FlowPane and Tile Pane
//        root.setHgap(10);
//        root.setVgap(10);
        //root.getChildren().addAll(b1,b2,b3,b4,b5);
        
        Scene sc=new Scene(root,400,400);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
