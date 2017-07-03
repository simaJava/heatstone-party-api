package com.blizzard.heatstone.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blizzard.heatstone.api.qiniu.QiNiuConfig;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private QiNiuConfig qiNiuConfig;
	
	
	@RequestMapping("/getConfig")
	@ResponseBody
	public String getConfiguration(){
		
		return qiNiuConfig.toString();
		
	}

}
