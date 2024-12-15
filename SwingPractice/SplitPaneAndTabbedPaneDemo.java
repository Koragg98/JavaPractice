package swingpractice;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

/**
 * @author iraki
 */
class MySplitPane extends JFrame implements ListSelectionListener
{
    JList list;
    JLabel l;
    //JSplitPane jsp;
    JTabbedPane tp;
    public MySplitPane()
    {
        super("Split Pane Demo");
        //This data called as model
        String[] colors={"Red","Blue","Green","Yellow","Black"};
        //This is viewing data called view
        list=new JList(colors);
        JScrollPane sp1=new JScrollPane(list);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        
        l=new JLabel(" ");
        l.setOpaque(true);
        l.setBackground(Color.red);
        JScrollPane sp2=new JScrollPane(l);
        
//        jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sp1,sp2);
//        jsp.setDividerLocation(200);
//        add(jsp);
        tp=new JTabbedPane();
        tp.add("List",sp1);
        tp.add("Colors",sp2);
        add(tp);
    }
    public void valueChanged(ListSelectionEvent e)
    {
        String option=(String)list.getSelectedValue();
//        switch(option)
//        {
//            case "Red" ->l.setBackground(Color.red);
//            case "Blue" ->l.setBackground(Color.blue);
//            case "Green" ->l.setBackground(Color.green);
//            case "Yellow" ->l.setBackground(Color.yellow);
//            case "Black" ->l.setBackground(Color.black);
//        }
        switch(list.getSelectedIndex())
        {
            case 0 ->l.setBackground(Color.red);
            case 1->l.setBackground(Color.blue);
            case 2->l.setBackground(Color.green);
            case 3->l.setBackground(Color.yellow);
            case 4->l.setBackground(Color.black);
        }
    }
}
public class SplitPaneAndTabbedPaneDemo {

    public static void main(String[] args) {
        MySplitPane f=new MySplitPane();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
