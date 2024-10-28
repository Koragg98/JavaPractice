package awtpractice;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class TextApp extends Frame
{
    TextArea ta;
    TextField tf;
    Button b;
    Label l1,l2;
    
    public TextApp()
    {
        super("My Text App");
        ta=new TextArea(20,50);
        tf=new TextField(20);
        b=new Button("Click");
        l1=new Label("No text entered yet");
        l2=new Label("Enter key is not entered yet");
        
        setLayout(new FlowLayout());
        Handler h=new Handler();
        
        //tf.setEchoChar('*');
        //tf.addTextListener(h);
        //tf.addActionListener(h);
        ta.addTextListener(h);
        b.addActionListener(h);
        
        add(ta);
        add(l1);
        add(tf);
        //add(l2);
        add(b);
    }
    class Handler implements ActionListener,TextListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //ta.append(tf.getText());
            ta.insert(tf.getText(), ta.getCaretPosition());
        }
        @Override
        public void textValueChanged(TextEvent e)
        {
            l1.setText(ta.getText());
        }
    }
}
public class TextDemo {

    public static void main(String[] args) {
        TextApp f=new TextApp();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
