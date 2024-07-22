import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample1 implements ActionListener {
    
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    TextFieldExample1(){
        JFrame f = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50,50,150,20);
        
        tf2 = new JTextField();
        tf2.setBounds(50,100,150,20);
        
        tf3 = new JTextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);
    }
}
