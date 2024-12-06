package swingpractice;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 * @author iraki
 */
class MyBorder extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;
    
    public MyBorder()
    {
        super("Border Demo");
        
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("Ok");
        
        JPanel p=new JPanel();
        
        p.add(l);
        p.add(tf);
        p.add(b);
        
        add(p);
        //p.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        Border br=BorderFactory.createLineBorder(Color.red, 2);
        p.setBorder(BorderFactory.createTitledBorder(br, "Login", TitledBorder.CENTER, TitledBorder.CENTER,new Font("Calibiri",Font.PLAIN,15)));
        setLayout(new FlowLayout());
    }
}
public class BorderDemo {

    public static void main(String[] args) {
        MyBorder f=new MyBorder();
        f.setSize(400,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
