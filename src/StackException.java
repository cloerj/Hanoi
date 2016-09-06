public class StackException extends Exception {
    public StackException(){
        super("Dude. You broke it...");
    }
    public StackException(String message){
        super(message);
    }
}