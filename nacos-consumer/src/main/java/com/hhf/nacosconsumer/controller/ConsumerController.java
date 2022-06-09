package com.hhf.nacosconsumer.controller;

import com.hhf.nacosconsumer.fegin.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.hhf.nacosconsumer.controller
 *
 * @author hehongfei
 * @date 2022/6/9 14:08
 */
@RequestMapping("/nacos/consumer")
@RestController
public class ConsumerController {
	@Resource
	private ProviderFeign providerFegin;

	/**
	 * /nacos/consumer/hi  会调用/nacos/provider/hello
	 * @return
	 */
	@RequestMapping("/hi")
	public String hi(){
		return providerFegin.hello();
	}

}
