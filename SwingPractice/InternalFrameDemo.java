package swingpractice;
import javax.swing.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyInternalFrame extends JInternalFrame
{
    static int cnt=0;
    JScrollPane sp;
    JTextArea ta;
    public MyInternalFrame()
    {
        //String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable
        super("Document "+(++cnt),true,true,true,true);
        ta=new JTextArea();
        sp=new JScrollPane(ta);
        add(sp);
        
        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem mi=new JMenuItem("Save");
        
        file.add(mi);
        mb.add(file);
        setJMenuBar(mb);
        
        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}
class MyDesktopPane extends JFrame implements ActionListener
{
    JDesktopPane dp;
    public MyDesktopPane()
    {
        super("JDesktopPane Demo");
        dp=new JDesktopPane();
        add(dp);
        
        JMenuBar mb=new JMenuBar();
        JMenu doc=new JMenu("Document");
        JMenuItem mi=new JMenuItem("New");
        
        doc.add(mi);
        mb.add(doc);
        setJMenuBar(mb);
        
        mi.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(dp.getComponentCount()==0) MyInternalFrame.cnt=0;
        MyInternalFrame mif=new MyInternalFrame();
        dp.add(mif);
    }
}
public class InternalFrameDemo {

    public static void main(String[] args) {
        MyDesktopPane f=new MyDesktopPane();
        f.setSize(500,500);
        f.setVisible(true);
    }

}
