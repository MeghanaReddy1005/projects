/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_demo;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Meghana Reddy
 */
public class fistGui {
    
    public static void main(String[]args)
    {
        Abc obj=new Abc(); //object will call the jframe
      
       
    }
    
}

class Abc extends JFrame // cardLayout
{
    public Abc()
    {
    
     setLayout(new FlowLayout());//Flowlayout Gridlayout null
     JLabel l= new JLabel("hello world");
     JLabel l1=new JLabel("All the best meghana");
     add(l); //creating canvas we have to create frame and create some objects and add them to thr frame
     add(l1);
     setVisible(true); //default jfame is unvisible so to make it visible
     setLayout(new FlowLayout());//Flowlayout Gridlayout null
     setSize(400, 400);// setsize take input in pixels
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
    }

   
    }


