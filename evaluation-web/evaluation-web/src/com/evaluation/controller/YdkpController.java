package com.evaluation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluation.service.KhjlService;
import com.evaluation.service.KpzbService;
import com.evaluation.service.UserService;
import com.evaluation.view.KhjlObject;
import com.evaluation.view.KpzbView;
import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * 月度考核控制器
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/ydkp")
public class YdkpController {

	/** 用户业务逻辑接口 **/
	@Autowired
	private UserService userService;
	
	/** 考评指标业务逻辑接口 **/
	@Autowired
	private KpzbService kpzbService;
	
	/** 考核记录业务逻辑接口 **/
	@Autowired
	private KhjlService khjlService;
	
	/**
	 * 获取考评对象列表
	 * @param userParam 考评对象参数实体
	 * @return 考评对象视图列表
	 */
	@RequestMapping("getKpdx")
	@ResponseBody
	public List<UserView> getKpdx(@RequestBody UserParam userParam) {
		return userService.getKpdx(userParam);
	}
	
	/**
	 * 获取考评指标
	 * @return List<KpzbView> 考评指标视图列表
	 */
	@RequestMapping("getKpzb")
	@ResponseBody
	public List<KpzbView> getKpzb() {
		return kpzbService.getAllKhzb();
	}
	
	/**
	 * 插入考核记录表及考评审核表
	 * @param khjlParams 考核记录参数实体集合
	 * @return 成功或失败标识
	 */
	@RequestMapping("insertKhjl")
	@ResponseBody
	public boolean insertKhjl(@RequestBody KhjlObject khjlObject, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		khjlObject.setKhrid(userView.getId());
		khjlObject.setKhrxm(userView.getXm());
		return khjlService.insertKhjl(khjlObject);
	}
	
}
