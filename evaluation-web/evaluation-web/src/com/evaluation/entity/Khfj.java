package com.evaluation.entity;

import java.io.Serializable;
import java.util.Date;

public class Khfj implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String sszbid;

	private String fjnr;

	private String fz;

	private String deleteflag;

	private Date opratetime;

	private Date createtime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSszbid() {
		return sszbid;
	}

	public void setSszbid(String sszbid) {
		this.sszbid = sszbid;
	}

	public String getFjnr() {
		return fjnr;
	}

	public void setFjnr(String fjnr) {
		this.fjnr = fjnr;
	}

	public String getFz() {
		return fz;
	}

	public void setFz(String fz) {
		this.fz = fz;
	}

	public String getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}

	public Date getOpratetime() {
		return opratetime;
	}

	public void setOpratetime(Date opratetime) {
		this.opratetime = opratetime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
