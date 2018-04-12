package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Khjl;

/**
 * 考核记录数据访问接口
 * @author yaojie
 */
public interface KhjlMapper {

	/**
	 * 插入考核记录数据
	 * @param khjl 考核记录实体对象
	 * @return int 成功或失败标识
	 */
	int insertKhjl(Khjl khjl);
	
	/**
	 * 根据年份月份查询某用户成绩
	 * @param khnd 考核年度
	 * @param khyf 考核月份
	 * @param bkhrid 被考核人编号
	 * @return 考核记录
	 */
	List<Khjl> getScoreDetail(@Param("khnd")String khnd, @Param("khyf")String khyf, @Param("bkhrid")String bkhrid);
}
