import java.awt.*;
import javax.swing.*;

class jb_swing1
{

 JFrame f1;
 JTextField t1;
 JButton b1;
 JPanel p1;
 Cursor c1;

 jb_swing1()
{
 f1= new JFrame("SWING DEMO");
 f1.setBounds(50,50,300,300);
 p1=(JPanel)f1.getContentPane();
 p1.setLayout(new FlowLayout());
 b1=new JButton("SHOW");

 b1.setMnemonic('S');				//shortcut key assigned ALT + S
 b1.setToolTipText("Click Here ! ");            // 
 c1= new Cursor(Cursor.HAND_CURSOR);
 b1.setCursor(c1);

 t1=new JTextField(50);


 p1.add(t1);
 p1.add(b1);

 f1.setVisible(true);
}

public static void main(String Args[])

 {
 jb_swing1 obj=new jb_swing1();
 }
}
