import java.awt.*;
import java.awt.event.*;

class jb_graphics1 extends Frame implements ActionListener
{
int x,y,red,green,blue;
Button b1;
Color c1;


jb_graphics1()
{
red=255;
green=0;
blue=0;
x=50;
y=50;
setTitle("Graphics demo");
setBounds(50,50,500,500);
setLayout(null);
b1=new Button("MOVE");
b1.setBounds(400,400,50,50);

b1.addActionListener(this);

add(b1);
setVisible(true);
}

public void paint(Graphics g)
{
c1=new Color(red,green,blue);
g.setColor(c1);
g.fillRect(x,y,100,100);
g.setColor(c1);
g.fillOval(x,y,100,100);
g.setColor(c1);
g.drawString("BANGLADESH",x,y);
//g.fillRect(200,200,100,100);
}

public void actionPerformed(ActionEvent ae)
{
/*x=x+10;
y=y+10;
if(x>400||y>400)
{
x=50;
y=50;
}*/
x=(int)(Math.random()*400);
y=(int)(Math.random()*400);
red=(int)(Math.random()*255);
green=(int)(Math.random()*255);
blue=(int)(Math.random()*255);

repaint();
}

public static void main(String Args[])
{
jb_graphics1 obj=new jb_graphics1();
}
}

