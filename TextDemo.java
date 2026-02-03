import java.awt.*;
import java.awt.event.*;

class TextDemo extends Frame implements ActionListener 
{
	TextField name;
	List lst;
	int []msg;
	TextDemo()
	{
		setLayout(new FlowLayout());
		lst=new List(5);
		lst.add("pune");
		lst.add("nashik");
		lst.add("mumbai");
		lst.add("pimpri");
		lst.add("Bhosari");

		add(lst);
		setLayout(new FlowLayout());
               
		name=new TextField(20);
		Label lb=new Label("Selected City : ",Label.LEFT);

		name.setBackground(Color.pink);
		name.setForeground(Color.red);
		Font f=new Font("Arial",Font.PLAIN,25);
                name.setFont(f);
		add(name);
		add(lb);
                
		lst.addActionListener(this);
		addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				});
	}
	public void actionPerformed(ActionEvent e )
	{
		msg=lst.getSelectedIndexes();

		Graphics g=this.getGraphics();
		for(int i=0;i<msg.length;i++)
		{
			g.drawString("Selected city"+lst.getItem(msg[i]),10,200);
		}
	}
	public static void main(String arg[])
	{
		TextDemo td=new TextDemo();
		td.setTitle("Example of text Field ");
		td.setSize(800,600);
		td.setVisible(true);
	}
}
