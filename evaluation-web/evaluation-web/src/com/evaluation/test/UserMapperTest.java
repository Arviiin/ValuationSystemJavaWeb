package com.evaluation.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.evaluation.dao.UserMapper;
import com.evaluation.entity.User;
import com.evaluation.util.MybatisUtil;

public class UserMapperTest {

	public static void main(String[] args) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		/*User user = userMapper.getUserByZhxx("zhangsan", "123");
		System.out.println(user.getZh() + "," + user.getMm());*/
		
		/*List<User> users = userMapper.getAllUsers(null, null);
		for (User user : users) {
			System.out.println(user.getXm());
		}*/
		
		/*User user = new User();
		user.setId(MybatisUtil.getId());
		user.setZh("zhangzhijian");
		user.setMm("123456");
		user.setXm("��־��");
		user.setBm("����");
		user.setZw("DB");
		user.setZt("0");
		user.setDeleteflag("A");
		user.setOpratetime(new Date());
		user.setCreatetime(new Date());
		int count = userMapper.insertUser(user);
		session.commit();
		if (count > 0) {
			System.out.println("�û�����ɹ�");
		} else {
			System.out.println("�û�ʧ��");
		}*/
		
		/*int count = userMapper.deleteUser("1");
		session.commit();
		if (count > 0) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}*/
		
		/*int count = userMapper.resetPassword("2");
		session.commit();
		if (count > 0) {
			System.out.println("���óɹ�");
		} else {
			System.out.println("����ʧ��");
		}*/
		
		/*List<User> users = userMapper.getKpdx(null);
		for (User user : users) {
			System.out.println(user.getXm());
		}*/
		session.close();
	}

}
