// Anonymous class = A class that doesn't have a name . Cannot be reused .
// Add custom behavior without having to create a new class .
// Often used for one time uses (TimerTask , Runnable , Callbacks)

public class Main {
    public static void main(String[] args){

       Dog dog = new Dog();
       TalkingDog talkingDog = new TalkingDog();


       dog.speak();
       talkingDog.speak();
}  }




