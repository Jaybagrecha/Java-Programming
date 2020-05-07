import java.awt.*;

class jb_thread2 extends Frame implements Runnable
{
int x,y;
Thread th1;

jb_thread2()
{
x=100;
y=100;
setTitle("Animation");
setBounds(50,50,500,500);
setLayout(null);
setVisible(true);
th1=new Thread(this);
th1.start();
}

public void run()
{
int i;
try
 {
   while(true)
  {
  //for(i=0;i<10;i++)
   //{
    x=x+10;
    if(x>400)
	{
         x=50;
	}
       
    repaint();
    th1.sleep(500);
   }
  }
catch(InterruptedException ie)
{
}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillRect(x,y,100,100);
}

public static void main(String args[])
{
jb_thread2 obj= new jb_thread2();
}
}
