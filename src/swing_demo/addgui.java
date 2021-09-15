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
public class addgui {
    public static void main(String[]args)
    {
      Addition obj=new Addition();
    }
    
}
class Addition extends JFrame implements ActionListener//is a interface //to listen to input
{
    JTextField t1,t2 ;//if we define inside constructor the scope will restricted to constructor
    JButton b;
    JLabel l;
    public Addition()
    {
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("ok");
        
        
        //JTextField t1=new JTextField(20);
        //JTextField t2=new JTextField(20);
        //JButton b=new JButton("ok");
        
        
       
            
        /*2ndway
        way 2  //following code was writen in contructor 
        ActionListener al=new ActionListener() // for interface we cant create object so we have to define implementation
        {
            
            
                //this is like creating classby implementing interface
            public void actionPerformed(ActionEvent ae)// this is present in ActionListener
            {
              int num1=Integer.parseInt(t1.getText());
              int num2=Integer.parseInt(t2.getText());
              int sum=num1+num2;
              l.setText(sum+"");//because setText takes string so to convert int to string.
            }   
        };
       
        b.addActionListener(al);//b is button so it should listen n then perform and return the output  
       */
        l=new JLabel("Result");
        
        add(t1);
        add(t2);
        add(b);
        add(l);
       //way 2 first is using implements implements ActionListener
       //WAY1: IMPLEMENT ACTION LISTNER
       //class Addition extends JFrame implements ActionListener
       b.addActionListener(this);  // actionlistener is an interface //this will pass obj of add to actionlistener
       setVisible(true); //default jfame is unvisible so to make it visible
       setLayout(new FlowLayout());//Flowlayout Gridlayout null default layout is card layout.
       setSize(400, 400);// setsize take input in pixels
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
         public void actionPerformed(ActionEvent ae) //actionlistener has a methord actionperformed so we have to implement it
            {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int sum=num1+num2;
                l.setText(sum+"");//because setText takes string so to convert int to string.
            }
    }

   

