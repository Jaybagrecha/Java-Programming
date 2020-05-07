import java.awt.*;

class jb_awt2
{
 Frame f1;
 //TextField t1;
  TextArea t1;
 Button b1,b2,b3,b4;
 
 jb_awt2()
 {
  f1= new Frame("Layouts");
  f1.setBounds(50,50,300,300);
  //f1.setLayout(new FlowLayout(2));
  //f1.setLayout(new GridLayout());
  //f1.setLayout(new GridLayout(2,3));
  //f1.setLayout(new GridLayout(2,3,100,20));
  f1.setLayout(new BorderLayout());


  //t1= new TextField(30);
 t1= new TextArea(30,60);            //30 rows 60 columns
 
  b1= new Button("A");
  b2= new Button("B");
  b3= new Button("C");
  b4= new Button("D");

b1.setBackground(Color.red);
b1.setForeground(Color.yellow);
b2.setBackground(Color.blue);
b2.setForeground(Color.yellow);
b3.setBackground(Color.green);
b3.setForeground(Color.yellow);
b4.setBackground(Color.black);
b4.setForeground(Color.yellow);
 

 
  //f1.add(t1);
  f1.add(t1,BorderLayout.CENTER);
  //f1.add(b1);
f1.add(b1,BorderLayout.EAST);
  //f1.add(b2);
f1.add(b2,BorderLayout.WEST);
  //f1.add(b3);
f1.add(b3,BorderLayout.NORTH);
  //f1.add(b4);
f1.add(b4,BorderLayout.SOUTH);

f1.setVisible(true);
}

public static void main(String args[])
 {
 jb_awt2 obj=new jb_awt2();
 }
}

