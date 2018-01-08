package demo.api;

import java.util.List;

import demo.users.bean.Users;

public interface UsersApi {
	List<Users> findAll();
	Users fingByUid();
	String save();
}
