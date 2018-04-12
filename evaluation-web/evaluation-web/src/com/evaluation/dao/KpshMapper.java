package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Kpsh;
import com.evaluation.view.Score;


/**
 * 考评审核（我的成绩）数据访问接口
 * @author yaojie
 */
public interface KpshMapper {

	/**
	 * 查询考评审核（我的成绩）
	 * @param khyf 考核月份
	 * @param bkhrid 被考核人编号
	 * @return 考评审核（我的成绩）
	 */
	public Double getCurrentScore(@Param("khnd") String khnd, @Param("khyf") String khyf, @Param("bkhrid") String bkhrid);
	
	/**
	 * 查询考评审核（我的成绩）
	 * @param khnd 考核年度
	 * @param bkhrid 被考核人编号
	 * @return 考评审核（我的成绩）
	 */
	public List<Score> getScoreByYear(@Param("khnd") String khnd, @Param("bkhrid") String bkhrid);
	
	/**
	 * 插入考评审核
	 * @param kpsh 考评审核实体
	 * @return 成功或失败标识
	 */
	public int insertKpsh(Kpsh kpsh);
}
