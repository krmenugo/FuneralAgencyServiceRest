package com.krmenugo.agency.control.error.control;

public class ErrorResponse {

	private String errorMsg;
	private String exceptionName;
	private String errorCode;

	public ErrorResponse(String errorMsg, String exceptionName, String errorCode) {
		super();
		this.errorMsg = errorMsg;
		this.exceptionName = exceptionName;
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getExceptionName() {
		return exceptionName;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
}
