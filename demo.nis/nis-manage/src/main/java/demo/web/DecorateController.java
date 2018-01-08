package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.DecorateService;
import demo.users.bean.Decorate;

@Controller
@RequestMapping("/decorate")
public class DecorateController {
		
	@Autowired
	private DecorateService service;
	
	@RequestMapping("/dlist")
	@ResponseBody
	public List<Decorate> findAll() {
		return service.findAll();
	}
	
	
}
