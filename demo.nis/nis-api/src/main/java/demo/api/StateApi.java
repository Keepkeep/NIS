package demo.api;

import java.util.List;

import demo.users.bean.State;

public interface StateApi {
	//查询状态表中的所有
	List<State> findAll();
}
