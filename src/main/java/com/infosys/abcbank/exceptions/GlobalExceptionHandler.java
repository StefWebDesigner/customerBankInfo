package com.infosys.abcbank.exceptions;

import com.infosys.abcbank.exceptions.exceptionClasses.DeleteCustomerException;
import com.infosys.abcbank.exceptions.exceptionClasses.UserExceptions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserExceptions.class)
    public ResponseEntity<String> UserExceptionsHandler(UserExceptions e){
        return ResponseEntity.ok(e.getMessage());
    }

    @ExceptionHandler(DeleteCustomerException.class)
    public ResponseEntity<String> DeleteCustomerHandler(DeleteCustomerException e){
        return ResponseEntity.ok(e.getMessage());
    }

}
