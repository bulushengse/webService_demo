package com.zbc.spring.cxf.server.service;

import javax.jws.WebService;

import com.zbc.spring.cxf.server.bean.Role;

@WebService(targetNamespace="service.cxf.zbc.com")
public interface IRoleService {
	
     public abstract Role getRoleById(String name);  
     
}
