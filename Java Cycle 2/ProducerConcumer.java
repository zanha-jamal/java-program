/*Aim:Producer/Consumer using ITC
 Java code:
*/

class SharedBuffer
{
  int number=0;
  boolean value = false;
  synchronized int get()
  {
    if (value==false)
       try
        {
          wait();
        }
       catch (InterruptedException e)
        {  
          System.out.println("InterruptedException caught");
        }
   System.out.println("consume: " + number);
   value=false;
   notify();
   return number;
  }
 synchronized void put(int number)
  {
    if (value==true)
      try {
         wait();
        }
     catch (InterruptedException e)
      { 
        System.out.println("InterruptedException caught");
      }
  this.number=number;
  System.out.println("Produce: " + number);
  value=true;
  notify();
}
}
class ProducerX extends Thread
{
  SharedBuffer pc;
  ProducerX(SharedBuffer pc)
   {
     this.pc=pc;
     this.start();
    }
  public void run()
  {
   int i=0;
   while(true)
    {
     pc.put(++i);
     Thread.sleep(5000);
     } 
   }
}

class ConsumerX extends Thread
 {
  SharedBuffer pc;
  ConsumerX(SharedBuffer pc)
  {
   this.pc=pc;
   this.start();
  }
   public void run()
  {
    while(true)
     {
       pc.get();
     }
   }
}

class ProducerConcumer
 {
   public static void main(String arg[])
    {
       SharedBuffer pc=new  SharedBuffer();
       ProducerX P=new ProducerX(pc);
       ConsumerX C=new ConsumerX(pc);
     }
  }
/*Output

>java ProducerConcumer
Produce: 1
consume: 1
Produce: 2
consume: 2
Produce: 3
consume: 3
Produce: 4
consume: 4
Produce: 5
consume: 5
Produce: 6
consume: 6
Produce: 7
consume: 7
Produce: 8
consume: 8
Produce: 9
consume: 9
Produce: 10
consume: 10
Produce: 11
consume: 11
Produce: 12
consume: 12
Produce: 13
consume: 13
Produce: 14
consume: 14
Produce: 15
consume: 15
Produce: 16
consume: 16
Produce: 17
consume: 17
Produce: 18
consume: 18
Produce: 19
consume: 19
Produce: 20
consume: 20
Produce: 21
consume: 21
Produce: 22
consume: 22
Produce: 23
consume: 23
Produce: 24
consume: 24
Produce: 25
consume: 25
Produce: 26
consume: 26
Produce: 27
consume: 27
Produce: 28
consume: 28
Produce: 29
consume: 29
Produce: 30
consume: 30
Produce: 31
consume: 31
Produce: 32
consume: 32
Produce: 33
consume: 33
Produce: 34
consume: 34
Produce: 35
consume: 35
Produce: 36
consume: 36
Produce: 37
consume: 37
Produce: 38
consume: 38
Produce: 39
consume: 39
Produce: 40
consume: 40
Produce: 41
consume: 41
Produce: 42
consume: 42
Produce: 43
consume: 43
Produce: 44
consume: 44
Produce: 45
consume: 45
Produce: 46
consume: 46
Produce: 47
consume: 47
Produce: 48
consume: 48
Produce: 49
consume: 49
Produce: 50
consume: 50
Produce: 51
consume: 51
Produce: 52
consume: 52
Produce: 53
consume: 53
Produce: 54
consume: 54
Produce: 55
consume: 55
Produce: 56
consume: 56
Produce: 57
consume: 57
Produce: 58
consume: 58
Produce: 59
consume: 59
Produce: 60
consume: 60
Produce: 61
consume: 61
Produce: 62
consume: 62
Produce: 63
consume: 63
Produce: 64
consume: 64
Produce: 65
consume: 65
Produce: 66
consume: 66
Produce: 67
consume: 67
Produce: 68
consume: 68
Produce: 69
consume: 69
Produce: 70
consume: 70
Produce: 71
consume: 71
Produce: 72
consume: 72
Produce: 73
consume: 73
Produce: 74
consume: 74
Produce: 75
consume: 75
Produce: 76 */
