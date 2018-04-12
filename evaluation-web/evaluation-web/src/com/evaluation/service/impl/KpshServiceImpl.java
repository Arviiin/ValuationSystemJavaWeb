package com.evaluation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KpshMapper;
import com.evaluation.service.KpshService;
import com.evaluation.util.DateUtil;
import com.evaluation.view.KpshParam;
import com.evaluation.view.Score;

/**
 * �������ҵ���߼��ӿ�ʵ��
 * @author yaojie
 */
@Service
public class KpshServiceImpl implements KpshService {

	/**
	 * ����������ݷ��ʽӿ�
	 */
	@Autowired
	private KpshMapper kpshMapper;
	
	/**
	 * ��ȡ�ҵĳɼ�
	 * @param kpshParam ������˲���ʵ��
	 * @return �ɼ�
	 */
	@Override
	public Double getCurrentScore(KpshParam kpshParam) {
		String khnd = DateUtil.getDate().get("year");
		String khyf = DateUtil.getDate().get("month");
		Double df = kpshMapper.getCurrentScore(khnd, khyf, kpshParam.getBkhrid());
		if (df == null) {
			df = 0.0;
		}
		return df;
	}

	/**
	 * ����ݻ�ȡÿ�³ɼ�
	 * @param kpshParam ������˲���ʵ�����
	 * @return �ɼ��б�
	 */
	@Override
	public List<Score> getScoreByYear(KpshParam kpshParam) {
		return kpshMapper.getScoreByYear(kpshParam.getKhnd(), kpshParam.getBkhrid());
	}
}
