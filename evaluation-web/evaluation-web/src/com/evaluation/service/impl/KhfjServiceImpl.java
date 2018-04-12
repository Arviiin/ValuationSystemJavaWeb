package com.evaluation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KhfjMapper;
import com.evaluation.entity.Khfj;
import com.evaluation.service.KhfjService;

/**
 * 考核分级业务逻辑接口实现
 * @author yaojie
 */
@Service
public class KhfjServiceImpl implements KhfjService {

	/** 考核分级数据访问接口 **/
	@Autowired
	private KhfjMapper khfjMapper;
	
	/**
	 * 删除考核分级数据
	 * @param id 编号
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean deleteKhfj(String id) {
		int count = khfjMapper.deleteKhfj(id);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 插入考核分级数据
	 * @param khfj 考核分级实体
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean insertKhfj(Khfj khfj) {
		int count = khfjMapper.insertKhfj(khfj);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

}
