package com.tma.sale.controller;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.tma.sale.exception.CustomException;

@RestControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(value = {ConstraintViolationException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public CustomException constraintViolationException(ConstraintViolationException ex) {
		return new CustomException(400, ex.getMessage());
	}
	
	@ExceptionHandler(value = {NoHandlerFoundException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public CustomException noHandlerFoundException(Exception ex) {
		return new CustomException(404, ex.getMessage());
	}

}
