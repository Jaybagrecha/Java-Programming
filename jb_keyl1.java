import java.awt.*;
import java.awt.event.*;

class jb_keyl1 implements KeyListener
{
Frame f1;
TextField t1,t2,t3;

 jb_keyl1()
 {
   f1=new Frame("KEY LISTENER");
   f1.setLayout(new FlowLayout());
   f1.setBounds(50,50,300,300);

   t1=new TextField(30);
   t1.addKeyListener(this);
   t2=new TextField(30);
   t3=new TextField(30);

   f1.add(t1);
   f1.add(t2);
   f1.add(t3);

   f1.setVisible(true);
 }

public void keyTyped(KeyEvent ke)
{
} 

public void keyPressed(KeyEvent ke)
{
 int code;
 code=ke.getKeyCode();
 t2.setText("code:"+code);	
 if(code==121)
 System.exit(0);

 if(code==112)
 {
  try
  {
  Runtime r=Runtime.getRuntime();
  Process p1=null;
  p1=r.exec("java jb_swingfinal");
  System.out.println("D O N E"); 
  }
   
  catch(Exception e)
  {

  }
 }
}

public void keyReleased(KeyEvent ke)
{
}

public static void main(String args[])
{
jb_keyl1 obj= new jb_keyl1();
}

}
