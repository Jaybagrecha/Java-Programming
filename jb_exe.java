import java.io.*;

class jb_exe
{
 public static void main(String args[])
 {
  try
  {
  Runtime r=Runtime.getRuntime();
  Process p1=null;
  p1=r.exec("java jb_awt2");
  System.out.println("D O N E"); 
  }
   
  catch(Exception e)
  {

  }
 } 
}
