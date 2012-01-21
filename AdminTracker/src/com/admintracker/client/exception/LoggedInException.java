package com.admintracker.client.exception;

import java.io.Serializable;

public class LoggedInException extends Exception implements Serializable {
	public LoggedInException() {
		super();
	}

	public LoggedInException(String msg) {
		super(msg);
	}

}
