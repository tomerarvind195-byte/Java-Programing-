public class Car {

    String model;
    int year;
    Engine engine;


    Car(String model , int year , String Type){
        this.model = model;
        this.year = year;
        this.engine = new Engine(Type);

    }
    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " is running ");
    }


}
