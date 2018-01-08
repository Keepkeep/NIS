package demo.users.bean;
/**
 * business:商圈表
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="business")
public class Business implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bid;
	private Integer aid;
	private String bname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date btime;
	
	private char bstate;
	
	//business对marea 是 多对一关系映射
	//@JoinColumn标记来指定保存实体关系的配置。
	@ManyToOne
	@JoinColumn(name="aid",insertable=false,updatable=false)
	private Marea marea;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Marea getMarea() {
		return marea;
	}

	public void setMarea(Marea marea) {
		this.marea = marea;
	}

	public Date getBtime() {
		return btime;
	}

	public void setBtime(Date btime) {
		this.btime = btime;
	}
	
	public char getBstate() {
		return bstate;
	}

	public void setBstate(char bstate) {
		this.bstate = bstate;
	}

	@Override
	public String toString() {
		return "Business [bid=" + bid + ", aid=" + aid + ", bname=" + bname + ", btime=" + btime + ", bstate=" + bstate
				+ "]";
	}



}
