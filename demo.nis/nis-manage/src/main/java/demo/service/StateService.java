package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.StateApi;
import demo.dao.StateInterface;
import demo.users.bean.State;

@Service("stateservice")
public class StateService implements StateApi{
	@Autowired
	private StateInterface stateInterface;
	
	//状态表中查询所有
	public List<State> findAll() {
		return stateInterface.findAll();
	}
	
}
