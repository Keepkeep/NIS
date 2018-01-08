package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.HtypeService;
import demo.users.bean.Htype;

@Controller
@RequestMapping("/htype")
public class HtypeController {
	
	@Autowired
	private HtypeService service;
	
	@RequestMapping("/hlist")
	@ResponseBody
	public List<Htype> findAll(){
		return service.findAll();
	}
}
