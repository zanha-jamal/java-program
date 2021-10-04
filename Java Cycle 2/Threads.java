//Aim:Define 2 classes,one for generating multiplication table of 5 andother for displaying first N prime numbers.
//Implement using threads. (Thread class)

//Java code:

import java.util.Scanner;
class MultiplicationTable extends Thread
{
  MultiplicationTable()
   {
     start();
   }
 public void run()
  { 
    try
    {
     System.out.println("Multiplication table of 5:");
     for (int i=1;i<=10;i++)
      { 
       System.out.println(i+" * 5 ="+i*5);
       Thread.sleep(5000);
      }
     }
     catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
}
class Prime extends Thread
{
  Prime()
  {
   start();
  }
  public void run()
  {
   try
    {
     int count=0,i,flag=0,num,N;
     System.out.println("Enther the limit:");
     Scanner sc=new Scanner(System.in);
     N=sc.nextInt();
     System.out.println("First "+N+" prime numbers are :-");
     for(num=2;count<N;num++)
     {
       flag=1;
      for(i=2;i<=num/2;i++)
       {
        if(num%i==0)
         {
          flag=0;
          break;
         }
       }
      if(flag==1)
       {
         System.out.println(num);
         count++;
       }
     } 
    }
   catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
}
class Threads
{
 public static void main(String arg[])
  {
   new MultiplicationTable();
   new Prime();

  }
}
