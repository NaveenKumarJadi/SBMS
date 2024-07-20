package com.naveen.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handlerAE(ArithmeticException ae){
		
		ExceptionInfo exception = new ExceptionInfo();
		exception.setMsg(ae.getMessage());
		exception.setCode("JNK-500");
		
		return new ResponseEntity<ExceptionInfo>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(value = NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNDFE(NoDataFoundException ne){
		
		ExceptionInfo exception = new ExceptionInfo();
		exception.setMsg(ne.getMessage());
		exception.setCode("JNK-500");
		
		return new ResponseEntity<ExceptionInfo>(exception, HttpStatus.BAD_REQUEST);
		
	}
}
