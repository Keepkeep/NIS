package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.DecorateApi;
import demo.dao.DecorateInterface;
import demo.users.bean.Decorate;

@Service("decorateservice")
public class DecorateService implements DecorateApi{
	@Autowired
	private DecorateInterface decorateInterface;

	//装修度表查询
	public List<Decorate> findAll() {
		return decorateInterface.findAll();
	}
	
	

}
