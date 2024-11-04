package awtpractice;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * @author iraki
 */
class MyKeyEvent extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    public MyKeyEvent()
    {
        super("My Key Event Demo");
        
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        
        l1.setBounds(10, 20, 200, 30);
        l2.setBounds(10, 60, 200, 30);
        l3.setBounds(10, 100, 200, 30);
        l4.setBounds(10, 140, 200, 30);
        
        setLayout(null);
        
        //Keylistener added to frame
        addKeyListener(this);
               
        add(l1);
        add(l2);
        add(l3);
        add(l4);
    }
        
    @Override        
    public void keyPressed(KeyEvent e)
    {
        l1.setText("'"+e.getKeyChar()+"'"+" Key is pressed");
        l2.setText("");
    }
    @Override        
    public void keyTyped(KeyEvent e)
    {
        l2.setText("'"+e.getKeyChar()+"'"+" Key is long pressed");
        l4.setText(new Date(e.getWhen())+"");
        l3.setText("");
    }
    @Override        
    public void keyReleased(KeyEvent e)
    {
        l3.setText("'"+e.getKeyChar()+"'"+" Key is released");
        l1.setText("");
        l2.setText("");
        l4.setText("");
    }
}
public class KeyEventDemo {

    public static void main(String[] args) {
        MyKeyEvent f=new MyKeyEvent();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
