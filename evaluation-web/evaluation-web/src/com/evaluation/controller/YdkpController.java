package com.evaluation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.evaluation.service.KhjlService;
import com.evaluation.service.KpzbService;
import com.evaluation.service.UserService;
import com.evaluation.view.KhjlObject;
import com.evaluation.view.KpzbView;
import com.evaluation.view.UserParam;
import com.evaluation.view.UserView;

/**
 * �¶ȿ��˿�����
 * @author yaojie
 */
@Controller
@RequestMapping("evaluation/ydkp")
public class YdkpController {

	/** �û�ҵ���߼��ӿ� **/
	@Autowired
	private UserService userService;
	
	/** ����ָ��ҵ���߼��ӿ� **/
	@Autowired
	private KpzbService kpzbService;
	
	/** ���˼�¼ҵ���߼��ӿ� **/
	@Autowired
	private KhjlService khjlService;
	
	/**
	 * ��ȡ���������б�
	 * @param userParam �����������ʵ��
	 * @return ����������ͼ�б�
	 */
	@RequestMapping("getKpdx")
	@ResponseBody
	public List<UserView> getKpdx(@RequestBody UserParam userParam) {
		return userService.getKpdx(userParam);
	}
	
	/**
	 * ��ȡ����ָ��
	 * @return List<KpzbView> ����ָ����ͼ�б�
	 */
	@RequestMapping("getKpzb")
	@ResponseBody
	public List<KpzbView> getKpzb() {
		return kpzbService.getAllKhzb();
	}
	
	/**
	 * ���뿼�˼�¼��������˱�
	 * @param khjlParams ���˼�¼����ʵ�弯��
	 * @return �ɹ���ʧ�ܱ�ʶ
	 */
	@RequestMapping("insertKhjl")
	@ResponseBody
	public boolean insertKhjl(@RequestBody KhjlObject khjlObject, HttpServletRequest request) {
		UserView userView = (UserView)request.getSession().getAttribute("userInfo");
		khjlObject.setKhrid(userView.getId());
		khjlObject.setKhrxm(userView.getXm());
		return khjlService.insertKhjl(khjlObject);
	}
	
}
