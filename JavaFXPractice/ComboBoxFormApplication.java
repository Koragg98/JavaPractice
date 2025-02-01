package javafxpractice;

import java.io.*;
import java.util.HashMap;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;

/**
 * @author iraki
 */
class Customer implements Serializable
{
    private int custId;
    private String name;
    private String add;
    
    public Customer(int id,String name,String add)
    {
        custId=id;
        this.name=name;
        this.add=add;
    }
    int getCustomerId(){return custId;}
    String getName(){return name;}
    String getAdd() {return add;}
    public String toString()
    {
        return "Name: "+name+", Add.: "+add;
    }
}
public class ComboBoxFormApplication extends Application {

    int cnt=0;
    private HashMap<Integer,Customer> custList;
    public void start(Stage stage)
    {
        Font f=new Font("Times New Roman",20);
        
        Label l1=new Label("Customer ID");l1.setFont(f);
        Label l2=new Label("Name");l2.setFont(f);
        Label l3=new Label("Address");l3.setFont(f);
        
        ComboBox<Integer> cb=new ComboBox<>();cb.setStyle("-fx-font-size:20");
        
        TextField name=new TextField();name.setPrefColumnCount(10);name.setFont(f);
        TextField add=new TextField();add.setPrefColumnCount(20);add.setFont(f);
        TextArea searchResult=new TextArea();searchResult.setFont(f);
        
        Button create=new Button("Create");create.setFont(f);
        Button save=new Button("Save");save.setFont(f);
        Button search=new Button("Search");search.setFont(f);
        
        HBox h1=new HBox(10,l1,cb);h1.setAlignment(Pos.CENTER);
        HBox h2=new HBox(10,l2,name);h2.setAlignment(Pos.CENTER);
        HBox h3=new HBox(10,l3,add);h3.setAlignment(Pos.CENTER);
        HBox h4=new HBox(10,create,save,search);h4.setAlignment(Pos.CENTER);
        
        VBox vb=new VBox(10,h1,h2,h3,h4,searchResult);//vb.setAlignment(Pos.CENTER);
        
        //HashMap Initialization
        custList=new HashMap<>();
        try
        {
            FileInputStream fis=new FileInputStream(new File("Customer.txt"));
            ObjectInputStream ois=new ObjectInputStream(fis);
            custList=(HashMap<Integer,Customer>)ois.readObject();
            for(int id:custList.keySet())
            {
                cb.getItems().add(id);
                if(id>cnt) cnt=id;
            }
        }catch(Exception ex){}
        
        create.setOnAction(e -> 
        {
            if(custList.containsKey(cnt)||cnt==0)
                cnt++;
           
            cb.setValue(cnt);
            name.setText("");
            add.setText("");
        });
        
        save.setOnAction(e -> 
        {
            if(!(cb.getValue()!=null)|| name.getText().equals("") || add.getText().equals(""))
            {
                Alert a=new Alert(AlertType.WARNING,"One or more fields are empty");
                a.show();
            }
            else
            {
                Customer c=new Customer(cb.getValue(),name.getText(),add.getText());
                custList.put(cb.getValue(), c);
                cb.getItems().add(cnt);
                try
                {
                    FileOutputStream fos=new FileOutputStream(new File("Customer.txt"));
                    ObjectOutputStream oos=new ObjectOutputStream(fos);
                    oos.writeObject(custList);
                    Alert a=new Alert(AlertType.CONFIRMATION,"Customer data saved successfully");
                    a.show();
                }catch(Exception ex){}
            }
        });
        
        search.setOnAction(e -> 
        {
            if(custList.containsKey(cb.getValue()))
                searchResult.setText(custList.get(cb.getValue()).toString());
            else
                searchResult.setText("Customer Information not found");
        });
        
        Scene sc=new Scene(vb,400,400);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
