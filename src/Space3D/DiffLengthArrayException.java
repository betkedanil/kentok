package Space3D;

public class DiffLengthArrayException extends Exception {
    public DiffLengthArrayException() {
        super("Diff length of arrays -- message");
    }

    public DiffLengthArrayException(String message) {
        super(message);
    }

    public DiffLengthArrayException(Throwable cause) {
        super(cause);
    }
}
