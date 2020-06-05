package microservicecloud.consumer.dept.feignImpl;

import org.springframework.stereotype.Component;

import microservicecloud.consumer.dept.feign.SchedualServiceHi;

/**
 * Feign断路器实现
 * @author 小强强
 *
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		 return "sorry,开启调用熔断! " + name;
	}

}
