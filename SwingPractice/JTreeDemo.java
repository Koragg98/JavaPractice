package swingpractice;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.*;
import java.awt.*;
import java.util.StringTokenizer;
import javax.swing.event.*;
/**
 * @author iraki
 */
class MyTree extends JFrame implements TreeSelectionListener
{
    JTree t;
    JLabel l;
    public MyTree()
    {
        super("JTree Demo");
        //First crete tree structure, TreeNode is an Inteerface ,we have to use DefaultMutableTree (inside javax.swing.tree)
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("D:\\Education");
        File f=new File("D:\\Education");
        
        for(File x:f.listFiles())
        {
            if(x.isDirectory())
            {
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles())
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                root.add(temp);
            }
            else
                root.add(new DefaultMutableTreeNode(x.getName()));
        }
        
        t=new JTree(root);
        l=new JLabel("No File Selected");
        t.addTreeSelectionListener(this);
        //JScrollPane add scrollbar to any component by default and then we add sp object instead of component
        //we must pass the component to the sp while creating 
        JScrollPane sp=new JScrollPane(t);
        //add sp instead of t
        add(sp,BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        l.setText(e.getPath().getLastPathComponent().toString());
    }
    
}
public class JTreeDemo {

    public static void main(String[] args) {
        MyTree f=new MyTree();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
