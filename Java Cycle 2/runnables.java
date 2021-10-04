//Aim: Define 2 classes; one for generating Fibonacci numbers and
//other for displaying even numbers in a given range.
//Implement using threads. (Runnable Interface)

//java code:


import java.util.Scanner;
class Fibo implements Runnable
 {
  Thread t=new Thread(this,"Fibo");
  Fibo()
   {
     t.start();
   }
 public void run()
  { 
    try
    {
    
     int c=0,n1=0,n2=1,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("how many want to generate:");
      n=sc.nextInt();
     while(c<n)
     {
      System.out.println(n1);
      int s=n1+n2;
      n1=n2;
      n2=s;
      c=c+1;
      }
     }
     catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
 }

 
class Even implements Runnable
 {
   Thread t=new Thread(this,"Even");
   Even()
   {
     t.start();
   }
 public void run()
  { 
    try
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the starting range:");
     int s=sc.nextInt();
     System.out.println("Enter the ending range:");
     int e=sc.nextInt();
     System.out.println("the even numbers are:");
     for (int i=s;i<=e;i++)
      { 
       if(i%2==0)
       System.out.println(i);
       //Thread.sleep(3000);
      }
     }
     catch(Exception e)
      {
       System.out.println(e.toString());
      }
  }
 }
class runnables
{
 public static void main(String arg[])
  {
   new Fibo();
   new Even ();

  }
}
