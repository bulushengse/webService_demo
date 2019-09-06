package com.zbc.Test;

import javax.xml.ws.Endpoint;

import com.zbc.spring.cxf.server.service.IUserService;
import com.zbc.spring.cxf.server.service.impl.UserServiceImpl;

public class ServerDemo {

	/**
	 * cxf简单实例 
	 * 创建一个服务
	 */
	public static void main(String[] args) {
		//创建接口
		IUserService userService = new UserServiceImpl();
		
		//地址
		String address = "http://localhost:9999/userService";
		
		//发布
		Endpoint.publish(address, userService);
		
		System.out.println("服务已启动。。。");
	}
}
