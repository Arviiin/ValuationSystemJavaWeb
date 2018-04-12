package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.User;

/**
 * 用户信息数据访问接口
 * @author yaojie
 */
public interface UserMapper {
	
	/**
	 * 用户登录
	 * @param zh 账号
	 * @param mm 密码
	 * @return User 用户对象
	 */
	User getUserByZhxx(@Param("zh") String zh, @Param("mm") String mm);
	
	/**
	 * 根据用户编号查询用户
	 * @param id 编号
	 * @return User 用户对象
	 */
	User getUserById(@Param("id") String id);
	
	/**
	 * 获取用户
	 * @param xm 姓名
	 * @param zw 职位
	 * @return List<User> 用户集合
	 */
	List<User> getAllUsers(@Param("xm") String xm, @Param("zw") String zw);

	/**
	 * 新增用户
	 * @param user 用户对象
	 * @return int 成功或失败标识
	 */
	int insertUser(User user);
	
	/**
	 * 删除用户
	 * @param id 编号
	 * @return int 成功或失败标识
	 */
	int deleteUser(@Param("id") String id);
	
	/**
	 * 重置密码
	 * @param id 编号
	 * @return int 成功或失败标识
	 */
	int resetPassword(@Param("id") String id);
	
	/**
	 * 获取考评对象
	 * @param xm 姓名
	 * @return List<User> 用户集合
	 */
	List<User> getKpdx(@Param("xm") String xm);
}
