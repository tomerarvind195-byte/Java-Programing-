//ArrayList = A resizeable array that stores objects(autoboxing).
// Arrays are fixed in size, but ArrayLists can change.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
////        ArrayList<Double> list = new ArrayList<>();
////
////        list.add(3.14);
////        list.add(1.99);
////        list.add(2.01);
//
//          ArrayList<String> fruits = new ArrayList<>();
//            fruits.add("Apple");
//            fruits.add("Mango");
//            fruits.add("Orange");
//            fruits.add("Coconut");
//
////            fruits.remove(1);
////             fruits.set(0,"Pineapple");
////        System.out.println(fruits);
////        System.out.println(fruits.get(3));
////        System.out.println(fruits.size());
//
//        Collections.sort(fruits);
//
////        System.out.println(fruits);
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food yo would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1 ; i<= numOfFood ;i++){
            System.out.print("Enter food #" +i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        scanner.close();
    }

}
