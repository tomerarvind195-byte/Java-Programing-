import java.util.Scanner;
class A8 
{
  public static void main(String ar[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter 1st Value :");
      int a =sc.nextInt();
      System.out.print("Enter 2nd Value :");
      int b =sc.nextInt();
      if(a>b)
      {
       System.out.println("A");
       System.out.println("B");
       System.out.println("C");
       }
       else
       {
       System.out.println("X");
       System.out.println("Y");
       System.out.println("Z");
       }
       System.out.println("End");
  }
}