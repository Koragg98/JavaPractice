package swingpractice;
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
/**
 * @author iraki
 */
class MyText extends JFrame
{
    public MyText()
    {
        super("Text Demo");
        JTextField tf1=new JTextField(30);
        
        DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2=new JFormattedTextField(df);
        
        //tf2.setValue(0);      //01/01/1970
        tf2.setValue(new Date());
        tf2.setColumns(30);
        
        //Number Format
        //NumberFormat nf=NumberFormat.getNumberInstance();
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft=new NumberFormatter(nf);
        JFormattedTextField tf3=new JFormattedTextField(nft);
        tf3.setColumns(20);
        tf3.setValue(0);
        
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        
        setLayout(new FlowLayout());
        
        add(tf1);
        add(tf2);
        add(tf3);
    }
}
public class TextFieldDemo {

    public static void main(String[] args) {
        MyText f=new MyText();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
