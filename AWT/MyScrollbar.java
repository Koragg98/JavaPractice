package awtpractice;

import java.awt.*;
import java.awt.event.*;

/**
 * @author iraki
 */
class MyScrollbar extends Frame implements AdjustmentListener
{
    Scrollbar r,g,b;
    TextField tf;
    
    public MyScrollbar()
    {
        super("Scrollbar Demo");
        r=new Scrollbar(Scrollbar.HORIZONTAL,200,10,0,255);
        g=new Scrollbar(Scrollbar.HORIZONTAL,10,10,0,255);
        b=new Scrollbar(Scrollbar.HORIZONTAL,190,10,0,255);
        
        tf=new TextField(20);
        tf.setBackground(new Color(r.getValue(),g.getValue(),b.getValue()));
        
        add(tf);
        add(r);
        add(g);
        add(b);
        
        tf.setBounds(100, 100, 300, 30);
        r.setBounds(150, 230, 200, 20);
        g.setBounds(150, 300, 200, 20);
        b.setBounds(150, 370, 200, 20);
        
        setLayout(null);
        
        r.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e)
    {
        
        tf.setBackground(new Color(r.getValue(),g.getValue(),b.getValue()));
    }
}
public class ScrollbarDemo {

    public static void main(String[] args) {
        MyScrollbar f=new MyScrollbar();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
