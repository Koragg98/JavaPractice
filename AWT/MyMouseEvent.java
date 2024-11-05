package awtpractice;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyMouseEvent extends Frame implements MouseListener,MouseMotionListener
{
    Label l1,l2;
    public MyMouseEvent()
    {
        super("My Mouse Event Demo");
        
        l1=new Label("");
        l2=new Label("");
        
        l1.setBounds(20, 30, 300, 20);
        l2.setBounds(20, 60, 300, 20);
        
        add(l1);
        add(l2);
        
        setLayout(null);
        
        super.addMouseListener(this);
        super.addMouseMotionListener(this);
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        l1.setText("Mouse Entered");
        l2.setText("("+e.getX()+", "+e.getY()+")");
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        l1.setText("Mouse Exited");
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        l1.setText("Mouse Clicked");
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        l1.setText("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        l1.setText("Mouse Released");
    }
    @Override
    public void mouseMoved(MouseEvent e)
    {
       l1.setText("Mouse Moved"); 
    }
    @Override
    public void mouseDragged(MouseEvent e)
    {
        l1.setText("Mouse Dragged");
    }
}
public class MouseEventDemo {

    public static void main(String[] args) {
        MyMouseEvent f=new MyMouseEvent();
        f.setSize(500, 500);
        f.setVisible(true);
    }

}
