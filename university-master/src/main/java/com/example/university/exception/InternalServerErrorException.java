package com.example.university.exception;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class InternalServerErrorException extends RuntimeException{

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> internalServerErrorException(Exception ex,
                                                               HttpServletRequest request,
                                                               HttpServletResponse response) {
        if (ex instanceof NullPointerException) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}