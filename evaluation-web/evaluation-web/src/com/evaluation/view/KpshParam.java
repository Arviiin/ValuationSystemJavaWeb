package com.evaluation.view;

import java.io.Serializable;

public class KpshParam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String khnd;

	private String khyf;

	private String bkhrid;

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

}
