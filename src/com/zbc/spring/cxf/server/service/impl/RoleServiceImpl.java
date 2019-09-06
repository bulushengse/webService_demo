package com.zbc.spring.cxf.server.service.impl;

import javax.jws.WebService;

import com.zbc.spring.cxf.server.bean.Role;
import com.zbc.spring.cxf.server.service.IRoleService;

@WebService(serviceName="roleService",targetNamespace="service.cxf.zbc.com")
public class RoleServiceImpl implements IRoleService {

	@Override
	public Role getRoleById(String id) {
		// TODO Auto-generated method stub
		Role role = new Role(id);
		role.setRole_name("权限1");
		role.setRights("123456789");
		role.setRemark("最高权限");
		
        return role;  
	}


}
