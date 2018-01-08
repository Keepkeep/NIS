package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.UsersApi;
import demo.dao.UsersInterface;
import demo.users.bean.Users;

@Service("usersservice")
public class UsersService implements UsersApi{
	@Autowired
	private UsersInterface usersI;

	public List<Users> findAll() {
		return usersI.findAll();
	}

	public Users fingByUid() {
		return null;
	}

	public String save() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
