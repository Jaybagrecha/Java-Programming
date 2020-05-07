import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class jb_swingfinal implements ActionListener
{

 JFrame f1;
 JPanel p1;
 JLabel l1,l2;
 JTextField t1,t2;
 JButton b1,b2;
 MenuBar mb;
 Menu me1;
 MenuItem m1,m2,m3,m4;
 Cursor c1;


jb_swingfinal()
{
 f1= new JFrame("FIXED DEPOSIT SCHEME");
 f1.setBounds(50,50,520,550);
 f1.setBackground(Color.yellow);
 p1=(JPanel)f1.getContentPane();
 p1.setLayout(null);
 
 p1.setBackground(Color.cyan);
 b1=new JButton("CALC");
 b1.setBounds(50,250,150,50);
 b1.setBackground(Color.green); 
 b1.setFont(new Font("Times New Roman",Font.BOLD,20));
 b2=new JButton("EXIT");
 b2.setBounds(300,250,150,50);
 b2.setBackground(Color.green);
 b1.setFont(new Font("Times Roman",Font.BOLD,20));

 t1=new JTextField(30);
 t1.setBounds(300,50,150,50);
 t1.setBackground(Color.black);
 t1.setForeground(Color.white);

 t2=new JTextField(30);
 t2.setBounds(300,150,150,50);
 t2.setText("5.5");
 t2.setEditable(false);
 t2.setBackground(Color.black);
 t2.setForeground(Color.white);

 l1=new JLabel ("Enter Deposit Cost: ");
 l1.setBounds(50,50,170,50);
 l1.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,15));

 l2=new JLabel ("Rate of Interest: ");
 l2.setBounds(50,150,170,50);
 l2.setFont(new Font("Algerian",Font.BOLD+Font.ITALIC,15));

 b1.addActionListener(this);

 b1.setMnemonic('C');				//shortcut key assigned ALT + S
 b1.setToolTipText("TO CALCULATE");            // popout suggestion...  
 c1= new Cursor(Cursor.HAND_CURSOR);		//to attach different type of cursor. 
 b1.setCursor(c1);

 b2.addActionListener(this);
 
 b2.setMnemonic('E');				//shortcut key assigned ALT + S
 b2.setToolTipText("TO EXIT");            // popout suggestion...  
 c1= new Cursor(Cursor.HAND_CURSOR);		//to attach different type of cursor. 
 b2.setCursor(c1); 
 

mb=new MenuBar();

me1=new Menu("OPTIONS");	
m1=new MenuItem("ONLINE TRANSACTION");		
m2=new MenuItem("OPEN ACCOUNT");
m3=new MenuItem("CREDIT/DEBIT PAYMENT");
m4=new MenuItem("NEW BANK ACCOUNT");
 
me1.add(m1);
me1.add(m2);
me1.add(m3);
me1.add(m4);
mb.add(me1);
f1.setMenuBar(mb);


p1.add(l1);
p1.add(t1);
p1.add(l2);
p1.add(t2);
p1.add(b1);
p1.add(b2);

f1.setVisible(true);
}

public void actionPerformed(ActionEvent ae)
 { double damt,rate,intr,mamt; 
  if(ae.getSource()==b1)
    {	
	damt=Double.parseDouble(t1.getText());
	rate=Double.parseDouble(t2.getText());
 	intr=damt*(rate/100);
	mamt=damt+intr;


JOptionPane.showMessageDialog(f1,"Interest Payable= "+intr,"Output",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(f1,"Maturity Amount Display= "+mamt,"Output",JOptionPane.INFORMATION_MESSAGE);
 t1.setText("");
}
 else
{
f1.dispose();
}
   }


public static void main(String Args[])

 {
 jb_swingfinal obj=new jb_swingfinal();
 }
}
  


  
