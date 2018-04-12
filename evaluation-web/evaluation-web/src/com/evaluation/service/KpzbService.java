package com.evaluation.service;

import java.util.List;

import com.evaluation.entity.Kpzb;
import com.evaluation.view.KpzbView;

/**
 * ����ָ��ҵ���߼��ӿ�
 * @author yaojie
 */
public interface KpzbService {

	/**
	 * ��ȡ���п���ָ��
	 * @return List<KpzbView> ����ָ�꼯��
	 */
	List<KpzbView> getAllKhzb();
	
	/**
	 * ���뿼��ָ��
	 * @param kpzb ����ָ��ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean insertKpzb(Kpzb kpzb);
	
	/**
	 * ɾ������ָ��
	 * @param id ���
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean deleteKpzb(String id);
	
	/**
	 * ���¿���ָ��
	 * @param kpzb ����ָ��ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean updateKpzb(Kpzb kpzb);
}
