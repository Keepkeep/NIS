import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.TypeService;

public class Typetest {
		public static void main(String[] args) {
			 ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
			 TypeService service=(TypeService) context.getBean("typeservice");
			 System.out.println(service.findAll());
		}
}
