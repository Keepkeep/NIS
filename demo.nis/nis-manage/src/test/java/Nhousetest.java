import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.NhouseService;

public class Nhousetest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		NhouseService service=(NhouseService)context.getBean("nhouseservice");
		System.out.println(service.findAll());
	}
}
