package awtpractice;
import java.awt.*;
/**
 * @author iraki
 */
class MyFrame extends Frame
{
    Button b;
    Label l;
    TextField tf;
    public MyFrame()
    {
        super("My First App");
        b=new Button("Ok");
        l=new Label("Name");
        tf=new TextField(20);
        
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
    }
}
public class AppDev2 extends Frame {

    Button b;
    Label l;
    TextField tf;
    public AppDev2()
    {
        super("My First App");
        b=new Button("Ok");
        l=new Label("Name");
        tf=new TextField(20);
        
        setLayout(new FlowLayout());
        add(l);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        //MyFrame f=new MyFrame();
        AppDev2 f=new AppDev2();
        f.setSize(400,400);
        f.setVisible(true);
    }

}
