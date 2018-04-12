package com.evaluation.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.evaluation.entity.User;

/**
 * �û���Ϣ���ݷ��ʽӿ�
 * @author yaojie
 */
public interface UserMapper {
	
	/**
	 * �û���¼
	 * @param zh �˺�
	 * @param mm ����
	 * @return User �û�����
	 */
	User getUserByZhxx(@Param("zh") String zh, @Param("mm") String mm);
	
	/**
	 * �����û���Ų�ѯ�û�
	 * @param id ���
	 * @return User �û�����
	 */
	User getUserById(@Param("id") String id);
	
	/**
	 * ��ȡ�û�
	 * @param xm ����
	 * @param zw ְλ
	 * @return List<User> �û�����
	 */
	List<User> getAllUsers(@Param("xm") String xm, @Param("zw") String zw);

	/**
	 * �����û�
	 * @param user �û�����
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int insertUser(User user);
	
	/**
	 * ɾ���û�
	 * @param id ���
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int deleteUser(@Param("id") String id);
	
	/**
	 * ��������
	 * @param id ���
	 * @return int �ɹ���ʧ�ܱ�ʶ
	 */
	int resetPassword(@Param("id") String id);
	
	/**
	 * ��ȡ��������
	 * @param xm ����
	 * @return List<User> �û�����
	 */
	List<User> getKpdx(@Param("xm") String xm);
}
