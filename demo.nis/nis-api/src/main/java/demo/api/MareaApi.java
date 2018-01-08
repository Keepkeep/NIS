package demo.api;

import java.util.List;

import demo.users.bean.Marea;

public interface MareaApi {
	//根据id查询所有区域
	List<Marea>findOne(Integer aid);
	//查询所有区域
	List<Marea> findAll();
	//添加/修改区域
	void save(Marea marea);
	//删除区域
	void delete(Integer aid);
	//修改
	void update(Integer aid);
}
