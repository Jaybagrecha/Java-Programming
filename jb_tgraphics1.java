import java.awt.*;
import java.awt.event.*;


class jb_tgraphics1 extends Frame implements Runnable 
{
int x,y,red,green,blue;
Thread th1,th2;
Color c1;
TextField t1,t2;
Label l1,l2;


jb_tgraphics1()
{
x=100;
y=100;
setTitle("Multi Utility");
setBounds(50,50,700,700);
setLayout(null);
setVisible(true);
th1=new Thread(this);
th1.start();

 t1=new TextField(30);
 t1.setBounds(350,50,200,50);
 t1.setText("0.0");
 t1.setEditable(false);
 t1.setBackground(Color.black);
 t1.setForeground(Color.white);

 t2=new TextField(30);
 t2.setBounds(350,150,200,50);
 t2.setText("0.0");
 t2.setEditable(false);
 t2.setBackground(Color.black);
 t2.setForeground(Color.white);


l1=new Label ("Rs:");
l1.setBounds(300,50,170,50);
l1.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,15));

l2=new Label ("$: ");
l2.setBounds(300,150,170,50);
l2.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,15));

add(t1);
add(t2);
add(l1);
add(l2);
}

public void run()
{
int i;
double Rs,$;
try						
 {
  while(true)
  {
    if(Thread.currentThread()==th1)
    {
  //for(i=0;i<10;i++)
   //{
   /* y=y+10;
    if(y>300)
	{
        y=50;
	red=(int)(Math.random()*255);
	green=(int)(Math.random()*255);
	blue=(int)(Math.random()*255);
       }


    repaint();
    th1.sleep(100);
   }
  }
catch(InterruptedException ie)
{
}*/
}

for(y=50;y<300;y=y+20)
{   
red=(int)(Math.random()*255);
green=(int)(Math.random()*255);
blue=(int)(Math.random()*255);
repaint();
th1.sleep(500); 
}
for(y=300;y>50;y=y-20)
{
red=(int)(Math.random()*255);
green=(int)(Math.random()*255);
blue=(int)(Math.random()*255);
repaint();
th1.sleep(500);
}
}
}
}

else if(Thread.currentThread()==th2)
{
Rs=Double.parseDouble(t1.getText());
$=(Rs/70);

Rs=Rs+1000;
 if(Rs>25000)
  {
   Rs=0;
    }
}
catch(InterruptedException ie)
{
}
}

public void paint(Graphics g)
{
c1=new Color(red,green,blue);
g.setColor(c1);
//g.setColor(Color.red);
g.fillOval(x,y,100,100);
g.drawLine(50,400,250,400);
}

}



public static void main(String args[])
{
jb_tgraphics1 obj= new jb_tgraphics1();
}
}

