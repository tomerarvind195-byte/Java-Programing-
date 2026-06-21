public class Throw {
    public static void main(String[] args){
        try{
            validateAge(age:15);

        }
        catch(Exception e){
            System.out.println("Exception caught: " + e.getMessage());

        }
    }
    public static void validateAge(int age){
        if(age < 18 ){
            throw new IllegalArgumentException(s: "Age must be 18 or older. ");
        }
        System.out.println(x:"Age is valid.");
    }
}