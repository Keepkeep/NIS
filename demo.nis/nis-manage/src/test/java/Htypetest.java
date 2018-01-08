import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.HtypeService;

public class Htypetest {
		public static void main(String[] args) {
			ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
			HtypeService htype=(HtypeService)context.getBean("htypeservice");
			System.out.println(htype.findAll());
		}
}
