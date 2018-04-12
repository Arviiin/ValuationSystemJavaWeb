package com.evaluation.service;

import java.util.List;

import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * 用户信息接口
 * @author yaojie
 */
public interface UserService {
	
	/**
	 * 用户登录
	 * @param userParam 参数对象
	 * @return User 用户对象
	 */
	UserView getUserByZhxx(UserParam userParam);
	
	/**
	 * 获取用户
	 * @param userParam 参数对象
	 * @return List<User> 用户集合
	 */
	List<UserView> getAllUsers(UserParam userParam);
	
	/**
	 * 新增用户
	 * @param userParam 参数对象
	 * @return boolean 成功或失败标识
	 */
	boolean insertUser(UserParam userParam);
	
	/**
	 * 删除用户、重置密码
	 * @param userParam 参数对象
	 * @return boolean 成功或失败标识
	 */
	boolean updateUser(UserParam userParam);
	
	/**
	 * 获取考评对象
	 * @param userParam 参数对象
	 * @return List<User> 用户集合
	 */
	List<UserView> getKpdx(UserParam userParam);
}
