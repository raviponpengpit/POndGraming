package PtestSpringboot261220;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice //connect this functin with controller
public class TodoExceptionAdvice {

    @ResponseBody() // map to body in postman
    @ExceptionHandler(TodoNotFoundException.class) //mapping exception with this class
    @ResponseStatus(HttpStatus.NOT_FOUND)
        //want status 404
    String todoNotFound(TodoNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody() // map to body in postman
    @ExceptionHandler(TodoUnAuthenException.class) //mapping exception with this class
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
        //want status 401
    String todoNotFound(TodoUnAuthenException ex) {
        return ex.getMessage();
    }

}