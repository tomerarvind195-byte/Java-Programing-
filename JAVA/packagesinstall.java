import java.util.Scanner;

public class packagesinstall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int a = scanner.nextInt();
        scanner.nextLine(); 

        if (a >= 18) {
            System.out.println("Enter your ID (Aadhar/Pancard):");
            String id = scanner.nextLine().toLowerCase();

            if (id.equals("aadhar")) {
                System.out.println("You are eligible for vote");
            } else if (id.equals("pancard")) {
                System.out.println("You are eligible for vote");
            } else {
                System.out.println("You are not eligible for vote");
            }

        } else {
            System.out.println("You are not eligible for vote");
        }

        scanner.close();
    }
}