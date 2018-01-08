package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.State;

public interface StateInterface extends JpaRepository<State, Integer>{

}
