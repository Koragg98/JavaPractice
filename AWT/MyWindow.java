package awtpractice;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyWindow extends Frame implements WindowListener
{
    Label l;
    
    public MyWindow()
    {
        l=new Label();
        l.setBounds(20, 30, 200, 30);
        
        add(l);
        addWindowListener(this);
    }
    public void windowOpened(WindowEvent e)
    {
        l.setText("Window Opened");
    }
    public void windowClosed(WindowEvent e)
    {
        l.setText("Window Closed");
    }
    public void windowClosing(WindowEvent e)
    {
        l.setText("Window Closing");
        System.exit(0);
    }
    public void windowIconified(WindowEvent e)
    {
        l.setText("Window Iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        l.setText("Window Deiconified");
    }
    public void windowActivated(WindowEvent e)
    {
        l.setText("Window Activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        l.setText("Window Deactivated");
    }
}
public class WindowEventDemo {

    public static void main(String[] args) {
        MyWindow f=new MyWindow();
        f.setSize(500,500);
        f.setVisible(true);
    }

}
