import java.util.Scanner;
   public static void main(String[] args);
   
   {
      Scanner sc = new Scanner(System.in);
      int []x = new int [10];
      for(int i=0;i<x.length;i++){
         x[i]=sc.nextInt();
      }
      System.out.println("Array Values: ");
      for(int i = 0; i<x.length;i++){
        System.out.print("\n Array Values: ");
        for(int item:x)
        {
            System.out.print(item+"  ");



        }
    
   }
}