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

@Entity 
@Table(name="type")
public class Types implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tid;
	private String tname;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date ttime;//按时间排序
	
	private char tstate;//是否启用(1/0)
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Date getTtime() {
		return ttime;
	}
	public void setTtime(Date ttime) {
		this.ttime = ttime;
	}
	public char getTstate() {
		return tstate;
	}
	public void setTstate(char tstate) {
		this.tstate = tstate;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + ", ttime=" + ttime + ", tstate=" + tstate + "]";
	}

}
