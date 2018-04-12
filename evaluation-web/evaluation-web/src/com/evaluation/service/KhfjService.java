package com.evaluation.service;

import com.evaluation.entity.Khfj;

/**
 * 考核分级业务逻辑接口
 * @author yaojie
 */
public interface KhfjService {

	/**
	 * 删除考核分级数据
	 * @param id 编号
	 * @return boolean 成功或失败标识
	 */
	boolean deleteKhfj(String id);
	
	/**
	 * 插入考核分级数据
	 * @param khfj 考核分级实体
	 * @return boolean 成功或失败标识
	 */
	boolean insertKhfj(Khfj khfj);
}
