import java.io.*;
import java.util.Scanner;

class Employee  {
    String Empid,Name;
    int Salary;
    String Address;

    Employee() {
        Empid = " ";
        Name = " ";
        Address = " ";
        Salary = 0;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Empid:");
        Empid = sc.nextLine();
        System.out.println("Enter Name:");
        Name = sc.nextLine();
        System.out.println("Address:");
        Address = sc.nextLine();
        System.out.println("Enter Salary:");
        Salary = sc.nextInt();
    }

    void display() {
        System.out.println("Empid " + Empid);
        System.out.println("Name " + Name);
        System.out.println("Address " + Address);
        System.out.println("Salary " + Salary);
    }
}

class Teacher extends Employee {
    String Dept;
    String Subj;
    
    Teacher() {
        Dept = " ";
        Subj = " ";
        
    }

    void read() {
        super.read();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Department Name:");
        Dept = sc.nextLine();
        System.out.println("Enter Subject:");
        Subj = sc.nextLine();
        
    }

    void display() {
        super.display();
        System.out.println("Department " + Dept);
        System.out.println("Subject " + Subj);
        
    }
}

class Q10_Employee {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of teacher details: ");
        int n = s.nextInt();
        Teacher t[] = new Teacher[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Teacher();
            t[i].read();
        }
        for (int j = 0; j < n; j++) {
            t[j].display();
        }
    }
}