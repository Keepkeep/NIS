package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.NhouseApi;
import demo.dao.NhouseInterface;
import demo.users.bean.Nhouse;

@Service("nhouseservice")
public class NhouseService implements NhouseApi{
		
	@Autowired
	private NhouseInterface nhouseInterface;

	public List<Nhouse> findAll() {
		return nhouseInterface.findAll();
	}
	
	
}
