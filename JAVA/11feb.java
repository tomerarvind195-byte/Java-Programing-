//public class main{
//    public static void main(String[] args){
//         // mehtod = a block of reusable code that is executed when called ()
//        int age =12;
//        if(ageCheck(age)){
//            System.out.println("You may sign up ");
//
//        }
//        else {
//            System.out.println("You must be 18+ to sign up");
//        }
//    }
//    static void happyBirthday(String name, int age){}
//    static double squre(double number){ return number * number;}
//    static double cube(double number){return number * number * number;}
//    static String getFullName(String first , String last){ return first + " " + last;}
//    static boolean ageCheck(int age){" "}
//
//}

// overloaded methods = methods that since the same name ,
//                 but different paraneters
//                 signature = name + parameters

//public class main{
//    public static void main(String[] args) {
////        System.out.println(add(1,2,3));
////    }
////    static double add(double a , double b){
////        return a+b;
////    }
////    static double add(double a , double b, double c){
////        return a+b+c;
////    }
//String pizza = bakePizza("flat bread", "mozzarella","pepperoni");
// System.out.println(pizza);
//
//
//    }
//    static String bakePizza(String bread){
//     return bread + " pizza";
//    }
//    static String bakePizza(String bread, String cheese){
//     return cheese + " "  + bread + " pizza";
//    }
//    static String bakePizza(String bread, String cheese, String topping){
//     return topping + " " +cheese + " "  + bread + " pizza";
//    }
//
//import java.util.Scanner;
//
//public class main{
//    static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args){
//
//        double balance = 0;
//        boolean isRunning = true;
//        int choice;
//        while(isRunning) {
//            //Java Banking Program for Beginners
//            System.out.println("*************");
//            System.out.println("BANKING PROGRAM");
//            System.out.println("*************");
//            System.out.println("1. Show Balance");
//            System.out.println("2. Deposit");
//            System.out.println("3. Withdraw");
//            System.out.println("4. Exit");
//            System.out.println("*************");
//
//            System.out.print("Enter your choice (1-4): ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 -> System.out.println("SHOW BALANCE");
//                case 2 ->balance += deposit();
//                case 3 -> System.out.println("WITHDRAW");
//                case 4 -> isRunning = false;
//                default -> System.out.println("INVALID CHOICE");
//
//            }
//        }
//
//
//        // DECLARE VARIABLES
//        // DISPLAY MENU
//        // SET AND PROCESS USERS CHOICE
//        // SHOW BALANCE()
//        // DEPOSIT()
//        // WITHDROW()
//        //EXIT MESSAGE
//
//        scanner.close();
//     }
//     static void showBalance(double balance){
//         System.out.println("***********");
//         System.out.printf("$%.2f\n" ,balance);
//   }
//    static double deposit(){
//        double amount;
//        System.out.print("Enter an amount to be deposited: ");
//        amount = scanner.nextDouble();
//        if(amount <0){
//            System.out.println("Amount can.t be negative ");
//            return 0;
//        }
//        else{
//            return amount;
//        }
//   }
//}

//import java.util.Scanner;
//import java.util.Random;
//public class main {
//    static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int numOfDice;
//        int total = 0;
//
//        System.out.print("Enter  the  # of dice to roll: ");
//        numOfDice = scanner.nextInt();
//        Random random = new Random();
//
//        if(numOfDice > 0){
//            for(int i= 0; i < numOfDice; i++){
//                int roll = random.nextInt(1,7);
//                System.out.println("You rolled: " + roll);
//                total = total + roll ;
//            }
//            System.out.println("Total: " + total);
//        }
//        else{
//            System.out.println("# of dic must be greater than 0");
//        }
//    scanner.close();
//    }
//
//}

// array
//import java.util.Arrays;
//public class main{
//    public static void main(String[] args){
//        String[] fruits = {"apple", "orange", "banana", "coconut"};
//
//        //fruits[0] = "pinapple";
//        //int numOfFruits = fruits.length;
//
////        for(int i = 0; i< fruits.length ; i++){
////            System.out.println(fruits[i]);
////        }
//       // Arrays.sort(fruits);
//     //   for(String fruit : fruits){
////            System.out.println(fruit);
////        }
//     }
//}

//import java.util.Scanner;
//public class main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String[]  foods;
//        int size;
//
//        System.out.print("What # of food do you want? : ");
//        size = scanner.nextInt();
//
//        foods = new String[size];
//        for(int i = 0; i< foods.length; i++){
//            System.out.print("Enter a food: ");
//            foods[i] = scanner.nextLine();
//
//        }
//        for(String food : foods){
//            System.out.println(food);
//        }
//    }
//}


// Searching the element in the array

//public class main{
//    public static void main(String[] args){
//
//        int[] numbers = {1,9,6,5,2,49,7,};
//        int target = 4;
//        boolean isFound = false;
//
//        for(int i = 0 ; i< numbers.length; i++){
//            if(target == numbers[i]){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//
//
//
//
//        }
//        if(!isFound){
//            System.out.println("Element not found in the array");
//    }
//}}

//2D array = an array where each element is an array
//using for storing a matrix of data

public class main{
    public static void main(String[] args){


        String[][] groceries = {{"apple","orange","banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken","pork", "beef", "fish"}};

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
