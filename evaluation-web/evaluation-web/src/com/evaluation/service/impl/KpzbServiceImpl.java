package com.evaluation.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluation.dao.KhfjMapper;
import com.evaluation.dao.KpzbMapper;
import com.evaluation.entity.Khfj;
import com.evaluation.entity.Kpzb;
import com.evaluation.service.KpzbService;
import com.evaluation.view.KhfjView;
import com.evaluation.view.KpzbView;

/**
 * 考评指标业务逻辑接口实现
 * @author yaojie
 */
@Service
public class KpzbServiceImpl implements KpzbService {

	/** 考评指标数据访问接口 **/
	@Autowired
	private KpzbMapper kpzbMapper;
	
	@Autowired
	private KhfjMapper khfjMapper;
	
	/**
	 * 获取所有考核指标
	 * @return List<Kpzb> 考核指标集合
	 */
	@Override
	public List<KpzbView> getAllKhzb() {
		List<KpzbView> kpzbViews = new ArrayList<KpzbView>();
		List<Kpzb> kpzbList = kpzbMapper.getAllKhzb();
		for (Kpzb kpzb : kpzbList) {
			KpzbView kpzbView = new KpzbView();
			kpzbView.setId(kpzb.getId());
			kpzbView.setZbmc(kpzb.getZbmc());
			kpzbView.setFz(Integer.valueOf(kpzb.getFz()));
			kpzbView.setDeleteflag(kpzb.getDeleteflag());
			kpzbView.setCreatetime(kpzb.getCreatetime());
			kpzbView.setOpratetime(kpzb.getOpratetime());
			List<Khfj> khfjList = khfjMapper.getKhfjByKpzb(kpzb.getId());
			List<KhfjView> viewList = new ArrayList<KhfjView>();
			for (Khfj khfj : khfjList) {
				KhfjView view = new KhfjView();
				view.setId(khfj.getId());
				view.setSszbid(khfj.getSszbid());
				view.setFz(khfj.getFz());
				view.setFjnr(khfj.getFjnr());
				view.setDeleteflag(khfj.getDeleteflag());
				view.setCreatetime(khfj.getCreatetime());
				view.setOpratetime(khfj.getOpratetime());
				viewList.add(view);
			}
			kpzbView.setKhfjViews(viewList);
			kpzbViews.add(kpzbView);
		}
		return kpzbViews;
	}

	/**
	 * 插入考评指标
	 * @param kpzb 考评指标实体
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean insertKpzb(Kpzb kpzb) {
		int count = kpzbMapper.insertKpzb(kpzb);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 删除考评指标
	 * @param id 编号
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean deleteKpzb(String id) {
		int count = kpzbMapper.deleteKpzb(id);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 更新考评指标
	 * @param kpzb 考评指标实体
	 * @return boolean 成功或失败标识
	 */
	@Override
	public boolean updateKpzb(Kpzb kpzb) {
		int count = kpzbMapper.updateKpzb(kpzb);
		boolean flag = false;
		if (count > 0) {
			flag = true;
		}
		return flag;
	}

}
