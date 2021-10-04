/*Aim:Program to list the sub directories and files in a given directory and also search for a file name.
Java code:
*/
import java.util.*;
import java.io.*;
class fileDetails
{
  public static void main(String args[])
   {
    File f1=new File("C:\\Users\\junaid ansar\\Desktop\\ansar\\java\\packages");
    if (f1.isDirectory())
     {
       System.out.println("Details of :"+f1.getAbsolutePath());
       String s[]=f1.list();
       System.out.println("Total No.of files :"+s.length);
       for(int i=0;i<s.length;i++)
        {
           File f2=new File("C:\\Users\\junaid ansar\\Desktop\\ansar\\java\\packages"+"\\"+s[i]);
           if (f2.isDirectory())
               System.out.println(s[i]+"is a directory "); 
           else
             System.out.println(s[i]+" is a file"); 
         }
       }
     else
       System.out.println("C:\\Users\\junaid ansar\\Desktop\\ansar\\java\\packages"+" is not a directory");
     System.out.println(" enter a file name : ");
     Scanner sc=new Scanner(System.in);
     String fname=sc.nextLine();
     String filelist[]=f1.list();
     boolean found=false;
     for(int i=0;i<filelist.length;i++)
      {
        File f2=new File("C:\\Users\\junaid ansar\\Desktop\\ansar\\java\\packages"+"//"+filelist[i]);
        if (fname.equals(f2.getName()))
        {
          System.out.println(fname+"exists....I found it ");
          found=true;
          break;
         }       
       }
     if (!found)
       System.out.println(" File does not exist"); 
}
}
/* output:
>java fileDetails
Details of :C:\Users\junaid ansar\Desktop\ansar\java\packages
Total No.of files :6
Arithmeticis a directory
FigureTest.java is a file
graphicsis a directory
graphics.java is a file
TestArithmetic.class is a file
TestArithmetic.java is a file
 enter a file name :
Action.java
 File does not exist  */
