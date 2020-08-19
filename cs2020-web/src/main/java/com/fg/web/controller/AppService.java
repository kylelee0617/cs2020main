package com.fg.web.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.fg.web.Enum.EnumRESCode;
import com.fg.web.bean.AppServiceRS;
import com.fg.web.utils.AES;
import com.fg.web.vo.Result;

/**
 * 
 * @author Kyle Lee
 *
 */

@RestController
@RequestMapping("app")
public class AppService {

	private static org.slf4j.Logger LOGS = LoggerFactory.getLogger(AppService.class);
	private int tokenDay = 1;	//token有效期限(天)
	private String ruleKey = "0d90b7694f0ed995349bce51bdf54cd4";
	private String domain = "jllcp3.com";
	private String ip = "192.168.3.51";

//	@SuppressWarnings("unused")
	@GetMapping(value="loginJ")
	public Result login(@RequestParam("index") Integer id, @RequestParam("indexp") Integer psw) {
		LOGS.info(">>>login");
		
		//TODO: 驗證登入合法
		boolean boo = false;
		
		if(id == 111 && psw == 222) {
			boo = true;
		}
		
		AppServiceRS asr = new AppServiceRS();
		Result rs = new Result();
		if(boo) {
			StringBuilder spToken = new StringBuilder();
			spToken.append(System.currentTimeMillis());
			spToken.append("&&");
			spToken.append(id);
			spToken.append("&&");
			spToken.append(psw);
			
			asr.setToken(AES.AESEncode(ruleKey, spToken.toString()));
			rs.setData(asr);
		}
		else {
			rs.setCode(EnumRESCode.LOGINFAIL.getCode());
			rs.setMsg(EnumRESCode.LOGINFAIL.getDesc());
		}
		
		return rs;
	}
	
	@GetMapping(value="domain")
	public String getDomain() {
		LOGS.info(">>>get Domain");
		
		AppServiceRS asr = new AppServiceRS();
		Result rs = new Result();
		
		//不打token，直接拿加密字串
//		Result rs = this.chkToken(token);
//		if(rs.getCode() != 0) {
//			return "";
//		}
		
		asr.setDomain(this.domain);
		asr.setIp(this.ip);
		rs.setData(asr);
		String jsonRS = AES.AESEncode(ruleKey, JSONObject.toJSON(rs).toString());
		
		return jsonRS;
	}
	
	@GetMapping(value="ver")
	public String getVer() {
		LOGS.info(">>>get ver");
		
		AppServiceRS asr = new AppServiceRS();
		Result rs = new Result();
		
		//不打token，直接拿加密字串
//		Result rs = this.chkToken(token);
//		if(rs.getCode() != 0) {
//			return "";
//		}
		
		asr.setAndroidVersion("24");
		asr.setAndroidContent("版本更新");
		asr.setAndroidUrl("https://xxx.com/ffc.apk");
		asr.setWebCacheVersion("38");
		asr.setIosVersion("3");
		asr.setUrl("https://xxx.com/ipainstall.html");
		rs.setData(asr);
		String jsonRS = AES.AESEncode(ruleKey, JSONObject.toJSON(rs).toString());
		
		return jsonRS;
	}
	
	/**
	 * 檢查 token
	 * @param token
	 * @return
	 */
	public Result chkToken(String token) {
		LOGS.info(">>>check token==" + token);
		
		Result rs = new Result();
		
		try {
			//解開
			String dyToken = AES.AESDncode(this.ruleKey, token);
			String time = dyToken.split("&&")[0];
			String id = dyToken.split("&&")[1];
			String psw = dyToken.split("&&")[2];
			
			//驗證時間有效
			boolean validToken = this.validTime(Long.parseLong(time));
			if(!validToken) {
				rs.setCode(EnumRESCode.TOKENFAIL.getCode());
				rs.setMsg(EnumRESCode.TOKENFAIL.getDesc());
				return rs;
			}
			
			//驗證帳號密碼
			boolean validAcc = this.validAcc(id, psw);
			if(!validAcc) {
				rs.setCode(EnumRESCode.LOGINFAIL.getCode());
				rs.setMsg(EnumRESCode.LOGINFAIL.getDesc());
				return rs;
			}
			
			return rs;
		}
		catch(Exception e) {
			LOGS.error(e.toString());
			rs.setCode(EnumRESCode.ERROR.getCode());
			rs.setMsg(EnumRESCode.ERROR.getDesc());
			return rs;
		}
	}
	
	/**
	 * 驗證帳號密碼
	 * @param id
	 * @param psw
	 * @return
	 */
	public boolean validAcc(String id , String psw) {
		
		//TODO: 認證帳號密碼
		return true;
	}
	
	/**
	 * 驗證token是否過期
	 * @param time
	 * @return
	 */
	public boolean validTime(Long tokenTime) {
		long crrTime = System.currentTimeMillis();
		long validTime = tokenDay*24*60*60*1000;	//token有效期限
		
		if(crrTime > tokenTime + validTime) {
			return false;
		}else {
			return true;
		}
	}

}