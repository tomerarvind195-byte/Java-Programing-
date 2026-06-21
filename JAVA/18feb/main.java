//public class main {
//    public static void main(String[] args){
//
//        Student student1 = new Student("Spongebob", 30,3.2);
//        Student student2 = new Student("Partick", 34,1.5);
//        Student student3 = new Student("Sandy", 27,4.0);
//
//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//        System.out.println(student1.isEnrolled);
//
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//        System.out.println(student2.isEnrolled);
//
//        System.out.println(student3.name);
//        System.out.println(student3.age);
//        System.out.println(student3.gpa);
//        System.out.println(student3.isEnrolled);
//    }
//}



//public class main{
//    public static void main(String[] args){
//
//        User user1 = new User("Spongebob");
//        User user2 = new User("Patrick","PStar@aol.com");
//        User user3 = new User("Sandy","SCeeks@gmail.com");
//
//
//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//
//
//        System.out.println(user2.username);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//
//
//        System.out.println(user3.username);
//        System.out.println(user3.email);
//        System.out.println(user3.age);
//    }
//}

//public class main{
//    public static void main(String[] args){
//
//
//        Car[] cars ={new Car("Mustang", "red"),
//                     new Car("Corvette", "blue"),
//                      new Car("Charger", "Yellow")};
//
//
//
//       for(Car car : cars){
//           car.color = "black";
//        }
//
//       for(Car car : cars){
//           car.drive();
//        }
//    }
//}

// static = Makes a variable or method belong to the class
// rather than to any specific object .
// Commonly used for utility methods or shared resources.

//public class main{
//    public static void main(String[] args){
//
//        Friend friend1 = new Friend("Spongebob");
//        Friend friend2 = new Friend("Patrick");
//        Friend friend3 = new Friend("Squidward");
//        Friend friend4 = new Friend("Sandy");
//
//        System.out.println(Friend.numofFriends);
//        Friend.showFriends();;
//
//    }
//}

// Inheritance = one class inherits the attributes and methods
// form another class.
//   Child <- Parent  <- Grandparent

//public class main {
//    public static void main(String[] args){
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Plant plant = new Plant();
//
//
//        System.out.println(dog.isAlive);
//        System.out.println(cat.isAlive);
//        System.out.println(plant.isAlive);
//        plant.photosynthesize();
//
//
//    }
//}


//super = Refers to the parent class (subclass <- superclass)
// Used in constructors and method overriding
// Calls the parent constructor to initialize attributes
//

//public class main{
//    public static void main(String[] args){
//
//      Person person = new Person("Tom", "Riddle");
//      Student student = new Student("Harry", "Potter", 3.25);
//      Employee employee = new Employee("Rubeus", "Hagrid", 50000);
//
//      employee.showSalary();
//    }
//}

//Method overriding = When a subclass provides its own
// implementation of a method that is already defined
// Allows for code reusability and give specific implementations.


//public class main{
//    public static void main(String[] args){
//
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();
//
//        dog.move();
//        cat.move();
//        fish.move();
//
//    }
//}

// .toString() = Method inherited form the object class.
//  used to return a string representation of an object.
// by default , it returns a hash code as a unique identifier.
// It can be overridden to provide meaningful details.

//public class main{
//    public static void main(String[] args){
//
//      Car car1 = new Car("Ford", "Mustang", 2025, "Red");
//      Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");
//
//      System.out.println(car1);
//      System.out.println(car2);
//
//    }
//}

//abstract = Used to define abstract classes and methods .
// Abstraction is the process of hiding implementation details
// and showing only the essential features ;
// Abstract classes CAN'T  be instantiated directly
// Can contain 'abstract' methods (which must be implemented)
// can contain 'concrete' methods (which are inherited)

public class main{
    public static void main(String[] args){

      Circle circle = new Circle(3);
      Triangle triangle = new Triangle(4,5);
      Rectangle rectangle = new Rectangle(6,7);

      System.out.println(circle.area());
      System.out.println(triangle.area());
      System.out.println(rectangle.area());

    }
}