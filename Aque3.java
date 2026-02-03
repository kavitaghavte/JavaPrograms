import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;                    //to access Border class
import java.awt.event.*;
class Aque3 extends JFrame 
{
    JLabel l1,l2,l3,l4,l5;
    JTextField t;
    JButton b1,b2,b3,b4;

    public Aque3()
    {
        this.setLayout(null);                                 //system set the component at their default position hence we have to setLayout to null position

        l1=new JLabel("  Enter String ");             //here for using Label import awt package
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        t=new JTextField();
        b1=new JButton("LOWER");
        b2=new JButton("UPPER");
        b3=new JButton("ITALIC");
        b4=new JButton("BOLD");

        l1.setBounds(50,50,100,30);
        t.setBounds(200,50,200,30);
        l2.setBounds(200,110,200,30);
        l3.setBounds(200,170,200,30);
        l4.setBounds(200,230,200,30);
        l5.setBounds(200,290,200,30);
        b1.setBounds(50,110,100,30);
        b2.setBounds(50,170,100,30);
        b3.setBounds(50,230,100,30);
        b4.setBounds(50,290,100,30);

        Border bobj=BorderFactory.createLineBorder(Color.black);                           //we cannot create Border class object as it is abstract
        l1.setBorder(bobj);
        l2.setBorder(bobj);
        l3.setBorder(bobj);
        l4.setBorder(bobj);
        l5.setBorder(bobj);
        b1.setBorder(bobj);
        b2.setBorder(bobj);
        b3.setBorder(bobj);
        b4.setBorder(bobj);
 
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String str=t.getText();
                String str1=str.toLowerCase();
                l2.setText("   "+str1);
            }
        });

         b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String str=t.getText();
                String str1=str.toUpperCase();
                l3.setText("   "+str1);
            }
        });

        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String str=t.getText();
                l4.setFont(new Font("Courier", Font.ITALIC,15));
                l4.setText("  "+str);
            }
        });

        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String str=t.getText();
                l5.setFont(new Font("Courier", Font.BOLD,15));
                l5.setText("  "+str);
            }
        });
    }
    public static void main(String arg[])
    {
        Aque3 obj=new Aque3();
        obj.setSize(700,600);
        obj.setTitle("String Operation");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}