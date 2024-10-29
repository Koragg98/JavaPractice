package awtpractice;
import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyListAndChoice extends Frame implements ActionListener,ItemListener
{
    List l;
    Choice c;
    TextArea ta;
    
    public MyListAndChoice()
    {
        super("List & Choice Demo");
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c);
        add(ta);
        
        l.addActionListener(this);
        l.addItemListener(this);
        c.addItemListener(this);
                
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Satarday");
        l.add("Sunday");
        
        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
        {
            txt+=x+"\n";
        }
        ta.setText(txt);
    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==l)
        {
            String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
        {
            txt+=x+"\n";
        }
        ta.setText(txt);
        }
        else
            ta.setText(c.getSelectedItem());
    }
}
public class ListDemo {

    public static void main(String[] args) {
        MyListAndChoice f=new MyListAndChoice();
        f.setSize(500,500);
        f.setVisible(true);
    }

}
