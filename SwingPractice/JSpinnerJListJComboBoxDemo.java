package swingpractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.List;
/**
 * @author iraki
 */
class MyListSpinnerComboBox extends JFrame implements ActionListener,ChangeListener,ListSelectionListener
{
    JList list;
    JSpinner sp1,sp2;
    JComboBox cb;
    JTextField tf;
    JButton b;
    JPanel p1,p2;
    public MyListSpinnerComboBox()
    {
        super("JSpinner,JList & JComboBox");
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] countries={"India","Arab","USA","England","Russia"};
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Satarday","Sunday"};
        
        cb=new JComboBox(countries);
        //Cons.: initial value,min,max,stepSize
        sp1=new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp2=new JSpinner(new SpinnerListModel(days));
        list=new JList(months);
        tf=new JTextField(10);
        
        list.setVisibleRowCount(7);
        sp1.setFocusable(false);
        JSpinner.DefaultEditor editor=(JSpinner.DefaultEditor)sp1.getEditor();
        editor.getTextField().setEditable(false);
        sp2.setAutoscrolls(true);
        JSpinner.DefaultEditor editor2=(JSpinner.DefaultEditor)sp2.getEditor();
        editor2.getTextField().setCaretPosition(editor2.getTextField().getText().length());
        
        p1=new JPanel();
        p2=new JPanel();
        
        p1.add(cb);
        p1.add(sp1);
        p1.add(sp2);
        p2.add(new JScrollPane(list));
        p2.add(tf);
        b=new JButton("Clear");
        p2.add(b);
        
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        
        cb.addActionListener(this);
        sp1.addChangeListener(this);
        sp2.addChangeListener(this);
        list.addListSelectionListener(this);
        b.addActionListener(this);
    }
    @Override
    public void stateChanged(ChangeEvent e)
    {
        if(e.getSource()==sp1)tf.setText(sp1.getValue().toString());
        else tf.setText(sp2.getValue().toString());
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b) tf.setText("");
        else
            tf.setText(cb.getSelectedItem().toString());
    }
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        List<String> values=list.getSelectedValuesList();
        
        if(values.size()==1)
            tf.setText(values.get(0));
        else
        {
            StringBuilder temp = new StringBuilder();
            for(String x:values)
                temp.append(x).append(" ");
            tf.setText(temp.toString().trim());
        }
        
    }
}
public class JSpinnerJListJComboBoxDemo {

    public static void main(String[] args) {
        MyListSpinnerComboBox f= new MyListSpinnerComboBox();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
