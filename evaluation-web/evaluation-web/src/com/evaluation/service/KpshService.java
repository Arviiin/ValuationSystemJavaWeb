package com.evaluation.service;

import java.util.List;

import com.evaluation.view.KpshParam;
import com.evaluation.view.Score;

/**
 * 考评审核业务逻辑接口
 * @author yaojie
 */
public interface KpshService {

	/**
	 * 获取我的成绩
	 * @param kpshParam 考评审核参数实体
	 * @return 成绩
	 */
	public Double getCurrentScore(KpshParam kpshParam);
	
	/**
	 * 按年份获取每月成绩
	 * @param kpshParam 考评审核参数实体对象
	 * @return 成绩列表
	 */
	public List<Score> getScoreByYear(KpshParam kpshParam); 
	
}
