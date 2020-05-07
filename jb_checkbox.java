import java.awt.*;
import java.awt.event.*;

class jb_checkbox implements ItemListener
{

Frame f1;
TextField t1;
Checkbox ch1,ch2,ch3;
Choice c1;

jb_checkbox()
{
 f1= new Frame("F.D SCHEME");
 f1.setBounds(50,50,400,400);
 f1.setLayout(new FlowLayout());
 
 t1=new TextField(30);
 t1.setBounds(50,50,300,50);

 c1=new Choice();
 c1.add("select Term");
 //c1.setTitle("Select Sch:");
 c1.add("Short Term");
 c1.add("Med Term");
 c1.add("Long Term");
 c1.addItemListener(this); 

 ch1=new Checkbox("SR. CITIZEN");
 ch1.addItemListener(new jb_checkbox1());
 //ch2=new Checkbox("SECOND");
 //ch3=new Checkbox("THIRD");
 
 f1.add(t1);
 f1.add(c1);
 f1.add(ch1);
 //f1.add(ch2);
 //f1.add(ch3);
 
f1.setVisible(true);
}   

class jb_checkbox1 implements ItemListener
{
 double rate;
public void itemStateChanged(ItemEvent ie)
{
 if(ch1.getState()==true)
  {
  rate=Double.parseDouble(t1.getText());
  rate=rate + 0.5;
  t1.setText(rate+"");      
  }
 else{
  rate=Double.parseDouble(t1.getText());
  rate=rate - 0.5;
  t1.setText(rate+"");    
     }
 }
}
public void itemStateChanged(ItemEvent ie)
{
 int Index;
 Index=c1.getSelectedIndex();

 switch(Index)
  {
   case 1: t1.setText("5");
           break;
   case 2: t1.setText("6");
	   break;
   case 3: t1.setText("7");
  }
}


public static void main(String Args[])

 {
 jb_checkbox obj=new jb_checkbox();
 }
}
  
