package com.tan.test.common;


public class DaoException extends BaseAppException {
	private static final long serialVersionUID = -3558864971927059561L;

	public DaoException() {
	}

	public DaoException(String msg) {
		super(msg);
	}

	public DaoException(Throwable e) {
		super(e);
	}

	public DaoException(String msg, Throwable e) {
		super(msg, e);
	}
}
