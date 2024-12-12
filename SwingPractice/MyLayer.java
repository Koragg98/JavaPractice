package swingpractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyLayer extends JFrame implements ItemListener
{
    JRadioButton r1,r2,r3;
    JLabel l1,l2,l3,l4;
    JLayeredPane lp;
    public MyLayer()
    {
        super("JLayeredPane Demo");
        
        r1=new JRadioButton("Red");
        r2=new JRadioButton("Green");
        r3=new JRadioButton("Blue",true);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);
        
        l1=new JLabel("Red");
        l1.setBounds(10, 10, 200, 200);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);
        
        l2=new JLabel("Green");
        l2.setBounds(50, 50, 250, 250);
        l2.setBackground(Color.GREEN);
        l2.setOpaque(true);
        
        l3=new JLabel("Blue");
        l3.setBounds(70, 70, 300, 300);
        l3.setBackground(Color.BLUE);
        l3.setOpaque(true);
        
        l4=new JLabel("Black");
        l4.setBounds(80, 80, 150, 150);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);
        
        JPanel jp=new JPanel();
        jp.add(r1);jp.add(r2);jp.add(r3);
        
        lp=new JLayeredPane();
        //We need to set layer and pass argument as Integer object
        lp.add(l1, Integer.valueOf(0));
        lp.add(l2, Integer.valueOf(1));
        lp.add(l3, Integer.valueOf(2));
        lp.add(l4, Integer.valueOf(3));
        
        add(jp,BorderLayout.NORTH);
        add(lp,BorderLayout.CENTER);
        
        addMouseMotionListener(new MouseAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                l4.setLocation(e.getX(), e.getY());
            }
        });
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(r1.isSelected())
        {
            lp.setLayer(l4, 1);
        }
        if(r2.isSelected())
        {
            lp.setLayer(l4, 2);
        }
        if(r3.isSelected())
        {
            lp.setLayer(l4, 3);
        }
    }
}
public class LayeredPaneDemo {

    public static void main(String[] args) {
        MyLayer f=new MyLayer();
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
