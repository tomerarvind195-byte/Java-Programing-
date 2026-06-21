// Wrapper classes = Allow primitive values (int, char,double, boolean)
// to be used as objects. "Wrap them in an object"
// generally , don.t wrap primitive unless you need
// Allows use of Collections Framework and static use
public class Main {
    public static void main (String[] args){
        // Autoboxing
//        String a = Integer.toString(123);
//        String b = Double.toString(3.14);
//        String c = Character.toString('$');
//        String d = Boolean.toString(false);
//
//        String x = a+b+c+d;
//
//        System.out.println(x);

        char letter = 'B';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));




    }
}
