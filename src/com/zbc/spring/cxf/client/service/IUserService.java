package com.zbc.spring.cxf.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2019-09-05T17:08:34.708+08:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "service.cxf.zbc.com", name = "IUserService")
@XmlSeeAlso({ObjectFactory.class})
public interface IUserService {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "service.cxf.zbc.com", className = "com.zbc.cxf.service.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "service.cxf.zbc.com", className = "com.zbc.cxf.service.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getUserByName", targetNamespace = "service.cxf.zbc.com", className = "com.zbc.cxf.service.GetUserByName")
    @ResponseWrapper(localName = "getUserByNameResponse", targetNamespace = "service.cxf.zbc.com", className = "com.zbc.cxf.service.GetUserByNameResponse")
    @WebResult(name = "user", targetNamespace = "")
    public com.zbc.spring.cxf.client.service.User getUserByName(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}
