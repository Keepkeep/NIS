package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.MareaApi;
import demo.dao.MareaInterface;
import demo.users.bean.Marea;

@Service("mareaservice")
public class MareaService implements MareaApi{
	
	@Autowired
	private MareaInterface areaInterface;
	
	//查询所有区域
	public List<Marea> findAll() {
		return areaInterface.findAll();
	}
	
	//添加区域
	public void save(Marea marea) {
		areaInterface.save(marea);
	}

	//删除区域
	public void delete(Integer aid){
		areaInterface.delete(aid);
	}

	//根据ID查询
	public List<Marea> findOne(Integer aid) {
		return (List<Marea>) areaInterface.findOne(aid);
	}
	
	//根据id修改
	public void update(Integer aid) {
		Marea marea=areaInterface.findOne(aid);
		areaInterface.save(marea);	
	}

	
	

	
}
