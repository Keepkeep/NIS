package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.service.UsersService;
import demo.users.bean.Users;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService users;
	@RequestMapping("list")
	@ResponseBody
	public List<Users> findAll() {
		return users.findAll();
	}
}
