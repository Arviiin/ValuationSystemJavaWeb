package com.evaluation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KhfjMapper;
import com.evaluation.entity.Khfj;
import com.evaluation.service.KhfjService;

/**
 * ���˷ּ�ҵ���߼��ӿ�ʵ��
 * @author yaojie
 */
@Service
public class KhfjServiceImpl implements KhfjService {

	/** ���˷ּ����ݷ��ʽӿ� **/
	@Autowired
	private KhfjMapper khfjMapper;
	
	/**
	 * ɾ�����˷ּ�����
	 * @param id ���
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
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
	 * ���뿼�˷ּ�����
	 * @param khfj ���˷ּ�ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
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
