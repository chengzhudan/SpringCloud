package org.wang.test.service.impl;

import org.wang.test.service.WebService;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

	@Override
	public String sayHello(String name) {
		System.out.println("�ɹ���");
		String a = name + "haha";
		return a;
	}

}
