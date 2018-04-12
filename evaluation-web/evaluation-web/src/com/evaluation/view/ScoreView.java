package com.evaluation.view;

import java.io.Serializable;

public class ScoreView implements Serializable {

	private static final long serialVersionUID = 1L;

	private String zbmc;

	private String fz;

	private String fjdf;

	public String getZbmc() {
		return zbmc;
	}

	public void setZbmc(String zbmc) {
		this.zbmc = zbmc;
	}

	public String getFz() {
		return fz;
	}

	public void setFz(String fz) {
		this.fz = fz;
	}

	public String getFjdf() {
		return fjdf;
	}

	public void setFjdf(String fjdf) {
		this.fjdf = fjdf;
	}

}
