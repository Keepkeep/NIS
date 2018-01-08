package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.HtypeApi;
import demo.dao.HtypeInterface;
import demo.users.bean.Htype;

@Service("htypeservice")
public class HtypeService implements HtypeApi{
	
	@Autowired
	private HtypeInterface htypeInterface;
	
	public List<Htype> findAll() {
		return htypeInterface.findAll();
	}

}
