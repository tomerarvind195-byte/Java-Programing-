import java.util.Scanner;

class Exception {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Fist value :");
       int a= sc.nextInt();
        System.out.println("enter the second value :");
        int b= sc.nextInt();
        try{
            int result = a/b;
            System.out.println("Enter the result : "+ result);
            
        }
        catch (ArithmeticException e){
            System.out.println("Error: can not divide by zero");
            
        }
        finally {
            System.out.println("System is executed :");
        }
    }
}