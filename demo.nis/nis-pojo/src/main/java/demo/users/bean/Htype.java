package demo.users.bean;
/*
 * @acth=chen
 * htype:楼型管理表
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="htype")
public class Htype implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer hid;
	private String hname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date htime;//按时间排序
	
	private char hstate;//是否启用(1/0)
	
	
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Date getHtime() {
		return htime;
	}
	public void setHtime(Date htime) {
		this.htime = htime;
	}
	public char getHstate() {
		return hstate;
	}
	public void setHstate(char hstate) {
		this.hstate = hstate;
	}
	@Override
	public String toString() {
		return "Htype [hid=" + hid + ", hname=" + hname + ", htime=" + htime + ", hstate=" + hstate + "]";
	}
	
	
	
}
