package com.evaluation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KhjlMapper;
import com.evaluation.dao.KpshMapper;
import com.evaluation.dao.KpzbMapper;
import com.evaluation.dao.UserMapper;
import com.evaluation.entity.Khjl;
import com.evaluation.entity.Kpsh;
import com.evaluation.entity.Kpzb;
import com.evaluation.entity.User;
import com.evaluation.service.KhjlService;
import com.evaluation.util.DateUtil;
import com.evaluation.util.KeyUtil;
import com.evaluation.view.KhjlObject;
import com.evaluation.view.KhjlParam;
import com.evaluation.view.ScoreParam;
import com.evaluation.view.ScoreView;

/**
 * ���˼�¼ҵ���߼��ӿ�ʵ��
 * @author yaojie
 */
@Service
public class KhjlServiceImpl implements KhjlService {

	/** �û����ݷ��ʽӿ� **/
	@Autowired
	private UserMapper userMapper;
	
	/** ���˼�¼���ݷ��ʽӿ� **/
	@Autowired
	private KhjlMapper khjlMapper;
	
	/** ����ָ�����ݷ��ʽӿ� **/
	@Autowired
	private KpzbMapper kpzbMapper;
	
	/** ����������ݷ��ʽӿ� **/
	@Autowired
	private KpshMapper kpshMapper;
	
	/**
	 * ���뿼�˼�¼����
	 * @param khjl ���˼�¼ʵ�����
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	@Override
	public boolean insertKhjl(KhjlObject khjlObject) {
		boolean flag = true;
		int df = 0;
		// ����id��ȡ�û���Ϣ
		User user = userMapper.getUserById(khjlObject.getBkhrid());
		List<KhjlParam> khjlParams = khjlObject.getKhjlParams();
		// �������뿼�˼�¼��
		if (CollectionUtils.isNotEmpty(khjlParams)) {
			for (KhjlParam khjlParam : khjlParams) {
				Khjl khjl = new Khjl();
				khjl.setId(KeyUtil.getId());
				khjl.setKhnd(DateUtil.getDate().get("year"));
				khjl.setKhyf(DateUtil.getDate().get("month"));
				khjl.setBkhrid(user.getId());
				khjl.setBkhrxm(user.getXm());
				khjl.setKhzbid(khjlParam.getKhzbid());
				khjl.setKhfjid(khjlParam.getKhfjid());
				khjl.setFjdf(khjlParam.getFjdf());
				df += Integer.valueOf(khjlParam.getFjdf());
				khjl.setKhrid(khjlObject.getKhrid());
				khjl.setKhrxm(khjlObject.getKhrxm());
				khjl.setDeleteflag("A");
				khjl.setCreatetime(new Date());
				khjl.setOpratetime(new Date());
				khjlMapper.insertKhjl(khjl);
			}
		} else {
			flag = false;
		}
		// ���뿼����˱�
		Kpsh kpsh = new Kpsh();
		kpsh.setId(KeyUtil.getId());
		kpsh.setKhnd(DateUtil.getDate().get("year"));
		kpsh.setKhyf(DateUtil.getDate().get("month"));
		kpsh.setBkhrid(user.getId());
		kpsh.setBkhrxm(user.getXm());
		kpsh.setKhrid(khjlObject.getKhrid());
		kpsh.setKhrxm(khjlObject.getKhrxm());
		kpsh.setDf(String.valueOf(df));
		kpsh.setDeleteflag("A");
		kpsh.setCreatetime(new Date());
		kpsh.setOpratetime(new Date());
		int count = kpshMapper.insertKpsh(kpsh);
		if (count == 0) {
			flag = false;
		}
		return flag;
	}

	/**
	 * ��ȡ�ɼ���ϸ�б�
	 * @param scoreParam �ɼ�����ʵ��
	 * @return �ɼ������б�
	 */
	@Override
	public List<ScoreView> getScoreDetail(ScoreParam scoreParam) {
		List<Khjl> khjlList = khjlMapper.getScoreDetail(scoreParam.getKhnd(), scoreParam.getKhyf(), scoreParam.getBkhrid());
		List<ScoreView> scoreViews = new ArrayList<ScoreView>();
		for (Khjl khjl : khjlList) {
			ScoreView scoreView = new ScoreView();
			Kpzb kpzb = kpzbMapper.getKpzbById(khjl.getKhzbid());
			scoreView.setFjdf(khjl.getFjdf());
			scoreView.setZbmc(kpzb.getZbmc());
			scoreView.setFz(kpzb.getFz());
			scoreViews.add(scoreView);
		}
		return scoreViews;
	}
	
}
