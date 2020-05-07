import java.util.*;

class Bank
{
	int accno;
	String nm;
	double bal;

	void create()
	{	
	  Scanner s1= new Scanner(System.in);
	  System.out.println("\n\tEnter New Acc. No.:");
	  accno=s1.nextInt();
	  System.out.println("\n\tEnter Name:");
	  nm=s1.next();
	  System.out.println("\n\tEnter Balance:");
	  bal=s1.nextDouble();
	}
	
	void show()
	{
	  System.out.println("\n\tAcc. No.:"+accno);	
	  System.out.println("\n\tName:"+nm);
	  System.out.println("\n\tBalance:"+bal);
	}
}
class jb_cust
{
public static void main(String args[])
  {
   Bank b1=new Bank();
   b1.create();
   b1.show();
  }
}
