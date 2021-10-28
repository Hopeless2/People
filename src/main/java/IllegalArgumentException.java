public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String value) {
        super(String.format("Человек не может быть такого возраста, вы указали: " + value));
    }
}
