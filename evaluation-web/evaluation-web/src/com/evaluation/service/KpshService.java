package com.evaluation.service;

import java.util.List;

import com.evaluation.view.KpshParam;
import com.evaluation.view.Score;

/**
 * �������ҵ���߼��ӿ�
 * @author yaojie
 */
public interface KpshService {

	/**
	 * ��ȡ�ҵĳɼ�
	 * @param kpshParam ������˲���ʵ��
	 * @return �ɼ�
	 */
	public Double getCurrentScore(KpshParam kpshParam);
	
	/**
	 * ����ݻ�ȡÿ�³ɼ�
	 * @param kpshParam ������˲���ʵ�����
	 * @return �ɼ��б�
	 */
	public List<Score> getScoreByYear(KpshParam kpshParam); 
	
}
