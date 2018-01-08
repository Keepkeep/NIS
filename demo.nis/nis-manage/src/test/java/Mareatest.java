import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.MareaService;
import demo.users.bean.Marea;


public class Mareatest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/app-core.xml");
		MareaService areas=(MareaService)context.getBean("mareaservice");
		//添加测试
		Marea marea=new Marea();
		marea.setAname("有梦为马");
		marea.setAstate('0');
		marea.setAtime(new Date());
		areas.save(marea);
		
		//删除测试
		//area.delete(4);
		
		//查询测试
		System.out.println(areas.findAll());
		
	}
}
