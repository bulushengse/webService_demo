package com.zbc.spring.cxf.server.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.zbc.spring.cxf.server.bean.User;

@WebService(targetNamespace="service.cxf.zbc.com")
public interface IUserService {
	
	 public abstract String sayHello(String text);  
	
	 @WebMethod (operationName= "getUserByName" ) 
	 @WebResult (name =  "user" ) 
     public abstract User getUserByName(@WebParam (name =  "name" )String name);  
     
}
