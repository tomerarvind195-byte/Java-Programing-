// How to work with DATES & TIMES using Java
// (LocalTime , LocalDateTime , UTC timestamp)

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args){

      LocalDateTime date1 = LocalDateTime.of(2025,1,1,0,0,0);
      LocalDateTime date2 = LocalDateTime.of(2025,1,1,0,0,0);
      if(date1.isBefore(date2)){
          System.out.println(date1 +" is earlier than " + date2);
      }
      else if(date1.isAfter(date2)){
          System.out.println(date1 +" is later than " + date2);

      }
      else if(date1.isEqual(date2)){
          System.out.println(date1 + " is equal than " + date2);
      }
    }
}
