package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.api.NhouseApi;
import demo.service.NhouseService;
import demo.users.bean.Nhouse;

@Controller
@RequestMapping("/nhouse")
public class NhouseController {
	@Autowired
	private NhouseService service;
	
	@RequestMapping("/nlist")
	@ResponseBody
	public List<Nhouse> findAll() {
		return service.findAll();
	}
	
	
}
