import java.awt.*;
import java.util.*;

class jb_null3
{
 Frame f1;
 TextArea t1;
 Button b1,b2,b3,b4;
 Calendar c1;
 int h,m,s;
 String str;
 MenuBar mb;
 Menu me1;
 MenuItem m1,m2,m3,m4;

jb_null3()
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

 t1= new TextArea();
 t1.setBounds(50,75,300,450);
 t1.setBackground(Color.black);

 b1= new Button("NEW");
 b1.setBounds(400,75,100,40);
 b1.setBackground(Color.cyan); 

 b2= new Button("OPEN");
 b2.setBounds(400,150,100,40);
 b2.setBackground(Color.green);

 b3= new Button("SAVE");
 b3.setBounds(400,225,100,40);
 b3.setBackground(Color.blue);

 b4= new Button("EXIT");
 b4.setBounds(400,300,100,40);
 b4.setBackground(Color.red);

 mb=new MenuBar();
 
 me1=new Menu("MY MENU");
 m1=new MenuItem("CUT");
m2=new MenuItem("COPY");
m3=new MenuItem("PASTE");
m4=new MenuItem("UNDO");
 
me1.add(m1);
me1.add(m2);
me1.add(m3);
me1.add(m4);
mb.add(me1);
f1.setMenuBar(mb);



f1.add(t1);

f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);

f1.setVisible(true);
}
public static void main(String args[])

 {
 jb_null3 obj=new jb_null3();
 }
}

