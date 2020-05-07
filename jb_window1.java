import java.awt.*;
import java.awt.event.*;

class jb_window1 implements WindowListener
{
 Frame f1;
 Button b1;

jb_window1()
{
f1=new Frame("WINDOW LISTENER");
f1.setLayout(null);
f1.setBounds(50,50,500,500);

f1.addWindowListener(this);

b1=new Button("JAY!");
b1.setBounds(200,200,100,100);

f1.add(b1);

f1.setVisible(true);
}

public void windowOpened(WindowEvent we)
{
System.out.println("\n\tOpened ");
}
public void windowClosing(WindowEvent we)
{
System.out.println("\n\tAbout to close ");
f1.dispose();                                                                               
}
public void windowClosed(WindowEvent we)
{
System.out.println("\n\tClosed ");
b1.setBackground(Color.gray);
}
public void windowActivated(WindowEvent we)
{
System.out.println("\n\tActivated ");
b1.setBackground(Color.green);
}
public void windowDeactivated(WindowEvent we)
{
System.out.println("\n\tDeactivated");
b1.setBackground(Color.black);
}
public void windowIconified(WindowEvent we)		//minimized
{
System.out.println("\n\tMinimized");
b1.setBackground(Color.cyan);
}
public void windowDeiconified(WindowEvent we)
{
System.out.println("\n\tRestore ");
b1.setBackground(Color.yellow);
}


public static void main(String args[])
{
jb_window1 obj= new jb_window1();
}
} 



