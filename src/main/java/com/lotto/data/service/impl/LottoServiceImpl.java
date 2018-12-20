package com.lotto.data.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.lotto.data.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService {

	@Override
	public List<String> getLottoList() throws IOException {
		try {
			String url = "http://yojeum.dothome.co.kr/lotto/lt/lt_stat_wn.html?pg=1";
			String trEle = "table> tbody> tr";
			String lt_num = ".lt_num";
			Document doc = Jsoup.connect(url).get();
			Elements li = doc.select(trEle);
			for(int i = 1; i<=10; i++) {
				Elements times = li.select("tr:nth-child("+ i +") > td:nth-child(2)");
				System.out.println(times);
			}
			Elements nums = li.select(lt_num);
			System.out.println(nums);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
