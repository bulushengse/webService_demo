package com.zbc.spring.cxf.client.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zbc.spring.cxf.client.service.IUserService;

@Controller
@RequestMapping(value="/userClient")
public class userController {
	
	@Resource(name="userServiceClient")
 	private IUserService userService;
	
	/**
	 * sayHello
	 */
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("====client_log===========Invoking sayHello...");
		ModelAndView mv = new ModelAndView();
		
        java.lang.String _sayHello_arg0 = "CXF";
        java.lang.String _sayHello__return = userService.sayHello(_sayHello_arg0);
        System.out.println("====client_log===========sayHello.result=" + _sayHello__return);
	        
        mv.addObject("result","sayHello方法调用成功，返回结果："+_sayHello__return);
		mv.setViewName("result");
		return mv;
		
	}
	
	/**
	 * getUserByName
	 */
	@RequestMapping(value="/getUserByName",method=RequestMethod.GET)
	public ModelAndView getUserByName() {
		System.out.println("====client_log===========Invoking getUserByName...");
		ModelAndView mv = new ModelAndView();
		
        java.lang.String _getUserByName_name = "zhoubc";
        com.zbc.spring.cxf.client.service.User _getUserByName__return = userService.getUserByName(_getUserByName_name);
        System.out.println("====client_log===========getUserByName.result=" + _getUserByName__return);   
	    
        mv.addObject("result","getUserByName方法调用成功，返回结果："+_getUserByName__return.toString());
		mv.setViewName("result");
		return mv;
		
	}
	
	
}
