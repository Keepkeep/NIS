package demo.users.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/*
 * @acth=chen
 * nhouse:新房图库分类表
 */
@Entity
@Table(name="nhouse")
public class Nhouse implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer nid;
	private String nname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date ntime;//按时间排序
	
	private char nstate;//是否启用(1/0)
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public Date getNtime() {
		return ntime;
	}
	public void setNtime(Date ntime) {
		this.ntime = ntime;
	}
	public char getNstate() {
		return nstate;
	}
	public void setNstate(char nstate) {
		this.nstate = nstate;
	}
	@Override
	public String toString() {
		return "Nhouse [nid=" + nid + ", nname=" + nname + ", ntime=" + ntime + ", nstate=" + nstate + "]";
	}
	
	
}
