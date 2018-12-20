package com.lotto.data.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotto.data.service.LottoService;

@RestController
public class LottoController {
	
	@Autowired
	private LottoService ls;
	
	@GetMapping("/lottos")
	public List<String> Lotto() throws IOException {
		return ls.getLottoList();
	}
}
