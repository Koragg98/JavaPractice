package awtpractice;

import java.awt.*;
import java.awt.event.*;
/**
 * @author iraki
 */
class MyCheckbox extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    
    public MyCheckbox()
    {
        l=new Label("Nothing is selected");
        cbg=new CheckboxGroup();
        c1=new Checkbox("Java",true,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("c#",false,cbg);
        
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        
        if(c1.getState())
            str+=" "+c1.getLabel();
        if(c2.getState())
            str+=" "+c2.getLabel();
        if(c3.getState())
            str+=" "+c3.getLabel();
        if(str.isEmpty())
            str="Nothing is selected";
        
        l.setText(str);
    }
}
public class CheckboxDemo {

    public static void main(String[] args) {
        MyCheckbox f=new MyCheckbox();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
