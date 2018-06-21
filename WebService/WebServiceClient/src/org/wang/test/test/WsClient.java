package org.wang.test.test;

import org.wang.test.service.impl.WebServiceImpl;
import org.wang.test.service.impl.WebServiceImplService;

/**
 * 
 * wsimport  -s E:\wrokspace\WebServiceClient\src -keep http://localhost:8089/WS_Server/WebService?wsdl
 * cmd����ʹ��wsimport�������ɿͻ��˴��룬���Դ����Լ�д
 * ע��:һ��Ҫ�Ƚ�һ��client��Web����Ŀ��Ȼ��ʹ�ù��߽�Ҫ���ɵĴ���ָ�����Ŀ��srcĿ¼
 *
 */
public class WsClient {
	public static void main(String[] args) {
		//����һ������WebServiceImpl�Ĺ���,WebServiceImplService����wsimport�������ɵ�
		WebServiceImplService factory = new WebServiceImplService();
		//ͨ����������WebServiceImplʵ��,WebServiceImpl�ӿ�Ҳ��wsimport���ɵ�
		WebServiceImpl webServiceImpl = factory.getWebServiceImplPort();
		//����WebService�ķ���
		String sayHello = webServiceImpl.sayHello("����");
		System.out.println("����WebService��sayHello�������صĽ��:" + sayHello);
	}
}
