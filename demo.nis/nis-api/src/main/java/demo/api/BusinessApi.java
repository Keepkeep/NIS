package demo.api;

import java.util.List;

import demo.users.bean.Business;

public interface BusinessApi {
	//查询所有商圈
	List<Business> findAll();
}
