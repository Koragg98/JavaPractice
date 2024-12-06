package swingpractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyCheckBox extends JFrame implements ActionListener
{
    JTextField tf;
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    
    public MyCheckBox()
    {
        super("Demo");
        
        tf=new JTextField("Demo Text",20);
        c1=new JCheckBox("Bold");
        c2=new JCheckBox("Italic");
        c1.setMnemonic(KeyEvent.VK_B);
        c2.setMnemonic(KeyEvent.VK_I);
        
        r1=new JRadioButton("Lower");
        r2=new JRadioButton("Upper");
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        r2.setActionCommand("UPPER");
        
        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "Lower"-> tf.setText(tf.getText().toLowerCase());
            case "UPPER"-> tf.setText(tf.getText().toUpperCase());
        }
        int b=0,i=0;
        if(e.getSource()==c1) b=Font.BOLD;
        if(c2.isSelected()) i=Font.ITALIC;
        
        Font f=new Font("Times New Roman",b|i,15);  //Pipe "|" => For combining two effects
        tf.setFont(f);
    }
}
public class CheckboxRadioButtonDemo {

    public static void main(String[] args) {
        MyCheckBox f=new MyCheckBox();
        f.setSize(350,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
