import java.awt.*;
import java.awt.event.*;

class jb_event implements ActionListener
{

 Frame f1;
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Button b1,b2,b3;

jb_event()
{
 f1=new Frame("ADDITION");
 f1.setBounds(50,50,300,300);
 f1.setLayout(new FlowLayout());

l1= new Label("Enter 1st No.");
l2= new Label("Enter 2nd No.");
l3= new Label("Result");
t1= new TextField(30);
t2= new TextField(30);
t3= new TextField(30);
b1= new Button("+");
b2= new Button("CLEAR");
b3= new Button("EXIT");

b1.setBackground(Color.red);
b1.setForeground(Color.yellow);
b2.setBackground(Color.red);
b2.setForeground(Color.yellow);
b3.setBackground(Color.red);
b3.setForeground(Color.yellow);
t1.setBackground(Color.black);
t1.setForeground(Color.white);
t2.setBackground(Color.black);
t2.setForeground(Color.white);
t3.setBackground(Color.black);
t3.setForeground(Color.white);
f1.setBackground(Color.orange);
f1.setForeground(Color.cyan);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);

f1.add(b1);
f1.add(b2);
f1.add(b3);

f1.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
int a,b,c;
if(ae.getSource()==b1)
	{
	 a=Integer.parseInt(t1.getText());
	 b=Integer.parseInt(t2.getText());
	 c=a+b;
	 t3.setText(c+"");
	}
else if(ae.getSource()==b2)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
else
{
System.exit(0);
}
}

public static void main(String args[])
 {
 jb_event obj=new jb_event();
 }
}
	
