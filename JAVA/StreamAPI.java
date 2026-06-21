import java.util.*;

public class StreamAPI {
    public static void main (String [] args){
       Collection<String>  collection = new ArrayList<>();
       collection.add("First");
       collection.add("Second");
       collection.add("Third");
       collection.add("fourth");
       Iterator<String> itr = collection.iterator();
       String element= null;
       while(itr.hasNext()){
        element = itr.next();
        System.out.println(element);
        if(element.equals("Third")){
            itr.remove();
            System.out.println(" " );

        }
        System.out.println(collection);
       }

    }
    
}
