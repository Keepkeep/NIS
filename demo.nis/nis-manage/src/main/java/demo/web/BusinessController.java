package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.BusinessService;
import demo.users.bean.Business;

@Controller
@RequestMapping("/business")
public class BusinessController {
	@Autowired
	private BusinessService bService;
	
	@RequestMapping("/blist")
	@ResponseBody
	public List<Business> findAll(){
		return bService.findAll();
	}
}
