import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
 
public class RegistrationForm implements ActionListener {
    JFrame frame;
    //Creating constructor
    RegistrationForm()
    {
        
        createWindow();//calling method from constructor
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }
}