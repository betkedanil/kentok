package Exceptions;

public class ArgumentOutside extends Exception {
    public ArgumentOutside() {
        super();
    }

    public ArgumentOutside(String message) {
        super(message);
    }

    public ArgumentOutside(String message, Throwable cause) {
        super(message, cause);
    }

    public ArgumentOutside(Throwable cause) {
        super(cause);
    }

}
