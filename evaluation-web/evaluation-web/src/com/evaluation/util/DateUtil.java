package com.evaluation.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtil {

	public static Map<String, String> getDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
		String dateStr = sdf.format(date);
		String[] dateArr = dateStr.split("-");
		Map<String, String> dateMap = new HashMap<String, String>();
		dateMap.put("year", dateArr[0]);
		dateMap.put("month", dateArr[1]);
		return dateMap;
	}
	
}
