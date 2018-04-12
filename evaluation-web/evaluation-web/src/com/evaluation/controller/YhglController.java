package com.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluation.service.UserService;
import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * �û����������
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/yhgl")
public class YhglController {

	/** �û�ҵ���߼��ӿ� **/
	@Autowired
	private UserService userService;
	
	/**
	 * ��ȡ�����û�
	 * @param userParam �û�����ʵ��
	 * @return �û���ͼ����
	 */
	@RequestMapping("getUsers")
	@ResponseBody
	public List<UserView> getUsers(@RequestBody UserParam userParam) {
		return userService.getAllUsers(userParam);
	}
	
	/**
	 * �����û�
	 * @param userParam �û�����ʵ��
	 * @return �ɹ���ʧ�ܱ�ʶ
	 */
	@RequestMapping("insertUser")
	@ResponseBody
	public boolean insertUser(@RequestBody UserParam userParam) {
		return userService.insertUser(userParam);
	}
	
	/**
	 * �����û���ɾ��/�������룩
	 * @param userParam �û�����ʵ��
	 * @return �ɹ���ʧ�ܱ�ʶ
	 */
	@RequestMapping("updateUser")
	@ResponseBody
	public boolean updateUser(@RequestBody UserParam userParam) {
		return userService.updateUser(userParam);
	}
}
