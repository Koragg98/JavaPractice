package swingpractice;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
/**
 * @author iraki
 */
class MySliderDemo extends JFrame implements ChangeListener
    {
        JSlider js;
        JPanel p1,p2;
        JProgressBar pb;
        
        int w=50;
        public MySliderDemo()
        {
            super("JSlider & JProgressBar Demo");
            //JSlider
            //Constructor: orientation,min,max,value
            js=new JSlider(SwingConstants.HORIZONTAL,0,100,50);
            js.setMajorTickSpacing(10);
            js.setMinorTickSpacing(1);
            js.setPaintTicks(true);
            js.setPaintLabels(true);
            js.setPaintTrack(true);
            
            //Circle
            p1=new JPanel(){
                @Override
                public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.setColor(Color.red);
                    g.fillOval(p1.getWidth()/2-(w/2),p1.getHeight()/2-(w/2), w, w);
                }
            };
            
            //JProgressBar
            pb=new JProgressBar(SwingConstants.HORIZONTAL,0,100);
            //pb.setBackground(Color.green);
            //pb.setIndeterminate(true);
            pb.setString("50%");
            pb.setStringPainted(true);
            pb.setValue(w);
            p2=new JPanel();
            p2.add(pb);
          
            //Event Listener
            js.addChangeListener(this);
            
            add(js,BorderLayout.NORTH);
            add(p1,BorderLayout.CENTER);
            add(p2,BorderLayout.SOUTH);
        }
        @Override
        public void stateChanged(ChangeEvent e)
        {
            w=js.getValue();
            pb.setIndeterminate(false);
            pb.setString(w+"%");
            pb.setStringPainted(true);
            pb.setValue(w);
            p1.repaint(); 
        }
    }
public class JSliderAndJProgressBarDemo {
    public static void main(String[] args) {
        MySliderDemo f=new MySliderDemo();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
