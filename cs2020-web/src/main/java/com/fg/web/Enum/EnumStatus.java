package com.fg.web.Enum;

//狀態 by talbe.Status
public enum EnumStatus
{
	POST
	(1 , "post" , "已分配" , "jobtracker"),
	GOT
	(2 , "got" , "已接受" , "jobtracker"),
	OKWAITCHECK
	(3 , "okwaitcheck" , "完工-待確認" , "jobtracker"),
	OK
	(4 , "ok" , "完工-已確認" , "jobtracker"),
	CLOSED
	(5 , "closed" , "結案" , "jobtracker"),
	CANCEL
	(6 , "cancel" , "取消" , "jobtracker"),
	OBLIVION
	(7 , "oblivion" , "遺忘在風中" , "jobtracker"),
	SLOW
	(8 , "slow" , "不爽所以慢慢做" , "jobtracker"),
	WAIT
	(9 , "wait" , "暫停" , "jobtracker");
	
	
	private int uid;
	private String code;
	private String cname;
	private String used;
	
	private EnumStatus(int uid , String code , String cname , String used)
	{
		this.uid = uid;
		this.code = code;
		this.cname = cname;
		this.used = used;
	}

	public int getUid()
	{
		return uid;
	}

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getCname()
	{
		return cname;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}

	public String getUsed()
	{
		return used;
	}

	public void setUsed(String used)
	{
		this.used = used;
	}

}
