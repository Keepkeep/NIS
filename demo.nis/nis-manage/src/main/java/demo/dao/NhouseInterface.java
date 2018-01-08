package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Nhouse;

public interface NhouseInterface extends JpaRepository<Nhouse, Integer>{

}
