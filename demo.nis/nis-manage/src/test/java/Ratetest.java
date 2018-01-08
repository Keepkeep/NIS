import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.RateService;

public class Ratetest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		RateService service=(RateService)context.getBean("rateservice");
		System.out.println(service.findAll());
	}
}
