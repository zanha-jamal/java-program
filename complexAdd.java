import java.util.Scanner;
class complex
{
 int real,img;
 Scanner sc=new Scanner(System.in);
 void read()
 {
   System.out.println("Enter the real part:");
   this.real=sc.nextInt();
   System.out.println("Enter the imaginary part:");
   this.img=sc.nextInt();
 }
 void display()
 {
  System.out.println("the complex number: "+this.real+"+"+this.img+"i");
 }
 void add(complex c1,complex c2)
  {
   real=c1.real+c2.real;
   img=c1.img+c2.img;
   System.out.println("The sum of complex number is: "+real+"+"+img+"i");
  }
}
class complexAdd
{
  public static void main(String arg[])
  {
    complex c1=new complex();
    complex c2=new complex();
    complex c3=new complex();
    c1.read();
    c1.display();
    c2.read();
    c2.display();
    c3.add(c1,c2);
  }
}
