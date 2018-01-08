package demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Users;

public interface UsersInterface extends JpaRepository<Users, Integer>{
	List<Users> findAll();
}
