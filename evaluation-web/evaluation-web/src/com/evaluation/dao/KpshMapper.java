package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.Kpsh;
import com.evaluation.view.Score;


/**
 * ������ˣ��ҵĳɼ������ݷ��ʽӿ�
 * @author yaojie
 */
public interface KpshMapper {

	/**
	 * ��ѯ������ˣ��ҵĳɼ���
	 * @param khyf �����·�
	 * @param bkhrid �������˱��
	 * @return ������ˣ��ҵĳɼ���
	 */
	public Double getCurrentScore(@Param("khnd") String khnd, @Param("khyf") String khyf, @Param("bkhrid") String bkhrid);
	
	/**
	 * ��ѯ������ˣ��ҵĳɼ���
	 * @param khnd �������
	 * @param bkhrid �������˱��
	 * @return ������ˣ��ҵĳɼ���
	 */
	public List<Score> getScoreByYear(@Param("khnd") String khnd, @Param("bkhrid") String bkhrid);
	
	/**
	 * ���뿼�����
	 * @param kpsh �������ʵ��
	 * @return �ɹ���ʧ�ܱ�ʶ
	 */
	public int insertKpsh(Kpsh kpsh);
}
