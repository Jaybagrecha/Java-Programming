import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class swing2 implements ActionListener
{
   
    JFrame f1;
    JPanel p1;
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l1,l2; 
    Cursor c1;
    Color c2;
    
    swing2()
    {
       f1=new JFrame("F.D.Scheme");
       f1.setBounds(50,50,500,500);
       
       c2=new Color(200,150,200);
       f1.setBackground(c2);
       p1=(JPanel)f1.getContentPane();
       p1.setLayout(null);
       c2=new Color(200,150,200);
       p1.setBackground(c2);
     
       
       l1=new JLabel("enter deposit amt.");
       l1.setBounds(50,50,150,40);
       t1=new JTextField();
       t1.setBounds(250,50,100,40);
       l2=new JLabel("rate of  interest");
       l2.setBounds(50,140,150,40);
       t2=new JTextField();
       t2.setBounds(250,140,100,40);
       t2.setText("5.5");
       t2.setEditable(false);
       
       b1=new JButton("calc");
       b1.addActionListener(this);
       b1.setFont(new Font("Times Roman",Font.ITALIC,20));
       b1.setBounds(50,240,100,50);
       b1.setToolTipText("click here");
       b1.setMnemonic('c');
       b2=new JButton("exit");
       b2.addActionListener(this);
       b2.setFont(new Font("Times Roman",Font.ITALIC,20));
       b2.setBounds(250,240,100,50);
       b2.setMnemonic('e');
       
       c1=new Cursor(Cursor.HAND_CURSOR);
       b1.setCursor(c1);
       b2.setCursor(c1);
       
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
             JOptionPane.showMessageDialog(f1,"interest payable="+intr,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);
              JOptionPane.showMessageDialog(f1,"maturity amount="+mamt,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);
               t1.setText(" ");
             }
             else
             {
                 System.exit(0);      
                 
              }
              
         }
         
      public static void main(String args[])
      {
         swing2 obj = new swing2();
         }
     }    
