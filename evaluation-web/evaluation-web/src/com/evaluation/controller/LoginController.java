package com.evaluation.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluation.service.UserService;
import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * 登录控制器
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation")
public class LoginController {

	/** 用户业务逻辑接口 **/
	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 * @param userParam 用户参数实体
	 * @return 用户视图
	 */
	@RequestMapping("login")
	@ResponseBody
	public UserView login(@RequestBody UserParam userParam, HttpServletRequest request) {
		UserView userView = userService.getUserByZhxx(userParam);
		if (userView != null) {
			request.getSession().setAttribute("userInfo", userView);
		}
		return userView;
	}
	
	/**
	 * 注销
	 * @return 成功或失败标识
	 */
	@RequestMapping("logout")
	@ResponseBody
	public boolean logout(HttpServletRequest request) {
		request.getSession().removeAttribute("userInfo");
		return true;
	}
	
	/**
	 * 校验登录
	 * @return 成功或失败标识
	 */
	@RequestMapping("checkLogin")
	@ResponseBody
	public boolean checkLogin(HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		boolean flag = false;
		if (userView != null) {
			flag = true;
		}
		return flag;
	}
	
}
