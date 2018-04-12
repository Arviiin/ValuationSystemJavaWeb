package com.evaluation.entity;

import java.io.Serializable;
import java.util.Date;

public class Kpsh implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String khnd;

	private String khyf;

	private String bkhrid;

	private String bkhrxm;

	private String df;

	private String khrid;

	private String khrxm;

	private String deleteflag;

	private Date createtime;

	private Date opratetime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKhnd() {
		return khnd;
	}

	public void setKhnd(String khnd) {
		this.khnd = khnd;
	}

	public String getKhyf() {
		return khyf;
	}

	public void setKhyf(String khyf) {
		this.khyf = khyf;
	}

	public String getBkhrid() {
		return bkhrid;
	}

	public void setBkhrid(String bkhrid) {
		this.bkhrid = bkhrid;
	}

	public String getBkhrxm() {
		return bkhrxm;
	}

	public void setBkhrxm(String bkhrxm) {
		this.bkhrxm = bkhrxm;
	}

	public String getDf() {
		return df;
	}

	public void setDf(String df) {
		this.df = df;
	}

	public String getKhrid() {
		return khrid;
	}

	public void setKhrid(String khrid) {
		this.khrid = khrid;
	}

	public String getKhrxm() {
		return khrxm;
	}

	public void setKhrxm(String khrxm) {
		this.khrxm = khrxm;
	}

	public String getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getOpratetime() {
		return opratetime;
	}

	public void setOpratetime(Date opratetime) {
		this.opratetime = opratetime;
	}

}
