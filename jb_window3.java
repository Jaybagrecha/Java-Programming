import java.awt.*;
import java.awt.event.*;

class jb_window3 
{
 Frame f1;
 Button b1;

jb_window3()
{
f1=new Frame("WINDOW LISTENER");
f1.setLayout(null);
f1.setBounds(50,50,500,500);

f1.addWindowListener(new mywin());

b1=new Button("JAY!");
b1.setBounds(200,200,100,100);

f1.add(b1);

f1.setVisible(true);
}
class mywin extends WindowAdapter
{

 public void windowClosing(WindowEvent we)
 {
 System.out.println("\n\tAbout to close ");
f1.dispose();                                                                               
 }

}

public static void main(String args[])
{
jb_window3 obj= new jb_window3();
}
} 



