//// Generics = A concept where you can write a class , interface , or methods
//// that is compatible with different data types
//// <T> type parameter (placeholder that gets replaced with
//// <string> type argument (specifies the type )
//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args){
//
////    ArrayList<String> fruits = new ArrayList<>();
////
////    fruits.add("apple");
////    fruits.add("orange");
////    fruits.add("banana");
//
//        Box<String> box = new Box<>();
//
//        box.setItem("banana");
//
//        System.out.println(box.getItem());
//    }
//}

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Product<String , Double> product1 = new Product<>("apple",0.50);
        Product<String , Integer> product2 = new Product<>("ticket",15);

        System.out.println(product2.getItem());

    }
}
