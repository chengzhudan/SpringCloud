package org.wang.test.service;

import javax.jws.WebMethod;

@javax.jws.WebService
public interface WebService {
	
	//���������������Ҫ������ȥ�ķ���
	@WebMethod
	String sayHello(String name);
}
