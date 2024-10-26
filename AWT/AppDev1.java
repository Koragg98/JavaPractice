package awtpractice;
import java.awt.*;
/**
 * @author iraki
 */
public class AppDev1 {

    public static void main(String[] args) {
        Frame f=new Frame("My First App");
        f.setLayout(new FlowLayout());
        
        Button b=new Button("ok");
        Label l=new Label("Name");
        TextField tf=new TextField(25);
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(300, 300);
        f.setVisible(true);
    }

}
