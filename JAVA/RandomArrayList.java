import java.util.*;
public class RandomArrayList {
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i=0; i<10;i++){
            numbers.add(rand.nextInt(100));

        }
        System.out.println("Original List: "+ numbers);
        int searchtarget = numbers.get(0);
        int index = numbers.indexOf(searchtarget);
        System.out.println("Element "+ searchtarget+ " found at index : " +index );
        numbers.remove(Integer.valueOf(searchtarget));
        System.out.println("After Remove the element :"+numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list :" + numbers);


    }
    
}
