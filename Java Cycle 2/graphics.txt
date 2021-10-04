Aim:Create an Arithmetic package that has classes and interfaces for the 4 basic
arithmeticoperations. Test the package by implementing all operations on two
given numbers

java main code:

import graphics.*;
class FigureTest
{
public static void main(String args[])
{
 Circle c=new Circle();
 c.area(6,0);
 Rectangle r=new Rectangle();
 r.area(5,6);
 Triangle t=new  Triangle();
 t.area(5,6);
 square s=new square();
 s.area(3,0);
}
}

graphics packages:


package graphics;
 interface figures
  {
     void area(float x,float y);

   }

public class Circle implements figures
{
public void area(float x,float y)
  {
  System.out.println("The area of a circle:"+(3.14f*x*x));
  }
}

package graphics;
 interface figures
  {
    public void area(float x,float y);

   }

public class Rectangle implements figures
{ 

 public void area(float x,float y)
  {
  System.out.println("The area of a rectangle:"+(x*y));
  }
}


package graphics;
 interface figures
  {
    void area(float x,float y);

   }

public class square implements figures
{
 
public void area(float x,float y)
  {
  System.out.println("The area of a square:"+(x*x));
  }
}


package graphics;
interface figures
  {
        void area(float x,float y);

   }

public class Triangle implements figures
{

 public void area(float x,float y)
  {
  System.out.println("The area of a rectangle:"+(0.5*x*y));
  }
}



output:
>java FigureTest
The area of a circle:113.04
The area of a rectangle:30.0
The area of a rectangle:15.0
The area of a square:9.0
