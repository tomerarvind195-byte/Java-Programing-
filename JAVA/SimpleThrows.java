public class SimpleThrows {
    public static void main(String[] args){

        int a = 10;

        try{
            divide(a);
        }
        catch(ArithmaticException e){
              System.out.println("Arithmatic Exception Occurn " + e.fillInStackTrace());

        }
    }

    static int divide(int a) throws ArithmaticException{
        return a/0;
    }
}