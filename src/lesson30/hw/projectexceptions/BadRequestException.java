package lesson30.hw.projectexceptions;

public class BadRequestException extends Exception {

    public BadRequestException(String message) {
        super(message);
    }
}
