package org.wang.test.service;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {
	
	//声明了这个方法是要发布出去的方法
	@WebMethod
	String sayHello(String name);
}
