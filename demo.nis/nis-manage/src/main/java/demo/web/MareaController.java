package demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.api.MareaApi;
import demo.service.MareaService;
import demo.users.bean.Marea;

@Controller
@RequestMapping("/area")
public class MareaController{

	@Autowired
	private MareaService areaService;
	
	//查询所有区域  显示
	@RequestMapping("/alist")
	@ResponseBody
	public List<Marea> findAll(){
		return areaService.findAll();
	}
	
	
	//添加区域
	@RequestMapping("/aadd")
	public void save(Marea marea){
		areaService.save(marea);
	}
	
	
	//删除区域
	@RequestMapping("/adelete")
	public void delete(Integer aid) {
		areaService.delete(aid);	
	}
	
	//修改区域
	@RequestMapping("/aupdate")
	public void update(Integer aid) {
		Marea marea=(Marea) areaService.findOne(aid);
		areaService.save(marea);
	}


	
	
	
}
