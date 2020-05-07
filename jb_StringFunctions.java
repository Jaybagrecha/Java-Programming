import java.util.*;

class jb_StringFunctions
{
 public static void main(String args[])
 {
  String s1,s2,s3;
  s1="Jammu and Kashmir state";
  int len;
  len=s1.length();  //length function of string
  s2=s1;            //string copy
  System.out.println("\n\tLength:"+len);
  System.out.println("\n\tEquated string:"+s2);
  s2=s1.substring(3,10);
  System.out.println("\n\ts2: "+s2);  // positionined letter at 3rd position to 10th position so  						 result= mu and
  s3=s1.substring(3);
  System.out.println("\n\ts3: "+s3);  
  s1=s2+" "+s3; //here even multiple strings can be used more than 2    //concat s2 and s3 in s1
  System.out.println(" "+s1);
  len=s1.length();                     //as s1 is overwritten so again taken length function
  System.out.println("\n\tLengthChanged:"+len);
  
  s1="whatever we want";
  
  
 }
}	

