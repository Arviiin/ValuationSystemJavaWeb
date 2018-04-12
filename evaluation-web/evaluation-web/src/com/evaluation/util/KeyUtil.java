package com.evaluation.util;

import java.util.UUID;

public class KeyUtil {

	/**
	 * 获取主键ID
	 * 
	 * @return String 主键
	 */
	public static String getId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

}
