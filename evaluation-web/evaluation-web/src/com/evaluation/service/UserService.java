package com.evaluation.service;

import java.util.List;

import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * �û���Ϣ�ӿ�
 * @author yaojie
 */
public interface UserService {
	
	/**
	 * �û���¼
	 * @param userParam ��������
	 * @return User �û�����
	 */
	UserView getUserByZhxx(UserParam userParam);
	
	/**
	 * ��ȡ�û�
	 * @param userParam ��������
	 * @return List<User> �û�����
	 */
	List<UserView> getAllUsers(UserParam userParam);
	
	/**
	 * �����û�
	 * @param userParam ��������
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean insertUser(UserParam userParam);
	
	/**
	 * ɾ���û�����������
	 * @param userParam ��������
	 * @return boolean �ɹ���ʧ�ܱ�ʶ
	 */
	boolean updateUser(UserParam userParam);
	
	/**
	 * ��ȡ��������
	 * @param userParam ��������
	 * @return List<User> �û�����
	 */
	List<UserView> getKpdx(UserParam userParam);
}
