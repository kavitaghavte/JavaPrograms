import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Aque2 extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t;
    JCheckBox ch1,ch2,ch3;
    JRadioButton rb1,rb2,rb3;
    ButtonGroup bg;
    Container c;
    JButton b;
    public Aque2()
    {
        c=this.getContentPane();

        c.setLayout(null);
        l1=new JLabel("Your Name ");
        l2=new JLabel("Your class ");
        l3=new JLabel("Your Hobbies ");
        l4=new JLabel();
        t=new JTextField();
        rb1=new JRadioButton("FY");
        rb2=new JRadioButton("SY");
        rb3=new JRadioButton("TY");
        ch1=new JCheckBox("Music");
        ch2=new JCheckBox("Dance");
        ch3=new JCheckBox("Sport");
        b=new JButton("Submit");

        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        l1.setBounds(50,100,80,40);
        l2.setBounds(50,150,80,40);
        l3.setBounds(200,150,150,40);
        t.setBounds(200,100,200,40);
        rb1.setBounds(50,200,100,40);
        rb2.setBounds(50,230,100,40);
        rb3.setBounds(50,260,100,40);
        ch1.setBounds(200,200,100,40);
        ch2.setBounds(200,230,100,40);
        ch3.setBounds(200,260,100,40);
        b.setBounds(140,330,100,30);
        l4.setBounds(50,400,600,30);

        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(t);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(ch1);
        c.add(ch2);
        c.add(ch3);
        this.add(b);
        this.add(l4);

        b.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String str1=t.getText();
            String str2="sY";
            String str3="Music,";
            if(rb1.getModel().isSelected()) str2="FY";
            else if(rb2.getModel().isSelected()) str2="SY";
            else if(rb3.getModel().isSelected()) str2="TY";
            if(ch1.getModel().isSelected()) str3="  Music";
            if(ch2.getModel().isSelected()) str3+=" Dance";
            if(ch3.getModel().isSelected()) str3+=" Sport";
           l4.setText("Name : "+str1+"  ,   class : "+str2+"  ,  Hobbies : "+str3);
        }
    });
    }

    public static void main(String arg[])
    {
        Aque2 obj=new Aque2();
        obj.setSize(800,700);
        obj.setTitle("Student Registration");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}