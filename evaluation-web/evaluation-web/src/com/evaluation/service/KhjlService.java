package com.evaluation.service;

import java.util.List;

import com.evaluation.view.KhjlObject;
import com.evaluation.view.ScoreParam;
import com.evaluation.view.ScoreView;

/**
 * ���˼�¼ҵ���߼��ӿ�
 * @author yaojie
 */
public interface KhjlService {

	/**
	 * ���뿼�˼�¼����
	 * @param khjlObject ���˼�¼����ʵ�����
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean insertKhjl(KhjlObject khjlObject);
	
	/**
	 * ��������·ݲ�ѯ��¼��
	 * @param scoreParam �ɼ�����ʵ��
	 * @return �ɼ�����ʵ���б�
	 */
	List<ScoreView> getScoreDetail(ScoreParam scoreParam);
}
