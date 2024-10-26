package awtpractice;
import java.awt.*;
import java.awt.event.*;

/**
 * @author iraki
 */
//Whenever button is pressed an ActionEvent is generated,which must be handled by ActionListener
class MyButton extends Frame implements ActionListener
{
    private int cnt=0;
    Button b;
    Label l;
    
    public MyButton()
    {
        super("Counter");
        b=new Button("Click");
        l=new Label("   "+cnt);
        
        //We have to register to the button to listener
        b.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //This is call back method to the event, actual logic here
        cnt++;
        l.setText("   "+cnt);
    }
}
public class ButtonDemo {

    public static void main(String[] args) {
        MyButton f=new MyButton();
        f.setSize(400,400);
        f.setVisible(true);
    }

}
