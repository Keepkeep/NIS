package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.TypeService;
import demo.users.bean.Types;



@Controller
@RequestMapping("/type")
public class TypeController {
	@Autowired
	private TypeService service;

	@RequestMapping("/tlist")
	@ResponseBody
	public List<Types> findAll(){
		return service.findAll();
	}
}
