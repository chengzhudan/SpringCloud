package microservicecloud.consumer.dept.feignImpl;

import org.springframework.stereotype.Component;

import microservicecloud.consumer.dept.feign.SchedualServiceHi;

/**
 * Feign��·��ʵ��
 * @author Сǿǿ
 *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		 return "sorry,���������۶�! " + name;
	}

}
