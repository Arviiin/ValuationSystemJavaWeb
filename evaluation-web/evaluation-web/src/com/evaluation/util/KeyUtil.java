package com.evaluation.util;

import java.util.UUID;

public class KeyUtil {

	/**
	 * ��ȡ����ID
	 * 
	 * @return String ����
	 */
	public static String getId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

}
