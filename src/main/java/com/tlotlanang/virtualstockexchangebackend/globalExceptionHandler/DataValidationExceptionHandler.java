package com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler;

//import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerEmailPassExceptionDetails;
//import com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler.exception.EmailPassException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import tools.jackson.databind.exc.InvalidFormatException;

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



    @RestControllerAdvice
    public class GlobalExceptionHandler {

        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(HttpMessageNotReadableException.class)
        public Map<String, String> handleHttpMessageNotReadable(HttpMessageNotReadableException exception) {
            Map<String, String> errorMap = new HashMap<>();
            Throwable cause = exception.getCause();

            // 1. Handle specific field value parsing errors (Dates, Numbers, Enums)
            if (cause instanceof InvalidFormatException) {
                InvalidFormatException formatException = (InvalidFormatException) cause;

                // Dynamically extract the exact field name that failed
                String fieldName = formatException.getPath().isEmpty() ? "unknown" : formatException.getPath().get(0).getPropertyName();
                String rejectedValue = formatException.getValue() != null ? formatException.getValue().toString() : "null";
                String targetType = formatException.getTargetType() != null ? formatException.getTargetType().getSimpleName() : "unknown";

                errorMap.put("error", "Invalid Date format");
                errorMap.put("field", fieldName);
                errorMap.put("rejectedValue", rejectedValue);
                errorMap.put("message", String.format("Could not parse value '%s' into expected type '%s'.",
                        rejectedValue, targetType) + "Correct format: YYYY-MM-DD");
                return errorMap;
            }

            // 2. Fallback for structural JSON issues (missing commas, broken brackets, empty body)
            errorMap.put("error", "Malformed HTTP request");
            errorMap.put("message", "The incoming HTTP request body is empty or contains invalid JSON syntax.");
            return errorMap;
        }
    }



/*
    @ExceptionHandler(EmailPassException.class)
    public ResponseEntity<Object> handlePasEmailMissmatch(EmailPassException exception, WebRequest webRequest) {

        return new ResponseEntity<>(new BrokerEmailPassExceptionDetails(exception.getMessage()), HttpStatus.NOT_FOUND);

    }

 */

}
