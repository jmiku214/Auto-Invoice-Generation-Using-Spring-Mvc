package com.spring.enums;


import org.springframework.http.HttpStatus;

public enum Responses {

	UNAUTHORIZED(HttpStatus.UNAUTHORIZED.value()), SUCCESS(HttpStatus.OK.value()),
	BAD_REQUEST(HttpStatus.BAD_REQUEST.value()), BAD_REQUEST_EXCEPTION(HttpStatus.BAD_REQUEST.value()),
	INVALID_CREDENTIALS(HttpStatus.UNAUTHORIZED.value()), FORBIDDEN(HttpStatus.FORBIDDEN.value()),
	PERMISSION_DENIED(HttpStatus.UNAUTHORIZED.value()), EXCEPTION_OCCURED(HttpStatus.INTERNAL_SERVER_ERROR.value());

	private int code;

	Responses(Integer code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
