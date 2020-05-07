import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class jb_swing_event1 implements ActionListener
{

 JFrame f1;
 JTextField t1;
 JButton b1;
 JPanel p1;
 Cursor c1;

 jb_swing_event1()
{
 f1= new JFrame("SWING DEMO");
 f1.setBounds(50,50,300,300);
 p1=(JPanel)f1.getContentPane();
 p1.setLayout(new FlowLayout());
 b1=new JButton("SHOW");
 
 b1.addActionListener(this);

 b1.setMnemonic('S');				//shortcut key assigned ALT + S
 b1.setToolTipText("Click Here ! ");            // popout suggestion...  
 c1= new Cursor(Cursor.HAND_CURSOR);		//to attach different type of cursor. 
 b1.setCursor(c1);

 t1=new JTextField(50);


 p1.add(t1);
 p1.add(b1);

 f1.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
 { //String str;
  if(ae.getSource()==b1)
    {
     /*str = JOptionPane.showInputDialog(f1,"ENTER NAME");
     t1.setText("HELLO "+str); */
JOptionPane.showMessageDialog(f1,"MY MESSAGE","MY TITLE",JOptionPane.INFORMATION_MESSAGE);
//To give a msg like in a box like "File submitted " and ect.
    }
 }

public static void main(String Args[])

 {
 jb_swing_event1 obj=new jb_swing_event1();
 }
}
