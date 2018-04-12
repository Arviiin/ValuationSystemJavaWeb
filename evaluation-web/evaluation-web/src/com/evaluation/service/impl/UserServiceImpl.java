package com.evaluation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.UserMapper;
import com.evaluation.entity.User;
import com.evaluation.service.UserService;
import com.evaluation.util.KeyUtil;
import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * 用户信息接口实现
 * @author yaojie
 */
@Service
public class UserServiceImpl implements UserService {

	/** 用户信息数据访问接口 **/
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 用户登录
	 * @param userParam 用户参数实体
	 * @return User 用户对象
	 */
	@Override
	public UserView getUserByZhxx(UserParam userParam) {
		User user = userMapper.getUserByZhxx(userParam.getZh(), userParam.getMm());
		UserView view = null;
		if (user != null) {
			view = new UserView();
			view.setId(user.getId());
			view.setZh(user.getZh());
			view.setMm(user.getMm());
			view.setBm(user.getBm());
			view.setXm(user.getXm());
			view.setZw(user.getZw());
			view.setZt(user.getZt());
			view.setDeleteflag(user.getDeleteflag());
			view.setCreatetime(user.getCreatetime());
			view.setOpratetime(user.getOpratetime());
		}
		return view;
	}

	/**
	 * 获取用户
	 * @param userParam 用户参数实体
	 * @return List<User> 用户集合
	 */
	@Override
	public List<UserView> getAllUsers(UserParam userParam) {
		List<User> userList = userMapper.getAllUsers(userParam.getXm(), userParam.getZw());
		List<UserView> viewList = new ArrayList<UserView>();
		for (User user : userList) {
			UserView view = new UserView();
			view.setId(user.getId());
			view.setZh(user.getZh());
			view.setMm(user.getMm());
			view.setBm(user.getBm());
			view.setXm(user.getXm());
			view.setZw(user.getZw());
			view.setZt(user.getZt());
			view.setDeleteflag(user.getDeleteflag());
			view.setCreatetime(user.getCreatetime());
			view.setOpratetime(user.getOpratetime());
			viewList.add(view);
		}
		return viewList;
	}

	/**
	 * 新增用户
	 * @param userParam 用户参数实体
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean insertUser(UserParam userParam) {
		User user = new User();
		user.setId(KeyUtil.getId());
		user.setZh(userParam.getZh());
		user.setXm(userParam.getXm());
		user.setZw(userParam.getZw());
		user.setBm(userParam.getBm());
		user.setMm("111111");
		user.setZt("0");
		user.setDeleteflag("A");
		user.setCreatetime(new Date());
		user.setOpratetime(new Date());
		int count = userMapper.insertUser(user);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 删除用户、重置密码
	 * @param userParam 用户参数实体
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean updateUser(UserParam userParam) {
		if ("d".equals(userParam.getFlag())) {
			String[] ids = userParam.getIds();
			for (String id : ids) {
				userMapper.deleteUser(id);
			}
		}
		if ("r".equals(userParam.getFlag())) {
			String[] ids = userParam.getIds();
			for (String id : ids) {
				userMapper.resetPassword(id);
			}
		}
		return true;
	}
	
	/**
	 * 获取考评对象
	 * @param userParam 用户参数实体
	 * @return List<UserView> 用户视图集合
	 */
	@Override
	public List<UserView> getKpdx(UserParam userParam) {
		List<User> userList = userMapper.getKpdx(userParam.getXm());
		List<UserView> viewList = new ArrayList<UserView>();
		for (User user : userList) {
			UserView view = new UserView();
			view.setId(user.getId());
			view.setZh(user.getZh());
			view.setMm(user.getMm());
			view.setBm(user.getBm());
			view.setXm(user.getXm());
			view.setZw(user.getZw());
			view.setZt(user.getZt());
			view.setDeleteflag(user.getDeleteflag());
			view.setCreatetime(user.getCreatetime());
			view.setOpratetime(user.getOpratetime());
			viewList.add(view);
		}
		return viewList;
	}

}
