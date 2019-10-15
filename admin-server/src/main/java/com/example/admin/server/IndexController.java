package com.example.admin.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	private Logger logger = LoggerFactory.getLogger(IndexController.class);

	public Object index(){
		logger.debug("測試測試測試");
		return ResponseEntity.ok("success");
	}
}
