import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.swing.border.*;
import java.awt.event.*;

class MyCalculator extends JFrame 
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5,b6;
    public MyCalculator()
    {
        this.setLayout(null);

        l1=new JLabel("Enter Secound Number");
        l2=new JLabel("Enter secound Number");
        l3=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");

        l1.setBounds(50,50,200,30);
        t1.setBounds(250,50,100,30);
        l2.setBounds(50,100,200,30);
        t2.setBounds(250,100,100,30);
        b1.setBounds(50,150,50,30);
        b2.setBounds(150,150,50,30);
        b3.setBounds(250,150,50,30);
        b4.setBounds(350,150,50,30);
        l3.setBounds(200,450,200,40);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());

                int ans=a+b;
                l3.setText("Addition of numbers is : "+ans);            
            }
        });

    }    
    public static void main(String argv[])
    {
        MyCalculator obj=new MyCalculator();
        obj.setSize(700,600);
        obj.setTitle("Arithmatic Calculator");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
