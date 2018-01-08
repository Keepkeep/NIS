package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.BusinessApi;
import demo.dao.BusinessInterface;
import demo.users.bean.Business;

@Service("businessservice")
public class BusinessService implements BusinessApi{
	@Autowired
	private BusinessInterface businessInterface;

	public List<Business> findAll() {
		return businessInterface.findAll();
	}
	
	
}
