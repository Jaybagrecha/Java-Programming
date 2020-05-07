class jb_thread1 implements Runnable
{ 
 Thread th1;
 jb_thread1()
 {
 th1=new Thread(this);
 th1.start();
 }
 public void run()
 {
int j;
try
{
 for(j=5;j<10;j++)
  {
   System.out.println(" "+j);
   Thread.sleep(1000);
  }
}
catch(InterruptedException ie)
{
}
 }
 public static void main(String args[])
 {
 jb_thread1 obj = new jb_thread1();
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

