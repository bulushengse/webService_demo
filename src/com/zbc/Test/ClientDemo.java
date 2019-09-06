package com.zbc.Test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.zbc.spring.cxf.server.service.IUserService;

public class ClientDemo {

	/**
	 * cxf简单实例 
	 * 客户端程序调用服务
	 */
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpFactory = new JaxWsProxyFactoryBean();
		jwpFactory.setServiceClass(IUserService.class);
		jwpFactory.setAddress("http://localhost:9999/userService");
		//jwpFactory.setAddress("http://localhost:8080/webService_CXF_demo/service/user");
		
		IUserService proxy = (IUserService) jwpFactory.create();
		
		System.out.println(proxy.sayHello("hhh"));
	
		System.out.println(proxy.getUserByName("zhoubc"));
	}
}
