package ro.fasttrackit.trainapp.exception;


import lombok.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class TrainControllerAdvice {
    @ExceptionHandler(EntityNotFoundExceptions.class)
    @ResponseStatus(BAD_REQUEST)
    ApiError handleEntityNotFoundException(EntityNotFoundExceptions ex) {
        return new ApiError(ex.getMessage());
    }
}

@Value
class ApiError {
    String message;
}
