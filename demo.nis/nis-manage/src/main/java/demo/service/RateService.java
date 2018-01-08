package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.api.RateApi;
import demo.dao.RateInterface;
import demo.users.bean.Rate;

@Service("rateservice")
public class RateService implements RateApi{
	
	@Autowired
	private RateInterface rateInterface;

	public List<Rate> findAll() {
		return rateInterface.findAll();
	}
}
