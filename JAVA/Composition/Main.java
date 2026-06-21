//Composition = Represents a " part - of" relationship between objects.
// For example , an Engine is " Part of" a Car.
// Allows complex objects to be constructed form smaller

public class Main {
    public static void main(String[] args){
        Car car = new Car("Corvette", 2025,"V8" );

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}
