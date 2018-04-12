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
 * 用户管理控制器
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/yhgl")
public class YhglController {

	/** 用户业务逻辑接口 **/
	@Autowired
	private UserService userService;
	
	/**
	 * 获取所有用户
	 * @param userParam 用户参数实体
	 * @return 用户视图集合
	 */
	@RequestMapping("getUsers")
	@ResponseBody
	public List<UserView> getUsers(@RequestBody UserParam userParam) {
		return userService.getAllUsers(userParam);
	}
	
	/**
	 * 插入用户
	 * @param userParam 用户参数实体
	 * @return 成功或失败标识
	 */
	@RequestMapping("insertUser")
	@ResponseBody
	public boolean insertUser(@RequestBody UserParam userParam) {
		return userService.insertUser(userParam);
	}
	
	/**
	 * 更新用户（删除/重置密码）
	 * @param userParam 用户参数实体
	 * @return 成功或失败标识
	 */
	@RequestMapping("updateUser")
	@ResponseBody
	public boolean updateUser(@RequestBody UserParam userParam) {
		return userService.updateUser(userParam);
	}
}
