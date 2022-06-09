package com.hhf.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.hhf.nacosprovider.controller
 *
 * @author hehongfei
 * @date 2022/6/9 10:53
 */
@RestController
@RequestMapping("/nacos/provider")
public class ProviderController {
	@Value("${myName}")
	private String myName;

	@RequestMapping("/hello")
	public String hello(){
		return "你好，我是提供者" + myName;
	}

}
