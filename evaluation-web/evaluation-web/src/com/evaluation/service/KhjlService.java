package com.evaluation.service;

import java.util.List;

import com.evaluation.view.KhjlObject;
import com.evaluation.view.ScoreParam;
import com.evaluation.view.ScoreView;

/**
 * 考核记录业务逻辑接口
 * @author yaojie
 */
public interface KhjlService {

	/**
	 * 插入考核记录数据
	 * @param khjlObject 考核记录参数实体对象
	 * @return boolean 成功或失败标识
	 */
	boolean insertKhjl(KhjlObject khjlObject);
	
	/**
	 * 根据年份月份查询记录表
	 * @param scoreParam 成绩参数实体
	 * @return 成绩详情实体列表
	 */
	List<ScoreView> getScoreDetail(ScoreParam scoreParam);
}
