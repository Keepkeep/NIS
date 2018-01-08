import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.DecorateService;

public class Decoratetest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		DecorateService service=(DecorateService)context.getBean("decorateservice");
		System.out.println(service.findAll());
	}
}
