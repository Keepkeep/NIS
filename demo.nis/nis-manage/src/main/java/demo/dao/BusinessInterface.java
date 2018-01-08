package demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Business;

public interface BusinessInterface extends JpaRepository<Business, Integer>{
		//查询所有商圈
		List<Business> findAll();
	
	
}
