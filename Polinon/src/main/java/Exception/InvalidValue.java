package Exception;

public class InvalidValue extends Exception {
    public InvalidValue() {
        super();
    }

    public InvalidValue(String message) {
        super(message);
    }

    public InvalidValue(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidValue(Throwable cause) {
        super(cause);
    }
}
