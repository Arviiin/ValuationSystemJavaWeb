package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Khfj;

/**
 * 考核分级数据访问接口
 * @author yaojie
 */
public interface KhfjMapper {

	/**
	 * 获取考核分级数据
	 * @param id 编号
	 * @return Khfj 考核分级实体
	 */
	List<Khfj> getKhfjByKpzb(@Param("id") String id);
	
	/**
	 * 删除考核分级数据
	 * @param id 编号
	 * @return int 成功或失败标识
	 */
	int deleteKhfj(@Param("id") String id);
	
	/**
	 * 插入考核分级数据
	 * @param khfj 考核分级实体
	 * @return int 成功或失败标识
	 */
	int insertKhfj(Khfj khfj);
}
