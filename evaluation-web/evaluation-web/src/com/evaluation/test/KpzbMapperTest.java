package com.evaluation.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.evaluation.dao.KpzbMapper;
import com.evaluation.entity.Kpzb;
import com.evaluation.util.MybatisUtil;

public class KpzbMapperTest {

	public static void main(String[] args) throws IOException {
		
		SqlSession session = MybatisUtil.getSession();
		KpzbMapper kpzbMapper = session.getMapper(KpzbMapper.class);
		
		/*List<Kpzb> kpzbs = kpzbMapper.getAllKhzb();
		for (Kpzb kpzb : kpzbs) {
			System.out.println(kpzb.getZbmc() + "," + kpzb.getFz());
		}*/
		
		/*Kpzb kpzb = new Kpzb();
		String id = MybatisUtil.getId();
		kpzb.setId(id);
		kpzb.setZbmc("ָ������");
		kpzb.setFz("30");
		kpzb.setDeleteflag("A");
		kpzb.setCreatetime(new Date());
		kpzb.setOpratetime(new Date());
		int count = kpzbMapper.insertKpzb(kpzb);
		session.commit();
		if (count > 0) {
			System.out.println("����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}*/
		
		/*int count = kpzbMapper.deleteKpzb("ba04a0d4477443599c47e45d093d09a4");
		session.commit();
		if (count > 0) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}*/
		
		/*Kpzb kpzb = new Kpzb();
		kpzb.setId("ba04a0d4477443599c47e45d093d09a4");
		kpzb.setZbmc("ָ������1");
		kpzb.setFz("50");
		kpzb.setDeleteflag("U");
		kpzb.setOpratetime(new Date());
		int count = kpzbMapper.updateKpzb(kpzb);
		session.commit();
		if (count > 0) {
			System.out.println("���³ɹ�");
		} else {
			System.out.println("����ʧ��");
		}*/
		session.close();
	}
}
