import java.awt.*;

class jb_awt1
{
 Frame f1;
 Label l1,l2;
 TextField t1,t2;
 Button b1,b2,b3;
 Color c1,c2;
 Font fnt;

 jb_awt1()
{
 //f1= new Frame();
 //f1.setTitle("Square of No.");
 f1= new Frame("Square of No.");
 //f1.setLocation(50,50);
 //f1.setSize(300,300);
 f1.setBounds(50,50,300,300);
 f1.setLayout(new FlowLayout());

l1= new Label("Enter No.");
l2= new Label("Result");
t1= new TextField(30);
t2= new TextField(30);
b1= new Button("CALC");
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
c2= new Color(255,255,255);
l1.setBackground(c2);
l1.setForeground(Color.magenta);
l2.setBackground(c2);
l2.setForeground(Color.magenta);
//f1.setBackground(Color.orange);
//f1.setForeground(Color.cyan);
c1= new Color(50,185,150);
f1.setBackground(c1);
fnt= new Font("Century Schoolbook L",Font.BOLD,22);
f1.setFont(fnt);
b1.setFont(new Font("dejavu sans light",Font.ITALIC,14));
b2.setFont(new Font("dejavu sans light",Font.ITALIC,14));
b3.setFont(new Font("dejavu sans light",Font.ITALIC,14));


f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(b1);
f1.add(b2);
f1.add(b3);

f1.setVisible(true);
}

public static void main(String args[])
 {
 jb_awt1 obj=new jb_awt1();
 }
}


