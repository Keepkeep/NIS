package demo.users.bean;
/*
 * @acth=chen
 * decorate:装修度管理表
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
@Table(name="decorate")
public class Decorate implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer did;
	private String dname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dtime;//按时间排序
	
	private char dstate;//是否启用(1/0)
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public Date getDtime() {
		return dtime;
	}
	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}
	public char getDstate() {
		return dstate;
	}
	public void setDstate(char dstate) {
		this.dstate = dstate;
	}
	
	@Override
	public String toString() {
		return "Decorate [did=" + did + ", dname=" + dname + ", dtime=" + dtime + ", dstate=" + dstate + "]";
	}

}
