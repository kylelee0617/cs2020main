package com.fg.web.Enum;

//狀態 by talbe.Status
public enum EnumRESCode
{
	SUCCESS
	(1 , "success" , "成功完成" , "desc"),
	TOKENFAIL
	(2 , "tokenFail" , "憑證過期" , "desc - 憑證過期"),
	LOGINFAIL
	(2 , "loginFail" , "登入失敗" , "desc - 登入失敗"),
	ERROR
	(999 , "ERROR" , "發生不明錯誤" , "desc - 發生不明錯誤");
	
	
	private int code;
	private String ename;
	private String cname;
	private String desc;
	
	private EnumRESCode(int code , String ename , String cname , String desc)
	{
		this.code = code;
		this.ename = ename;
		this.cname = cname;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
