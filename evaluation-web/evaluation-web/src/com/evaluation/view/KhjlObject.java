package com.evaluation.view;

import java.io.Serializable;
import java.util.List;

public class KhjlObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private String bkhrid;

	private String khrid;

	private String khrxm;

	private List<KhjlParam> khjlParams;

	public String getBkhrid() {
		return bkhrid;
	}

	public void setBkhrid(String bkhrid) {
		this.bkhrid = bkhrid;
	}

	public List<KhjlParam> getKhjlParams() {
		return khjlParams;
	}

	public void setKhjlParams(List<KhjlParam> khjlParams) {
		this.khjlParams = khjlParams;
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

}
