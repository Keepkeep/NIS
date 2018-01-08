import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.StateService;

import org.springframework.context.ApplicationContext;

public class Statetest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		StateService service=(StateService)context.getBean("stateservice");
		System.out.println(service.findAll());
	}
}
