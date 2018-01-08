package demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.users.bean.Marea;

public interface MareaInterface extends JpaRepository<Marea, Integer>{
		//根据id查询所有
		Marea findOne(Integer arg0);
		//查询所有区域
		List<Marea> findAll();
		//添加/修改区域
		<S extends Marea> S save(S arg0);
		//删除区域
		void delete(Integer aid);
		
}
