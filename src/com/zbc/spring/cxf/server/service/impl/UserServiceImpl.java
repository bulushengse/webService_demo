package com.zbc.spring.cxf.server.service.impl;

import javax.jws.WebService;

import com.zbc.spring.cxf.server.bean.User;
import com.zbc.spring.cxf.server.service.IUserService;

@WebService(serviceName="userService",targetNamespace="service.cxf.zbc.com")
public class UserServiceImpl implements IUserService {

	@Override
	public String sayHello(String text) {
		// TODO Auto-generated method stub
		return "hello " + text;  
	}
	
	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		 User user = new User(name);
		 user.setSex("男");
		 user.setAge("20");
		 user.setRemark("hhhhhhhhhh");
		
         return user;  
	}

}
