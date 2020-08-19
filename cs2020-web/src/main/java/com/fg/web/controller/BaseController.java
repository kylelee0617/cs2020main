package com.fg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	protected String GOTO_PAGE = "";
	protected final int TOKENDAY = 1;	//token有效期限(天)
	protected final String RULEKEY = "0d90b7694f0ed995349bce51bdf54cd4";	//AES KEY

}
