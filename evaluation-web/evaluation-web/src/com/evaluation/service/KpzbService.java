package com.evaluation.service;

import java.util.List;

import com.evaluation.entity.Kpzb;
import com.evaluation.view.KpzbView;

/**
 * 考评指标业务逻辑接口
 * @author yaojie
 */
public interface KpzbService {

	/**
	 * 获取所有考核指标
	 * @return List<KpzbView> 考核指标集合
	 */
	List<KpzbView> getAllKhzb();
	
	/**
	 * 插入考评指标
	 * @param kpzb 考评指标实体
	 * @return boolean 成功或失败标识
	 */
	boolean insertKpzb(Kpzb kpzb);
	
	/**
	 * 删除考评指标
	 * @param id 编号
	 * @return boolean 成功或失败标识
	 */
	boolean deleteKpzb(String id);
	
	/**
	 * 更新考评指标
	 * @param kpzb 考评指标实体
	 * @return boolean 成功或失败标识
	 */
	boolean updateKpzb(Kpzb kpzb);
}
