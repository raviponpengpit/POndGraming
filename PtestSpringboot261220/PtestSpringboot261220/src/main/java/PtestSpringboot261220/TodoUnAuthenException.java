package PtestSpringboot261220;

public class TodoUnAuthenException extends RuntimeException {

    public TodoUnAuthenException() {
        super("Tokem Invalid");
    }

}
