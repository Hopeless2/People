public class IllegalStateException extends Exception {
    public IllegalStateException(String value) {
        super(String.format("Недостаточно данных. " + value));
    }
}
