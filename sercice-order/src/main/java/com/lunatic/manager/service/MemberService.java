package com.lunatic.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("unchecked")

@Service
public class MemberService {
	
	@Autowired
	private RestTemplate restTemplate;
	

	public List<String> getOrderByUserList() {
		return restTemplate.getForObject("http://service-member/getUserList", List.class);
	}	
}
