import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;                    //to access Border class
import java.awt.event.*;
class Login extends JFrame 
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    static int icnt=0;

    public Login()
    {
        this.setLayout(null);                                 //system set the component at their default position hence we have to setLayout to null position

        l1=new JLabel("  Name");             //here for using Label import awt package
        l2=new JLabel("  Password");
        l3=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Login");
        b2=new JButton("Clear");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,110,100,30);
        t1.setBounds(200,50,200,30);
        t2.setBounds(200,110,200,30);
        b1.setBounds(80,180,100,30);
        b2.setBounds(250,180,100,30);
        l3.setBounds(100,250,300,50);

        Border bobj=BorderFactory.createLineBorder(Color.black);                           //we cannot create Border class object as it is abstract
        l1.setBorder(bobj);
        l2.setBorder(bobj);
 
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l3);

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String str1=t1.getText();
                String str2=t2.getText();
                if(icnt==3)
                {
                    b1.removeActionListener(this);
                }
                if(!(str1.equals("kavita")) || !(str2.equals("kavi1144")))
                {
                    icnt++;
                    l3.setText("Invalid Username or Password");
                }
                else
                {
                    l3.setText("Your Username and Password is correct");
                }
            }
        });

         b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                t1.setText("");
                t2.setText("");
                l3.setText("");
            }
        });
    }
    public static void main(String arg[])
    {
        Login obj=new Login();
        obj.setSize(700,600);
        obj.setTitle("Logine Check");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
