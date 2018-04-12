package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Khjl;

/**
 * ���˼�¼���ݷ��ʽӿ�
 * @author yaojie
 */
public interface KhjlMapper {

	/**
	 * ���뿼�˼�¼����
	 * @param khjl ���˼�¼ʵ�����
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int insertKhjl(Khjl khjl);
	
	/**
	 * ��������·ݲ�ѯĳ�û��ɼ�
	 * @param khnd �������
	 * @param khyf �����·�
	 * @param bkhrid �������˱��
	 * @return ���˼�¼
	 */
	List<Khjl> getScoreDetail(@Param("khnd")String khnd, @Param("khyf")String khyf, @Param("bkhrid")String bkhrid);
}
