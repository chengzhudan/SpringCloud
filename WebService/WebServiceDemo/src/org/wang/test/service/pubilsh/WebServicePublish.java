package org.wang.test.service.pubilsh;

import javax.xml.ws.Endpoint;

import org.wang.test.service.impl.WebServiceImpl;

public class WebServicePublish {
	
	public static void main(String[] args) {
		
		//����webservice�ķ�����ַ���õ�ַ�����ṩ��������webservice��URL��ַ
		String address = "http://localhost:8089/WS_Server/WebService";
		//ʹ��Endpoint���ṩ��publish��������WebService
		Endpoint.publish(address, new WebServiceImpl());
		System.out.println("WebService�����ɹ�");
		
		/**
		 * ���ʵ�ַ:localhost:8089/WS_Server/WebService?wsdl(ע��һ��Ҫ��wsdl)
		 * 
		 * ���WebService�����ɹ�������xml��ʽ����
		 */
	}
}
