package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Types;

public interface TypeInterface extends JpaRepository<Types,Integer>{
		
}
