package Exp;

public class NoSolve extends Exception {
    public NoSolve() {
        super();
    }

    public NoSolve(String message) {
        super(message);
    }

    public NoSolve(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSolve(Throwable cause) {
        super(cause);
    }
}
