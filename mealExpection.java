public class mealException extends Exception {
    public mealException(String message) {
        super(message);
    }
    
    public mealException(String message, Throwable cause) {
        super(message, cause);
    }
}
