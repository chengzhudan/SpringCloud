package microservicecloud.consumer.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import microservicecloud.consumer.dept.feign.SchedualServiceHi;

@RestController
@RequestMapping("/consumer")
public class ConsumerFeign {

	@Autowired
	private SchedualServiceHi schedualServiceHi;

	@RequestMapping("/hi")
	public String hiService(@RequestParam(name = "name") String name) {
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
