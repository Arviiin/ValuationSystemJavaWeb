package com.evaluation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KpshMapper;
import com.evaluation.service.KpshService;
import com.evaluation.util.DateUtil;
import com.evaluation.view.KpshParam;
import com.evaluation.view.Score;

/**
 * 考评审核业务逻辑接口实现
 * @author yaojie
 */
@Service
public class KpshServiceImpl implements KpshService {

	/**
	 * 考评审核数据访问接口
	 */
	@Autowired
	private KpshMapper kpshMapper;
	
	/**
	 * 获取我的成绩
	 * @param kpshParam 考评审核参数实体
	 * @return 成绩
	 */
	@Override
	public Double getCurrentScore(KpshParam kpshParam) {
		String khnd = DateUtil.getDate().get("year");
		String khyf = DateUtil.getDate().get("month");
		Double df = kpshMapper.getCurrentScore(khnd, khyf, kpshParam.getBkhrid());
		if (df == null) {
			df = 0.0;
		}
		return df;
	}

	/**
	 * 按年份获取每月成绩
	 * @param kpshParam 考评审核参数实体对象
	 * @return 成绩列表
	 */
	@Override
	public List<Score> getScoreByYear(KpshParam kpshParam) {
		return kpshMapper.getScoreByYear(kpshParam.getKhnd(), kpshParam.getBkhrid());
	}
}
