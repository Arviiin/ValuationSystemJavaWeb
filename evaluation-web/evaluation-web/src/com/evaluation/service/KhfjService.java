package com.evaluation.service;

import com.evaluation.entity.Khfj;

/**
 * ���˷ּ�ҵ���߼��ӿ�
 * @author yaojie
 */
public interface KhfjService {

	/**
	 * ɾ�����˷ּ�����
	 * @param id ���
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean deleteKhfj(String id);
	
	/**
	 * ���뿼�˷ּ�����
	 * @param khfj ���˷ּ�ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean insertKhfj(Khfj khfj);
}
