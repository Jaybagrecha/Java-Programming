import java.awt.*;
import java.util.*;

class jb_null2
{
 Frame f1;
 Label l1,l2,l3;
 TextField t1,t2;
 Button b1,b2,b3,b4;
 Calendar c1;
 int h,m,s;
 String str;
 MenuBar mb;
 Menu me1;
 MenuItem m1,m2,m3,m4;

jb_null2()
{
 Calendar c1= Calendar.getInstance();
   //System.out.println("\n\tINFO"+c1);

   h=c1.get(c1.HOUR_OF_DAY);
   m=c1.get(c1.MINUTE);
   s=c1.get(c1.SECOND);
   str=h+":"+m+":"+s;
   //System.out.println(" "+str);


 f1= new Frame();
 f1.setTitle("Convert Utility");
 f1.setBounds(50,50,500,550);
 f1.setLayout(null);
 f1.setBackground(Color.yellow);
 
 l1= new Label("ENTER VALUE:");
 l1.setBounds(50,50,150,50);

 l2= new Label("RESULT:");
 l2.setBounds(50,150,150,50);

 l3=new Label(str);
 l3.setBounds(450,20,80,50);
 

 t1= new TextField();
 t1.setBounds(300,50,150,50);
 t1.setBackground(Color.black);

 t2= new TextField();
 t2.setBounds(300,150,150,50);
 t2.setText("0.00");
 t2.setEditable(false);
 t2.setBackground(Color.black);

 b1= new Button("D to R");
 b1.setBounds(50,250,150,50);
 b1.setBackground(Color.green); 

 b2= new Button("Rs. to $");
 b2.setBounds(300,250,150,50);
 b2.setBackground(Color.green);

 b3= new Button("Clear");
 b3.setBounds(200,350,100,50);
 b3.setBackground(Color.blue);

 b4= new Button("E X I T");
 b4.setBounds(50,450,400,50);
 b4.setBackground(Color.red);

 mb=new MenuBar();
 
 me1=new Menu("MY MENU");
 m1=new MenuItem("D to R");
m2=new MenuItem("Rs. to $.");
m3=new MenuItem("CLEAR");
m4=new MenuItem("EXIT");
 
me1.add(m1);
me1.add(m2);
me1.add(m3);
me1.add(m4);
mb.add(me1);
f1.setMenuBar(mb);


f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(t2);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);

f1.setVisible(true);
}
public static void main(String args[])

 {
 jb_null2 obj=new jb_null2();
 }
}
