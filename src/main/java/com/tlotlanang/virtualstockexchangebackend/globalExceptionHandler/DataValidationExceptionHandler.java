package com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerEmailPassExceptionDetails;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.exception.brokerEmailPassException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DataValidationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> inputDataExceptionhandler(MethodArgumentNotValidException exception) {
        Map<String, String> ErrorMap = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error -> {
            ErrorMap.put(error.getField(), error.getDefaultMessage());
        });
        return ErrorMap;
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Map<String,String>handleDateInputException(HttpMessageNotReadableException exception) {
        Map<String, String> ErrorMap = new HashMap<>();
        exception.getLocalizedMessage();
        ErrorMap.put("Date Of Birth", "Please Enter correct Date of Birth in this format:yyyy-MM-dd");
        return ErrorMap;
    }

    @ExceptionHandler(brokerEmailPassException.class)
    public ResponseEntity<Object> handlePasEmailMissmatch(brokerEmailPassException exception, WebRequest webRequest) {

        return new ResponseEntity<>(new BrokerEmailPassExceptionDetails(exception.getMessage(),
                HttpStatus.NOT_FOUND,
                LocalDateTime.now()),
                HttpStatus.NOT_FOUND);
    }

}
