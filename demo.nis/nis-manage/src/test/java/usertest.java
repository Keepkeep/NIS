import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.UsersService;

public class usertest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/app-core.xml");
		UsersService users=(UsersService)context.getBean("usersservice");
		System.out.println(users.findAll());
	}

}
