package microservicecloud.consumer.dept.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import microservicecloud.consumer.dept.feignImpl.SchedualServiceHiHystric;

//Feign自带断路器，在D版本的Spring Cloud中，它没有默认打开
//value为调用的服务名，fallback为断容器指定的类，需要实现该接口，并注入到Ioc容器中
@FeignClient(value = "microservicecloud-dept",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	
	@RequestMapping(value = "/provider/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
