//public class Student {
//
//    String name;
//    int age;
//    double gpa;
//    boolean isEnrolled;
//
//    Student(String name, int age, double gpa){
//        this.name = name;
//        this.age = age;
//        this.gpa = gpa;
//        this.isEnrolled = true;
//
//    }
//    void study(){
//        System.out.println(this.name + " is studying");
//    }
//}


public class Student extends Person{

    double gpa;

    Student(String first , String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
