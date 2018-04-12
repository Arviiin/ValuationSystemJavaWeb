package com.evaluation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluation.service.KhjlService;
import com.evaluation.service.KpshService;
import com.evaluation.view.KpshParam;
import com.evaluation.view.Score;
import com.evaluation.view.ScoreParam;
import com.evaluation.view.ScoreView;
import com.evaluation.view.UserView;

/**
 * �ҵĳɼ�������
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/wdcj")
public class WdcjController {

	/** �������ҵ���߼��ӿ� **/
	@Autowired
	private KpshService kpshService;
	
	/** ���˼�¼ҵ���߼��ӿ� **/
	@Autowired
	private KhjlService khjlService;
	
	/**
	 * ��ȡ���³ɼ�
	 * @param request servlet����
	 * @return �ɼ�
	 */
	@RequestMapping("getCurrentScore")
	@ResponseBody
	public Double getCurrentScore(HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		KpshParam kpshParam = new KpshParam();
		kpshParam.setBkhrid(userView.getId());
		return kpshService.getCurrentScore(kpshParam);
	}
	
	/**
	 * ������ݻ�ȡ�ɼ�
	 * @param kpshParam ������˲���ʵ�� 
	 * @param request servlet����
	 * @return �ɼ�����
	 */
	@RequestMapping("getScoreByYear")
	@ResponseBody
	public List<Score> getScoreByYear(@RequestBody KpshParam kpshParam, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		kpshParam.setBkhrid(userView.getId());
		return kpshService.getScoreByYear(kpshParam);
	}
	
	/**
	 * ��ȡ�ɼ�����
	 * @param scoreParam �ɼ�����ʵ��
	 * @param request servlet����
	 * @return ���鼯��
	 */
	@RequestMapping("getScoreDetail")
	@ResponseBody
	public List<ScoreView> getScoreDetail(@RequestBody ScoreParam scoreParam, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		scoreParam.setBkhrid(userView.getId());
		return khjlService.getScoreDetail(scoreParam);
	}
}
