package com.tan.test.common;

public class BaseAppException extends Exception {
	private static final long serialVersionUID = 7660786829170340588L;

	public BaseAppException() {
	}

	public BaseAppException(String msg) {
		super(msg);
	}

	public BaseAppException(Throwable e) {
		super(e);
	}

	public BaseAppException(String msg, Throwable e) {
		super(msg, e);
	}
}
