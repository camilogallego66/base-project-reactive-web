package com.example.baseproject.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ServerWebInputException;

@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    @ExceptionHandler(ServerWebInputException.class)
    ResponseEntity<String> postNotFound(ServerWebInputException ex) {
        log.error("handling exception::" + ex);
        log.error(ex.getMethodParameter().getParameterName());
        log.error(ex.getBody().getDetail());

        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
