package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.TypeApi;
import demo.dao.TypeInterface;
import demo.users.bean.Types;

@Service("typeservice")
public class TypeService implements TypeApi{
	
	@Autowired
	private TypeInterface typeInterface;

	public List<Types> findAll() {
		return typeInterface.findAll();
	}
}
