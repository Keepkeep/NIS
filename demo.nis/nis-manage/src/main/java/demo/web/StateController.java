package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.StateService;
import demo.users.bean.State;

@Controller
@RequestMapping("/state")
public class StateController {
	
	@Autowired
	private StateService service;
	
	@RequestMapping("/slist")
	@ResponseBody
	public List<State> findAll(){
		return service.findAll();
	}
}
