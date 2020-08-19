package com.fg.web.vo;


public class Result {

	private int code = 0;
	private String msg = "ok";
	private Object data;
	
	public Result() {
	}
	
	public Result(Object data) {
		this.data = data;
	}
	
	public Result(int code, Object data) {
		this.code = code;
		this.data = data;
	}
	public Result(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
