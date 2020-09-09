package com.krmenugo.agency.control.error.control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public abstract class BaseController {
	
		@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(Exception.class)
		public ErrorResponse applicationException(Exception e) {
			return new ErrorResponse(e.getMessage(), e.getClass().toString(), "AHC0001");
		}

}
