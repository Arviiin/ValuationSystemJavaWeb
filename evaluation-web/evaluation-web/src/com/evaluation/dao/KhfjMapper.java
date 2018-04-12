package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Khfj;

/**
 * ���˷ּ����ݷ��ʽӿ�
 * @author yaojie
 */
public interface KhfjMapper {

	/**
	 * ��ȡ���˷ּ�����
	 * @param id ���
	 * @return Khfj ���˷ּ�ʵ��
	 */
	List<Khfj> getKhfjByKpzb(@Param("id") String id);
	
	/**
	 * ɾ�����˷ּ�����
	 * @param id ���
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int deleteKhfj(@Param("id") String id);
	
	/**
	 * ���뿼�˷ּ�����
	 * @param khfj ���˷ּ�ʵ��
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int insertKhfj(Khfj khfj);
}
