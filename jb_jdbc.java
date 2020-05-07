import java.awt.*;
import java.sql.*;
import java.io.*;
import java.awt.event.*;


class jb_jdbc implements ActionListener
{
  Frame f1;
  Choice c1;
  TextField t1,t2,t3;
  Connection con;
  Statement st;
  ResultSet rs;
  String str; 
  Button b1,b2,b3,b4,b5;
   
  jb_jdbc() 
  {
    f1=new Frame("JDBC");
    f1.setBounds(50,50,500,525);
    f1.setLayout(null);
    
    t1=new TextField(20);
    t1.setBounds(250,50,150,50);
    t2=new TextField(20);
    t2.setBounds(250,150,150,50);
    t3=new TextField(20);
    t3.setBounds(250,250,150,50);
    
    c1=new Choice();
    c1.add("SELECT EMP NO.");
    c1.setBounds(50,50,150,50);
    c1.addItemListener(new MyCombo());
    
    b1=new Button("ADD");
   b1.setBounds(50,300,125,50);
   b1.addActionListener(this);
   b2=new Button("MODIFY");
   b2.setBounds(250,300,125,50);
   b2.addActionListener(this);
   b3=new Button("DELETE");
   b3.setBounds(50,450,125,50);
   b3.addActionListener(this);
   b4=new Button("EXIT");
   b4.setBounds(250,450,125,50);
   b4.addActionListener(this);
   b5=new Button("CLEAR");
   b5.setBounds(150,375,125,50);
   b5.addActionListener(this);
   
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);
    f1.add(b4);
    f1.add(b5);
    f1.add(c1);
    f1.add(t1);
    f1.add(t2);
    f1.add(t3);
    
    f1.setVisible(true);  
    
    try
    {
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","task");
     st=con.createStatement();
    }
    catch(Exception e)
    {
    System.out.println(""+e);
    }
    Myload();
    
    
   
  }
  
  public void actionPerformed(ActionEvent ae)
  {
  int no,age,no1;
  String nm;
     try
         {
           if(ae.getSource()==b1)
           {
            no=Integer.parseInt(t1.getText());
            nm=t2.getText();
            age=Integer.parseInt(t3.getText());
            str="insert into emp values('" + no + "','" + nm + "','" + age + "')";
            st.executeUpdate(str);
            str="Select * from emp";
            rs=st.executeQuery(str);
            Myload();
            MyClear();  
          }
            else if(ae.getSource()==b2)
           {
             no1=Integer.parseInt(c1.getSelectedItem());
             no=Integer.parseInt(t1.getText());
             nm=t2.getText();
             age=Integer.parseInt(t3.getText());
             str="update emp set eno='"+no+"',ename='"+nm+"',eage='"+age+"'where eno="+no1;
             st.executeUpdate(str);
             str="Select * from emp";
             rs=st.executeQuery(str);
             Myload();
             MyClear();
             rs.close();
           }
           
           else if(ae.getSource()==b3)
           {
             no1=Integer.parseInt(c1.getSelectedItem());
             str="delete from emp where eno="+no1;
             st.executeUpdate(str);
             str="Select * from emp";
             rs=st.executeQuery(str);
             Myload();
             MyClear();
             rs.close();
           }
            else if(ae.getSource()==b4)
           {
           
           }
            else if(ae.getSource()==b5)
           {
           
           }
         }
         catch(Exception ee)
         {
         }
  }
    
  void Myload()
  {
    try
      { 
         c1.removeAll();
         c1.add("Select Employee no:");
        str="Select * from emp";
        rs=st.executeQuery(str);
        while(rs.next())
        {
         c1.add(rs.getInt(1)+"");
        }
      }
     catch(Exception ex)
      {
    System.out.println(""+ex);
    }
  }
  
  void MyClear()
  {
   t1.setText("");
   t2.setText("");
   t3.setText("");
   c1.select(0);
  }
  
  class MyCombo implements ItemListener
  {
    public void itemStateChanged(ItemEvent ie)
    {
      int no1;
      no1=Integer.parseInt(c1.getSelectedItem());
      try
      { 
        str="Select * from emp where eno = "+no1;
        rs=st.executeQuery(str);
        rs.next();
        t1.setText(rs.getInt(1)+"");
        t2.setText(rs.getString(2));
        t3.setText(rs.getInt(3)+"");
        rs.close();
      }
      catch(Exception ey)
      {
    System.out.println(""+ey);
    }
    }
  }  
  public static void main(String args[])
	{
		jb_jdbc obj=new jb_jdbc();
	}		 
}
