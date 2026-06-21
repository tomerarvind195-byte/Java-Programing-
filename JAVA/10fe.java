//import java.util.Scanner;
//
//
//public class main {
//    public static void main(String[] args){
//          Scanner scanner = new Scanner(System.in);
//
//          double temp;
//          double newTemp;
//          String unit;
//
//          System.out.print("Enter the temperature:");
//          temp = scanner.nextDouble();
//
//          System.out.print("Convert to Celsius or Fahrenhit ? (C or F): ");
//          unit = scanner.next().toUpperCase();
//
//       // (condition ) true: false
//            newTemp = (unit.equals("C"))? (temp -32) * 5/9:(temp *5/9) + 32;
//
//          System.out.printf("%.1f %s", newTemp , unit);
//
//          scanner.close();
//    }
//}

// Enhansed switch = A replacement to many else if statements
//   (java 14 feature)

//import java.util.Scanner;
//public class main {
//    public static void main(String[] ags){
//
//        String day = " Monday";
//
//        if(day.equals("Monday")){
//            System.out.println("It is a weekday");
//
//        } else if (day.equals("Tuesday")) {
//            System.out.print("It is a weekday");
//
//        }else if(day.equals("Wednesday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Thrusday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Friday")){
//            System.out.println("It is a weekday");
//        }
//        else if(day.equals("Saturday")){
//            System.out.println("It is a weekend");
//        }
//        else if(day.equals("Sunday")){
//            System.out.println("It is a weekdend");
//        }
//        else{
//            System.out.println(day + " is not a day ");
//
//    }
//}}

//import java.util.Scanner;
//public class main {
//    public static void main(String[] args){
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the day of the week:");
//        String day = scanner.nextLine();
//
//        switch (day) {
//            case "Monday" ,"Tuesday" , "Wednesday" , "Thursday" ,"Friday"->
//                System.out.println("It is a weekday");
//            case "Saturday" , "Sunday"->
//                System.out.println("It is a weekend");
//            default -> System.out.println(day + " is not a day");
//        }
//    }
//}


//import java.util.Scanner;
//public class main{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean validOperation = true;
//
//        System.out.print("Enter the first number:");
//        num1 = scanner.nextDouble();
//
//        System.out.print("Enter an operator(+,-,*,/,^) ");
//        operator = scanner.next().charAt(0);
//
//        System.out.print("Enter the second number:");
//        num2 = scanner.nextDouble();
//
//        switch (operator) {
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if (num2 == 0) {
//                    System.out.println("Cannot divide by zero!");
//                    validOperation = false;
//                } else {
//                    result = num1 / num2;
//                }
//            }
//            case '^' -> result = Math.pow(num1, num2);
//            default -> {
//                System.out.println("Invalid operator");
//                validOperation = false;
//            }
//        }
//        if (validOperation) {
//            System.out.println(result);
//            scanner.close();
//        }
//    }
//}
//


//Logical operations
//
//import java.util.Scanner;
//public class main{
//    public static void main(String[] args) {
////        double temp = 20;
////        boolean isSunny = false;
////
////        if (temp <= 30 && temp >= 0 && isSunny) {
////            System.out.println("The weather is GOOD ");
////            System.out.println("It is SUNNY outside ");
////        } else if (temp <= 30 && temp >= 0 && !isSunny) {
////
////            System.out.println("The weather is GOOD ");
////            System.out.println("It is CLOUDY outside ");
////        }
//
//        Scanner scanner = new Scanner(System.in);
//        String username;
//        System.out.print("Enter your new username: ");
//        username = scanner.nextLine();
//
//        if(username.length() < 4 || username.length() > 12 ){
//            System.out.println("Username must be between 4 - 12 characters");
//        }
//        else if(username.contains(" ") || username.contains ("_")){
//            System.out.println("Username must not contain spaces or underscores");
//        }
//        else {
//            System.out.print("Welcome " +username);
//        }
//
//        scanner.close();
//    }
//}

//while loop = repeat some code forever
//        while some condition remains true

//import java.util.Scanner;
//public class main{
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
////        String response  = "";
////        while(name.isEmpty()){
////            System.out.print("Enter your name: ");
////            name = scanner.nextLine();
////        }
////        System.out.println("Hello " + name);
//
////        while(!response.equals("Q")){
////            System.out.println("You are playing a game ");
////            System.out.print("Press Q to quit: ");
////            response = scanner.next().toUpperCase();
////        }
////        System.out.println("you have quit the game ");
//
//        int age = 0;
//
//        do{
//            System.out.println("Your age can't be negative ");
//            System.out.print("Enter your age : ");
//            age = scanner.nextInt();
//
//        } while(age <0);
//            System.out.println("You are " + age + " years old");
//
//
//        scanner.close();
//    }
//}


// GASSING GAME

//import java.util.Random;
//import java.util.Scanner;
//public class main{
//    public static void main(String[] args){
//
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int guess;
//        int attempts = 0;
//        int min = 1;
//        int max = 100;
//        int randomNumber = random.nextInt(min, max +1);
//
//        System.out.println("Number Guessing game");
//        System.out.printf("Guess a number between %d-%d\n", min ,max);
//
//        do{
//            System.out.print("Enter a guess: ");
//            guess = scanner.nextInt();
//            attempts++;
//
//            if(guess < randomNumber){
//                System.out.println("TOO LOW! Try again");
//            }else if(guess > randomNumber){
//                System.out.println("TOO HIGH! Try again ");
//            }
//            else{
//                System.out.println("CORRECT! The number was " + randomNumber);
//                System.out.println("# of attempts: " + attempts);
//            }
//        }while(guess != randomNumber);
//        scanner.close();
//
//
//    }
//}

//import java.util.Scanner;
//public class main{
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 0; i < max; i++){
//           System.out.println(i);
//        }
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//public class main{
//    public static void main(String[] args) throws InterruptedException {
//
//        // for loop = execute some code a CERTAIN amount of times
//
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.println("How many seconds to countdown from?: ");
//       int start = scanner.nextInt();
//
//       for(int i = start; i > 0; i--){
//           System.out.println(i);
//           Thread.sleep(1000);
//
//       }
//        System.out.println("HAPPY NEW YEAR!");
//    }
//}

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
   // method = a block of reusable code that is executed when called()

        String name = "Arvind";
        int age = 25;

        happyBirthday(name ,age);

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to You !");
        System.out.printf("Happy Birthday dear %s!\n" , name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to You !\n");
    }

}