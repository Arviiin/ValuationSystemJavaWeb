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
 * �û���Ϣ�ӿ�ʵ��
 * @author yaojie
 */
@Service
public class UserServiceImpl implements UserService {

	/** �û���Ϣ���ݷ��ʽӿ� **/
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * �û���¼
	 * @param userParam �û�����ʵ��
	 * @return User �û�����
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
	 * ��ȡ�û�
	 * @param userParam �û�����ʵ��
	 * @return List<User> �û�����
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
	 * �����û�
	 * @param userParam �û�����ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
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
	 * ɾ���û�����������
	 * @param userParam �û�����ʵ��
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
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
	 * ��ȡ��������
	 * @param userParam �û�����ʵ��
	 * @return List<UserView> �û���ͼ����
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
