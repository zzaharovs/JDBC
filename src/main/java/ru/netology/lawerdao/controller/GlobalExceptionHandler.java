package ru.netology.lawerdao.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleEmptyException(EmptyResultDataAccessException ex) {

        return new ResponseEntity<String>("Result not found", HttpStatus.NOT_FOUND);

    }

}
