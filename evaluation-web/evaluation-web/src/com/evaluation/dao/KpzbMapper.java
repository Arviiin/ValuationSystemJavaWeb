package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Kpzb;

/**
 * 考评指标数据访问接口
 * @author yaojie
 */
public interface KpzbMapper {

	/**
	 * 获取所有考核指标
	 * @return List<Kpzb> 考核指标集合
	 */
	List<Kpzb> getAllKhzb();
	
	/**
	 * 获取所有考核指标
	 * @param id 考评指标编号
	 * @return Kpzb 考核指标
	 */
	Kpzb getKpzbById(@Param("id") String id);
	
	/**
	 * 插入考评指标
	 * @param kpzb 考评指标实体
	 * @return int 成功或失败标识
	 */
	int insertKpzb(Kpzb kpzb);
	
	/**
	 * 删除考评指标
	 * @param id 编号
	 * @return int 成功或失败标识
	 */
	int deleteKpzb(@Param("id") String id);
	
	/**
	 * 更新考评指标
	 * @param kpzb 考评指标实体
	 * @return int 成功或失败标识
	 */
	int updateKpzb(Kpzb kpzb);
}
