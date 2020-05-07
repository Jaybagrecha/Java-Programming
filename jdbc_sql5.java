import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class jdbc_sql5  implements ActionListener
{
     Choice c1;
     TextField t1,t2,t3;
     Frame f1;
     Button b1,b2,b3,b4,b5;
     Connection con;
     Statement st;
      ResultSet rs;
      String str;
     
     jdbc_sql5()
     {
     f1=new Frame("JDBC");
     f1.setLayout(null);
     f1.setBounds(50,50,500,500);
     
     c1=new Choice();
     c1.setBounds(50,50,150,50);
     c1.add("select EmpNO");
     c1.addItemListener(new mycombo());
     
   
     
     t1=new TextField(50);
     t1.setBounds(50,110,150,50);
     t2=new TextField(50);
     t2.setBounds(50,170,150,50);
     t3=new TextField(50);
    t3.setBounds(50,230,150,50);
     
     b1=new Button(" add");
     b1.setBounds(250,50,100,50);
     b1.addActionListener(this);
     b2=new Button("edit");
     b2.setBounds(250,110,100,50); 
     b2.addActionListener(this);
     b3=new Button("delete");
     b3.setBounds(250,170,100,50);
     b3.addActionListener(this);
     b4=new Button("clear");
     b4.setBounds(250,230,100,50);
     b4.addActionListener(this);
    b5=new Button("exit ");
     b5.setBounds(250,290,100,50);
    b5.addActionListener(this); 
     
     f1.add(c1);
     f1.add(t1);
     f1.add(t2);
     f1.add(t3);
     f1.add(b1);
     f1.add(b2);
     f1.add(b3);
     f1.add(b4);
     f1.add(b5);
     
     f1.setVisible(true);
     
           try
           {
                Class.forName("com.mysql.jdbc.Driver");   
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mitali","root","task");
                st=con.createStatement(); 
           }
           
           catch(Exception e)
             {
                 System.out.println(""+e);
             }
             
             myload();
     }
     
    
     
     void myload()
     {
         try
         {      
               c1.removeAll();
               c1.add("select employee no.");
                str="select * from emp";    
		rs=st.executeQuery(str);
		while(rs.next())   
		{ 
		    c1.add(rs.getInt(1)+"");
		}
		rs.close();
	
	 }
	 
	  catch(Exception e)
          {
              System.out.println(""+e);
          }
      }
      
      void myclear()
      {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            c1.select(0);
      }
      
      class mycombo implements ItemListener
      {
                public void itemStateChanged(ItemEvent ie)
                {
                       int no1;
                       no1=Integer.parseInt(c1.getSelectedItem());
                       try
                       {
                           str="select * from emp where eno="+no1;    
                          rs=st.executeQuery(str);
                          rs.next();
                          t1.setText(rs.getInt(1)+"");
                          t2.setText(rs.getString(2)+"");
                          t3.setText(rs.getInt(3)+"");
                          
                          rs.close();
                       }
                          
                    catch(Exception e)
                   {
                         System.out.println(""+e);
                   }      
          } 
               
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
               str="insert into emp values('"+no+"','"+nm+"','"+age+"')";
	      st.executeUpdate(str);
	      str="select * from emp";
               rs=st.executeQuery(str);
               myload();
               myclear();
               rs.close();
		
            }
            
            else if(ae.getSource()==b2)
           {
                no1=Integer.parseInt(c1.getSelectedItem());
                no=Integer.parseInt(t1.getText());
               nm=t2.getText();
               age=Integer.parseInt(t3.getText());
               str="update emp set eno='"+no+"',ename='"+nm+"',eage='"+age+"' where eno="+no1;
	       st.executeUpdate(str);
		
		str="select * from emp";    
		rs=st.executeQuery(str);
		myload();
               myclear();
               rs.close();
              
           }
        else if(ae.getSource()==b3)
           {
                  no1=Integer.parseInt(c1.getSelectedItem());
                  str=("delete from emp where eno="+no1);
                 st.executeUpdate(str);
                 str="select * from emp";
                 rs=st.executeQuery(str);
                 myload();
                 myclear();
                 rs.close();
           }
           
           
           else if(ae.getSource()==b4)
           {
                 myclear();
           }
           
           else
           {
                 System.exit(0);
           }
              
              
         }
         
         catch(Exception e)
           {
               System.out.println(""+e);
            }      
              
       }    
                     
       public static void main(String args[])
     {
           jdbc_sql5 obj=new jdbc_sql5();
      }
      
      
      }
			
