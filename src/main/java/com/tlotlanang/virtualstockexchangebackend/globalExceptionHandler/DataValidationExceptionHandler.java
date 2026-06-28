package com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DataValidationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String>handleInvalidData(MethodArgumentNotValidException exception) {
        Map<String, String> ErrorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error -> {
            ErrorMap.put(error.getField(), error.getDefaultMessage());
        });
        return ErrorMap;
    }
}
