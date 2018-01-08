package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Decorate;

public interface DecorateInterface extends JpaRepository<Decorate, Integer>{

}
