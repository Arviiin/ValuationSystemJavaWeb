package com.evaluation.test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.evaluation.dao.KhjlMapper;
import com.evaluation.entity.Khjl;
import com.evaluation.util.MybatisUtil;

public class KhjlMapperTest {

	public static void main(String[] args) throws IOException {
		SqlSession session = MybatisUtil.getSession();
		KhjlMapper khjlMapper = session.getMapper(KhjlMapper.class);

		/*Khjl khjl = new Khjl();
		String id = MybatisUtil.getId();
		khjl.setId(id);
		khjl.setDeleteflag("A");
		khjl.setCreatetime(new Date());
		khjl.setOpratetime(new Date());
		int count = khjlMapper.insertKhjl(khjl);
		session.commit();
		if (count > 0) {
			System.out.println("插入成功");
		} else {
			System.out.println("插入失败");
		}*/
		
		session.close();
	}

}
