import java.util.Scanner;

public class override {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string you want to print:");
        String l = scanner.nextLine();

        for (int i = 0; i < l.length(); i++) {
            System.out.println("Character: " + l.charAt(i));
        }
        System.out.println("String is :"+l);
        scanner.close();
    }
}
// class Animal{
//     void sound(){
//         System.out.println("Enter the animal sound");
//     }
//     void display(){
//         System.out.println("Enter the some thing about the animal: ");
//     }
// }
// class dog extends Animal{
//     @override
//     void sound(){
//         System.out.println("Dogs broks");

//     }
// }
// public class override{
//     public static void main(String[] args){
//         dog d= new dog();
//     d.sound();
//     d.display();
//     }
// }
