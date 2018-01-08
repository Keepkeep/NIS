package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.RateService;
import demo.users.bean.Rate;

@Controller
@RequestMapping("/rate")
public class RateController {
	
	@Autowired
	private RateService service;
	
	@RequestMapping("/rlist")
	@ResponseBody
	public List<Rate> findAll() {
		return service.findAll();
	}
}
