package microservicecloud.consumer.dept.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import microservicecloud.consumer.dept.feignImpl.SchedualServiceHiHystric;

//Feign�Դ���·������D�汾��Spring Cloud�У���û��Ĭ�ϴ�
//valueΪ���õķ�������fallbackΪ������ָ�����࣬��Ҫʵ�ָýӿڣ���ע�뵽Ioc������
@FeignClient(value = "microservicecloud-dept",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	
	@RequestMapping(value = "/provider/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
