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
 * 我的成绩控制器
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/wdcj")
public class WdcjController {

	/** 考评审核业务逻辑接口 **/
	@Autowired
	private KpshService kpshService;
	
	/** 考核记录业务逻辑接口 **/
	@Autowired
	private KhjlService khjlService;
	
	/**
	 * 获取当月成绩
	 * @param request servlet请求
	 * @return 成绩
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
	 * 根据年份获取成绩
	 * @param kpshParam 考评审核参数实体 
	 * @param request servlet请求
	 * @return 成绩集合
	 */
	@RequestMapping("getScoreByYear")
	@ResponseBody
	public List<Score> getScoreByYear(@RequestBody KpshParam kpshParam, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		kpshParam.setBkhrid(userView.getId());
		return kpshService.getScoreByYear(kpshParam);
	}
	
	/**
	 * 获取成绩详情
	 * @param scoreParam 成绩参数实体
	 * @param request servlet请求
	 * @return 详情集合
	 */
	@RequestMapping("getScoreDetail")
	@ResponseBody
	public List<ScoreView> getScoreDetail(@RequestBody ScoreParam scoreParam, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		scoreParam.setBkhrid(userView.getId());
		return khjlService.getScoreDetail(scoreParam);
	}
}
