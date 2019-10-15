package com.example.config.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class IndexController {

	private Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/")
	public Object index(){
		logger.info("測試測試測試");
		return ResponseEntity.ok("success");
	}
}
