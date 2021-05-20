import java.util.Scanner;
abstract class Employee
   {
     String name;
     int age;
     int sal;
     String Designation;
     
     Scanner sc=new Scanner(System.in);

      public void create()
         {
           
        System.out.println("Enter your name:");
         name=sc.next();
        System.out.println("Enter your age:");
         age=sc.nextInt();
         }
     
       public abstract void raiseSal();

        public void display()
         {
         System.out.println("Name:"+this.name);
         System.out.println("Age:"+this.age);
         System.out.println("Sal:"+this.sal);
        System.out.println("Job:"+this.Designation);
         }
         
     }
final class Clerk extends Employee
{
    
     Clerk()
     {
      sal=20000;
      Designation="Clerk";
     }    
  
    public void raiseSal()
     {
        sal=sal+(sal*10)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 10%");
          super.sal=sal;
      }
  }   
 final class Manager extends Employee
{
      
      Manager()
       {
       sal=50000;
        Designation="Manager";
      }
    public void raiseSal()
     {
        sal=sal+(sal*20)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 20%");
            super.sal=sal;
      }
  } 
final class Programmer extends Employee
{
   Programmer()
      {
        sal=100000;
        Designation="Programmer";
      }
   
    public void raiseSal()
     {
        sal=sal+(sal*25)/100;
         System.out.println("sal:"+sal);
         System.out.println("Salary raised by 25%");
         super.sal=sal;
      }
  }

