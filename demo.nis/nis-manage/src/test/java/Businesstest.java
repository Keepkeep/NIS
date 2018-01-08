import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.BusinessService;

public class Businesstest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		BusinessService service=(BusinessService)context.getBean("businessservice");
		System.out.println(service.findAll());
	}
}
