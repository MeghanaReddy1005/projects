/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_demo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Meghana Reddy
 */
public class try1 {
    public static void main(String[]args)
    {
      Addition1 obj=new Addition1();
     
    }
    
}
class Addition1 extends JFrame //implements ActionListener//is a interface //to listen to input
{
    JTextField t1,t2 ;//if we define inside constructor the scope will restricted to constructor
    JButton b;
    JLabel l;
    public Addition1()
    {
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("ok");
        
    
     
            
       
        ActionListener al=new ActionListener()
        {
            
            
              
            public void actionPerformed(ActionEvent ae)
            {
              int num1=Integer.parseInt(t1.getText());
              int num2=Integer.parseInt(t2.getText());
              int sum=num1+num2;
              l.setText(sum+"");
            }   
        };
    
       
       b.addActionListener(al);
       setVisible(true); 
       setLayout(new FlowLayout());
       setSize(400, 400);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l=new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);
       
     
    }   
}
    
   

