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
 * ��¼������
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation")
public class LoginController {

	/** �û�ҵ���߼��ӿ� **/
	@Autowired
	private UserService userService;
	
	/**
	 * ��¼
	 * @param userParam �û�����ʵ��
	 * @return �û���ͼ
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
	 * ע��
	 * @return �ɹ���ʧ�ܱ�ʶ
	 */
	@RequestMapping("logout")
	@ResponseBody
	public boolean logout(HttpServletRequest request) {
		request.getSession().removeAttribute("userInfo");
		return true;
	}
	
	/**
	 * У���¼
	 * @return �ɹ���ʧ�ܱ�ʶ
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
