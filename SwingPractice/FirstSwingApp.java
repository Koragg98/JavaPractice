package swingpractice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyFrame extends JFrame implements ActionListener{
    JButton b,c;
    JLabel l;
    int cnt=0;
    public MyFrame()
    {
        super("First Sing App");
        b=new JButton();
        l=new JLabel("Clicked "+cnt+" times");
        c=new JButton();
        setLayout(new FlowLayout());
        add(l);
        add(b);
        add(c);
        b.addActionListener(this);
        c.addActionListener(this);
        Image img1=new ImageIcon("C:\\Users\\iraki\\Downloads\\Documents\\images.jpg").getImage().getScaledInstance(100,50,Image.SCALE_AREA_AVERAGING);
        Image img2=new ImageIcon("C:\\Users\\iraki\\Downloads\\Documents\\download.png").getImage().getScaledInstance(100,50,Image.SCALE_FAST);
        
        b.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        b.setIcon(new ImageIcon(img1));
        c.setIcon(new ImageIcon(img2));
        
        //b.setBorderPainted(false);
        b.setContentAreaFilled(false);
        //b.setFocusPainted(false);
        
        c.setBorderPainted(false);
        c.setContentAreaFilled(false);
        //c.setFocusPainted(false);
        l.setToolTipText("counter display");
        getRootPane().setDefaultButton(b);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        cnt++;
        l.setText("Clicked "+cnt+" times");
        if(e.getSource()==c)
        {
            l.setText("Clicked "+0+" times");
            cnt=0;
        }
    }
}

public class FirstSwingApp {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
