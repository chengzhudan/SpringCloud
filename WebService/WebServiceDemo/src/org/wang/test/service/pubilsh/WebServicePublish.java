package org.wang.test.service.pubilsh;

import javax.xml.ws.Endpoint;

import org.wang.test.service.impl.WebServiceImpl;

public class WebServicePublish {
	
	public static void main(String[] args) {
		
		//定义webservice的发布地址，该地址就是提供给外界访问webservice的URL地址
		String address = "http://localhost:8089/WS_Server/WebService";
		//使用Endpoint类提供的publish方法发布WebService
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("WebService发布成功");
		
		/**
		 * 访问地址:localhost:8089/WS_Server/WebService?wsdl(注意一定要加wsdl)
		 * 
		 * 如何WebService发布成功则会出现xml格式数据
		 */
	}
}
