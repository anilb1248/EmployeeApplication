package com.app.emp.util;

public class Response {

	private boolean status;
	private String msg;
	private String errorMsg;

	public Response(boolean status, String msg, String errorMsg) {
		this.status = status;
		this.msg = msg;
		this.errorMsg = errorMsg;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
