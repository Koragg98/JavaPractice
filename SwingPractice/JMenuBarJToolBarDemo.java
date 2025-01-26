package swingpractice;
import javax.swing.*;
import java.awt.*;
import javax.swing.JToolBar.Separator;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
/**
 * @author iraki
 */
class MyMenuToolBar extends JFrame
{
    JToolBar tb;
    JButton b1,b2,b3,b4;
    JTextArea ta;
    public MyMenuToolBar()
    {
        super("Tool Bar Demo");
        tb=new JToolBar();
        b1=new JButton(new ImageIcon(new ImageIcon("resources/images/open.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        b2=new JButton(new ImageIcon(new ImageIcon("resources/images/save.jpg").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        b3=new JButton(new ImageIcon(new ImageIcon("resources/images/copy.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        b4=new JButton(new ImageIcon(new ImageIcon("resources/images/close.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        
        tb.add(b1);
        tb.add(b2);
        //Separator is a class inside javax.swing.JTollBar
        tb.add(new Separator());
        tb.add(b3);
        tb.add(b4);
        
        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        
        JMenu f=new JMenu("File");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem save=new JMenuItem("save");
        JMenuBar mb=new JMenuBar();
        
        open.setMnemonic(KeyEvent.VK_O);
        b1.setMnemonic(KeyEvent.VK_O);
        
        f.add(open);
        f.addSeparator();
        f.add(save);
        mb.add(f);
        setJMenuBar(mb);
        
        add(tb,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);
        
        open.addActionListener(new Handler());
        b1.addActionListener(new Handler());
        b1.setActionCommand("open");
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
    }
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            //JFileChooser and JColorChooser are two class inside swing
            if(ae.getActionCommand().equals("open"))
            {
                JFileChooser fc=new JFileChooser();
                fc.setCurrentDirectory(new File("."));
                fc.showOpenDialog(rootPane);
                if(fc.getSelectedFile()!=null)
                {   
                    File f=fc.getSelectedFile();
                    try
                    {
                        FileInputStream fi=new FileInputStream(f);
        //                byte b[]=new byte[fi.available()];
        //                //read() only read a byte of data and read(b) reads upto b.length
        //                fi.read(b);
                        byte b[]=fi.readAllBytes();
                        String str=new String(b);
                        ta.setText(str);
                        fi.close();
                    }
                    catch(Exception e){System.out.println(e);}
                }
            }
            else
            {
                Color c=JColorChooser.showDialog(rootPane, "Color Chooser", Color.red);
                ta.setForeground(c);
            }
        }
    }
}
public class JMenuBarJToolBarDemo {

    public static void main(String[] args) {
        MyMenuToolBar f=new MyMenuToolBar();
        f.setVisible(true);
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
