package Exceptions;

public class UncorrectedData extends Exception {
    public UncorrectedData() {
        super();
    }

    public UncorrectedData(String message) {
        super(message);
    }

    public UncorrectedData(String message, Throwable cause) {
        super(message, cause);
    }

    public UncorrectedData(Throwable cause) {
        super(cause);
    }

}
