package demo.users.bean;

/*
 * @auto=chen
 * state:状态管理表
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
@Table(name="state")
public class State implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date stime;//按时间排序
	
	private char sstate;//是否启用(1/0)
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	public char getSstate() {
		return sstate;
	}
	public void setSstate(char sstate) {
		this.sstate = sstate;
	}
	@Override
	public String toString() {
		return "State [sid=" + sid + ", sname=" + sname + ", stime=" + stime + ", sstate=" + sstate + "]";
	}

	
}
