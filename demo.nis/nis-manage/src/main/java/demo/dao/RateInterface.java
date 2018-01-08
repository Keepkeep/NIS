package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Rate;

public interface RateInterface extends JpaRepository<Rate, Integer>{

	
}
