package com.mycityaz.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mycityaz.exception.NoSuchIdFound;

@RestControllerAdvice
public class ProductsAdvice {

	@ExceptionHandler(NoSuchIdFound.class)
	public ResponseEntity<String> handleEmptyInput(NoSuchIdFound noSuchIdFound) {
		return new ResponseEntity<String>("No Such ID Exists in Data Base", HttpStatus.BAD_REQUEST);
	}
}
