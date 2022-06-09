package com.hhf.nacosconsumer.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.hhf.nacosconsumer.fegin
 *
 * @author hehongfei
 * @date 2022/6/9 14:14
 */
@FeignClient(name = "nacos-provider")//指定远程调用方的名字
public interface ProviderFeign {

	/**
	 * 意思是ProviderFeign的hello()方法会调用注解指定的路径对应的方法，
	 * 调用的是服务提供方提供的远程接口
	 * @return
	 */
	@RequestMapping("/nacos/provider/hello")//路径一定写全路径
	public String hello();
}
