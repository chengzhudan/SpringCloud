package org.wang.test.test;

import org.wang.test.service.impl.WebServiceImpl;
import org.wang.test.service.impl.WebServiceImplService;

/**
 * 
 * wsimport  -s E:\wrokspace\WebServiceClient\src -keep http://localhost:8089/WS_Server/WebService?wsdl
 * cmd命令使用wsimport工具生成客户端代码，测试代码自己写
 * 注意:一定要先建一个client的Web空项目，然后使用工具将要生成的代码指向空项目的src目录
 *
 */
public class WsClient {
	public static void main(String[] args) {
		//创建一个生成WebServiceImpl的工厂,WebServiceImplService类是wsimport工具生成的
		WebServiceImplService factory = new WebServiceImplService();
		//通过工厂生成WebServiceImpl实例,WebServiceImpl接口也是wsimport生成的
		WebServiceImpl webServiceImpl = factory.getWebServiceImplPort();
		//调用WebService的方法
		String sayHello = webServiceImpl.sayHello("王磊");
		System.out.println("调用WebService的sayHello方法返回的结果:" + sayHello);
	}
}
