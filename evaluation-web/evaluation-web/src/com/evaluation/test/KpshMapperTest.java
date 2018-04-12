package com.evaluation.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.evaluation.dao.KpshMapper;
import com.evaluation.util.MybatisUtil;
import com.evaluation.view.Score;

public class KpshMapperTest {

	public static void main(String[] args) throws IOException {
		
		SqlSession session = MybatisUtil.getSession();
		KpshMapper kpshMapper = session.getMapper(KpshMapper.class);
		
		/*double df = kpshMapper.getCurrentScore("2016", "8", "100004");
		System.out.println(df);*/
		
		List<Score> scores = kpshMapper.getScoreByYear("2016", "100004");
		for (Score score : scores) {
			System.out.println(score.getKhyf() + "," + score.getDf());
		}
	}

}
