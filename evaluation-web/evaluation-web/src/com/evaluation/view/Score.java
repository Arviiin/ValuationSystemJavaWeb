package com.evaluation.view;

import java.io.Serializable;

public class Score implements Serializable {

	private static final long serialVersionUID = 1L;

	private String khyf;

	private double df;

	public String getKhyf() {
		return khyf;
	}

	public void setKhyf(String khyf) {
		this.khyf = khyf;
	}

	public double getDf() {
		return df;
	}

	public void setDf(double df) {
		this.df = df;
	}

}
