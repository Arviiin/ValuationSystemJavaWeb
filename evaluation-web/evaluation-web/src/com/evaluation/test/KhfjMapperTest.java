package com.evaluation.test;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.evaluation.dao.KhfjMapper;
import com.evaluation.entity.Khfj;
import com.evaluation.util.MybatisUtil;

public class KhfjMapperTest {

	public static void main(String[] args) throws IOException {
		
		SqlSession session = MybatisUtil.getSession();
		KhfjMapper khfjMapper = session.getMapper(KhfjMapper.class);
		
		/*Khfj khfj = khfjMapper.getKhfjByKpzb("6c4625a8284340d79a3b63f78d2a7e34");
		System.out.println(khfj.getFjnr() + "," + khfj.getFz());*/
		
		/*Khfj khfj = new Khfj();
		String id = MybatisUtil.getId();
		khfj.setId(id);
		khfj.setSszbid("ba04a0d4477443599c47e45d093d09a4");
		khfj.setFjnr("分级内容");
		khfj.setFz("50");
		khfj.setDeleteflag("A");
		khfj.setCreatetime(new Date());
		khfj.setOpratetime(new Date());
		int count = khfjMapper.insertKhfj(khfj);
		session.commit();
		if (count > 0) {
			System.out.println("插入成功");
		} else {
			System.out.println("插入失败");
		}*/
		
		/*int count = khfjMapper.deleteKhfj("6c4625a8284340d79a3b63f78d2a7e34");
		session.commit();
		if (count > 0) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}*/
		
		session.close();
	}

}
