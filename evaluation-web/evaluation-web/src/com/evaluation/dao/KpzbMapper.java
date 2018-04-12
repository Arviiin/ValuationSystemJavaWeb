package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Kpzb;

/**
 * ����ָ�����ݷ��ʽӿ�
 * @author yaojie
 */
public interface KpzbMapper {

	/**
	 * ��ȡ���п���ָ��
	 * @return List<Kpzb> ����ָ�꼯��
	 */
	List<Kpzb> getAllKhzb();
	
	/**
	 * ��ȡ���п���ָ��
	 * @param id ����ָ����
	 * @return Kpzb ����ָ��
	 */
	Kpzb getKpzbById(@Param("id") String id);
	
	/**
	 * ���뿼��ָ��
	 * @param kpzb ����ָ��ʵ��
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int insertKpzb(Kpzb kpzb);
	
	/**
	 * ɾ������ָ��
	 * @param id ���
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int deleteKpzb(@Param("id") String id);
	
	/**
	 * ���¿���ָ��
	 * @param kpzb ����ָ��ʵ��
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int updateKpzb(Kpzb kpzb);
}
