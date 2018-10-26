package com.lunatic.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunatic.manager.service.MemberService;


@RestController
public class OrderController {
	
	@Autowired
	private MemberService MemberService;
	
	@RequestMapping("/getUserAll")
	public List<String> getOrder() {
		return MemberService.getOrderByUserList();
	}	
}
