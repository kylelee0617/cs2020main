package com.fg.web.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookiesUtil {

	/**
	 * 根據名字獲取cookie
	 * 
	 * @param request
	 * @param name    cookie名字
	 * @return
	 */
	public static Cookie getCookieByName(HttpServletRequest request, String name) {
		Map<String, Cookie> cookieMap = ReadCookieMap(request);
		if (cookieMap.containsKey(name)) {
			Cookie cookie = (Cookie) cookieMap.get(name);
			return cookie;
		} else {
			return null;
		}
	}

	/**
	 * 將cookie封裝到Map裡面
	 * 
	 * @param request
	 * @return
	 */
	private static Map<String, Cookie> ReadCookieMap(HttpServletRequest request) {
		Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
		Cookie[] cookies = request.getCookies();
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				cookieMap.put(cookie.getName(), cookie);
			}
		}
		return cookieMap;
	}

	/**
	 * 儲存Cookies
	 * 
	 * @param response servlet請求
	 * @param value    儲存值
	 * @author jxf
	 */
	public static HttpServletResponse setCookie(HttpServletResponse response, String name, String value, int time) {
		// new一個Cookie物件,鍵值對為引數
		Cookie cookie = new Cookie(name, value);
		// tomcat下多應用共享
		cookie.setPath("/");
		// 如果cookie的值中含有中文時，需要對cookie進行編碼，不然會產生亂碼
		try {
			URLEncoder.encode(value, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		cookie.setMaxAge(time);
		// 將Cookie新增到Response中,使之生效
		response.addCookie(cookie); // addCookie後，如果已經存在相同名字的cookie，則最新的覆蓋舊的cookie
		return response;
	}

	/**
	 * <p>
	 * 刪除無效cookie
	 * </p>
	 * <p>
	 * 無效?1.過時 2.未釋出
	 * </p>
	 * 
	 * @param request
	 * @param response
	 * @param list
	 */
	public void delectCookieByName(HttpServletRequest request, HttpServletResponse response, String deleteKey)
			throws NullPointerException {
		Map<String, Cookie> cookieMap = ReadCookieMap(request);
		for (String key : cookieMap.keySet()) {
			if (key == deleteKey && key.equals(deleteKey)) {
				Cookie cookie = cookieMap.get(key);
				cookie.setMaxAge(0);// 設定cookie有效時間為0
				cookie.setPath("/");// 不設定儲存路徑
				response.addCookie(cookie);
			}
		}
	}
}
