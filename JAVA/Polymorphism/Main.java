// Polymorphism = " POLY" = "MANY"
// "MORPH" = "SHAPE"
// objects can identify as other objects.
// object can be treated as objects of a common superclass.

public class Main {
    public static void main(String[] args){


   Car car= new Car();
   Bike bike = new Bike();
   Boat boat = new Boat();

    Vehicle[] vehicles= {car , bike , boat};

    for(Vehicle vehicle : vehicles){
        vehicle.go();
    }
    }
}
