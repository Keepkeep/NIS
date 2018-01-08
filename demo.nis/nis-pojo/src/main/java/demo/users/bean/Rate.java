package demo.users.bean;
/*
 * @auth:chen
 * rate :按揭利率表
 */
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="rate")
public class Rate {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rid;
	private String rnature;
	private String rname;
	private String nature;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date rtime;
	private char rstate;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRnature() {
		return rnature;
	}
	public void setRnature(String rnature) {
		this.rnature = rnature;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Date getRtime() {
		return rtime;
	}
	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}
	public char getRstate() {
		return rstate;
	}
	public void setRstate(char rstate) {
		this.rstate = rstate;
	}
	@Override
	public String toString() {
		return "Rate [rid=" + rid + ", rnature=" + rnature + ", rname=" + rname + ", nature=" + nature + ", rtime="
				+ rtime + ", rstate=" + rstate + "]";
	}
	
	
}
