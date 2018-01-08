package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import demo.users.bean.Htype;

public interface HtypeInterface extends JpaRepository<Htype, Integer>{

	
}
