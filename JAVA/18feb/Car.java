//public class Car {
//  String make = "Ford";
//  String model = "Mustang";
//  int year = 1025;
//  double prince = 58000.99;
//  boolean isRunning = false;
//
//  void start(){
//      isRunning = true;
//      System.out.println("You start the engine");
//
//  }
//  void stop(){
//      isRunning = false;
//      System.out.println("You stop the engine");
//  }
//  void drive(){
//      System.out.println("You drive the  " +model);
//
//  }
//  void brake(){
//      System.out.println("You brake the " +model);
//  }
//}


//public class Car{
//     String model;
//     String color;
//
//     Car(String model,String color){
//         this.model = model;
//         this.color = color;
//
//     }
//
//     void drive(){
//         System.out.println("You drive the " + this.color + " " + this.model);
//     }
//
//}


// .toString()
public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model , int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){
        return this.color + " " + this.year + " " +this.make + " " + this.model;
    }

}
