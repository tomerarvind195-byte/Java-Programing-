//object = An entity that holds data (attributes)
//    and can perform actions (methods)
//    It is a reference data type

import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make +" " + car1.model);
        System.out.println(car2.make +" " + car2.model);


    }
}

