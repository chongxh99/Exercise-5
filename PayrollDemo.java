import java.util.Scanner;
public class PayrollDemo
{
   public static void main (String [] args)
   {
      
      Employee emp = new Employee();
      emp.input();
      Payroll payr = new Payroll(emp.grosspay, emp.statetax, emp.federaltax);
      payr.calculateNetPay();
      payr.printOutput();
   }
}

class Employee
{
   double id, grosspay, statetax, federaltax;
   public void input()
   {
      Scanner scan = new Scanner (System.in);
   
      System.out.print("Enter your employee ID : ");
      id = scan.nextDouble();
      System.out.print("Enter your gross pay : RM ");
      grosspay = scan.nextDouble();
      System.out.print("Enter your state tax : RM ");
      statetax = scan.nextDouble();
      System.out.print("Enter your federal tax : RM ");
      federaltax = scan.nextDouble();
   }
}

class Payroll
{
   private double grosspay, statetax, federaltax, netpay;
   
   public Payroll (double grosspay, double statetax, double federaltax)
   {
      this.grosspay = grosspay;
      this.statetax = statetax;
      this.federaltax = federaltax;
   }
   
   public double calculateNetPay()
   {
      netpay = grosspay - statetax - federaltax;
      return netpay;
   }
   
   public void printOutput()
   {
      System.out.printf ("%nYour net pay is : RM %.2f " , calculateNetPay());
   }
}

   