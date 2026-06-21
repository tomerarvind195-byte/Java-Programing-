import java.util.*;
public class collection {
    public static void main (String[] args){
        List <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("orange");
        list.add("mango");
        System.out.println("Current List :");
        for(String fruit : list)
        System.out.println(fruit + " ");
        boolean found = list.contains("Banana");
        System.out.println("\n Banana in list ?"+ found);
        Collections.sort(list);
        System.out.println("Sorted List :" +list);
        list.remove("Banana");
        System.out.println("After deletion List :"+list);
        

    }
    
}
