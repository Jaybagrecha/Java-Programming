class jb_delay1
{ 
 public static void main(String args[])
 {
 int i;
try
{
 for(i=0;i<5;i++)
  {
   System.out.println(" "+i);
   Thread.sleep(1000);
  }
}
catch(InterruptedException ie)
{
}
}
}

