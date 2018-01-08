package demo.users.bean;
/*
 * 
 * area:区域管理表
 */
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="area")
public class Marea implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aid;
	private String aname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date atime;
	
	private char astate;
	
	//area对business是1对多    
	//mappedBy标签一定是定义在被拥有方的，他指向拥有方；
	//cascade all:级联删除, 级联更新,但解除父子关系时不会自动删除子对象. 
	@OneToMany(mappedBy="marea",cascade=CascadeType.ALL)
	@JsonIgnore
	private Set<Business> businesses=new HashSet<Business>();
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Date getAtime() {
		return atime;
	}
	public void setAtime(Date atime) {
		this.atime = atime;
	}
	public char getAstate() {
		return astate;
	}
	public void setAstate(char astate) {
		this.astate = astate;
	}
	@Override
	public String toString() {
		return "Area [aid=" + aid + ", aname=" + aname + ", atime=" + atime + ", astate=" + astate + "]";
	}
	
	
	
}
