package awtpractice;
import java.awt.*;
/**
 * @author iraki
 */
class MyBorderLayout extends Frame
{
    Button b1,b2,b3,b4,b5,b6;
    
    public MyBorderLayout()
    {
        super("Border Layout Demo");
        
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");
        
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.CENTER);
        //add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.SOUTH);
        //add(b6);
        
        Panel p=new Panel();
        p.setLayout(new GridLayout(3,1));
        
        p.add(new Button("Save"));
        p.add(new Button("Reset"));
        p.add(new Button("Exit"));
        
        add(p,BorderLayout.EAST);
    }
}
public class BorderLayoutDemo {

    public static void main(String[] args) {
        MyBorderLayout f=new MyBorderLayout();
        f.setSize(500,500);
        f.setVisible(true);
    }

}
