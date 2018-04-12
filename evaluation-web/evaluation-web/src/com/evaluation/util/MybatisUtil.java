package com.evaluation.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	/**
	 * 获取mybatis会话
	 * 
	 * @return SqlSession mybatis会话
	 * @throws IOException
	 */
	public static SqlSession getSession() throws IOException {
		String resource = "mybatis/mybatis.cfg.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		return builder.build(is).openSession();
	}
	
}
