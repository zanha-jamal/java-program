
/* Aim: Find the average of N positive integers, raising a user defined exception for each negative input.
 java code:
*/
import java.io.*;
import java.util.Scanner;
 class NegativeInputException  extends Exception  
{  
    public void show()  
    {  
      
      System.out.println("User Exception Catched:" );
       System.out.println("Enter the positive number only "); 
          
    }  
}

class Average
{
 public static void main(String arg[])
  {
    int sum=0,a,N;
    float avg=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the limit");
  N=sc.nextInt();
  try
   {
     for(int i=1;i<=N;i++)
      {
         System.out.print("Enter input number " + (i + 1) + ": ");
         a = sc.nextInt();
        if(a < 0 )
          throw new NegativeInputException();
        sum=sum+a;
       }
     avg=sum/N;
    System.out.println("The average of "+ N +" numbers :"+avg);
    }
   catch(NegativeInputException e)
      {
        e.show();  
      }

   }
}
 

/* Output:
 a>java Average
Enter the limit
4
Enter input number 2: 1
Enter input number 3: 2
Enter input number 4: 3
Enter input number 5: 4
The average of 4 numbers :2.0

C:\Users\junaid ansar\Desktop\ansar\java>java Average
Enter the limit
3
Enter input number 2: 1
Enter input number 3: -2
User Exception Catched:
Enter the positive number only
*/
